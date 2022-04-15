import java.io.*;
import java.util.*;

/**
 * Semi Final 2 - Version 5 Score 70
 *
 * Used boolean array for visited nodes as opposed to Set of nodes
 *
 * @author cladius_fernando
 *
 */
public class Solution {

    /*
5 5
1 2 30
1 3 10
2 5 40
3 4 20
4 5 30

4 3
1 2 10
3 2 20
1 3 5

     */

//    static final boolean DEBUG = false;
    static final boolean DEBUG = true;

    private static Map<Integer, Map<Integer, Integer>> roadCosts;
    private static boolean [] visitedNodes;
    private static int numberOfHouses;
    private static boolean keepVisiting = true;
    private static final String NOT_POSSIBLE = "NOT POSSIBLE";
    private static PriorityQueue<Edge> rootHouseNeighbors;

    /*
     * To use with the Q.
     * houseIndex => the destination
     * weight => cost to reach that destination from rootHouse
     */
    static class Edge{
        public Edge(int houseIndex, int weight) {
            this.houseIndex = houseIndex;
            this.weight = weight;
        }

        public int houseIndex, weight;
    }

    static class EdgeComparator implements Comparator<Edge>{

        @Override
        public int compare(Edge o1, Edge o2) {
            return o1.weight - o2.weight;
        }
    }

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            //Read the number of houses and roads
            String input[] = reader.readLine().split(" ");
            numberOfHouses = parseInt(input[0]);
            int numberOfRoads = parseInt(input[1]);

            roadCosts = new HashMap<>();
            visitedNodes = new boolean[numberOfHouses];
            rootHouseNeighbors = new PriorityQueue<>(new EdgeComparator()); //Need to create with some initialCapacity?

            for(int i = 0; i < numberOfRoads; i++) {
                input = reader.readLine().split(" ");
                addRoad(parseInt( input[0]), parseInt(input[1]), parseInt(input[2]) );
            }

            processTestCase(numberOfHouses);

        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }

    private static void addRoad(int source, int destination, int weight) {
        //Since indices start with 0 and not 1, decrementing source and destination
        source--;
        destination--;

        addEdge(source, destination, weight);
        addEdge(destination, source, weight);
    }

    private static void addEdge(int source, int destination, int weight) {
        Map<Integer, Integer> edges = roadCosts.get(source);
        if(edges == null) {
            edges = new LinkedHashMap<>();
            roadCosts.put(source, edges);
        }

        //If adding for source as 0, insert in Priority Q
        if(source == 0){
            rootHouseNeighbors.add(new Edge(destination, weight));
        }

        edges.put(destination, weight);
    }

    private static int parseInt(String s) {
        return Integer.parseInt(s);
    }

    private static void processTestCase(int numberOfHouses) {

        //If there is just 1 house - there is no cost
        if(numberOfHouses == 1)
            System.out.println(0);
            //If there are just 2 houses then use the road cost.
        else if(numberOfHouses == 2)
            System.out.println(getRoadCost(0, 1));
        else {
            //Let the calculations begin
            do {
                int houseIndex = findNextNodeToVisit();
                if (houseIndex != -1)
                    visit(houseIndex);
            } while (keepVisiting);

            int finalCost = getRoadCost(0, numberOfHouses - 1);
            if (finalCost == 0)
                System.out.println(NOT_POSSIBLE);
            else
                System.out.println(finalCost);
        }
    }

    private static int getRoadCost(int source, int destination){
        Map<Integer, Integer> roads = roadCosts.get(source);
        Integer cost;
        if(roads != null) {
            cost = roads.get(destination);
            if(cost != null)
                return cost;
        }
        return 0; //Should it be this?
    }

    private static void visit(int houseIndex) {
        //Add house to visited set
        visitedNodes[houseIndex] = true;
        int costFromRootToThisHouse = getRoadCost(0, houseIndex);

        int currentCostFromRootToOtherHouse, newCostFromRootToOtherHouse, costFromThisHouseToOtherHouse;

        /*
         * Check if there is an edge from 'houseIndex' to any "other" houses
         * If cost(root, houseIndex) + cost (houseIndex, otherHouse) < cost(root, otherHouse) => set new min cost
         *
         */
        for(int j = 0; j < numberOfHouses; j++){
            //If other house is already visited - skip
            if(visitedNodes[j])
                continue;

            costFromThisHouseToOtherHouse = getRoadCost(houseIndex, j);

            //If there is no route from this house to the other house
            if(costFromThisHouseToOtherHouse == 0)
                continue;

            costFromThisHouseToOtherHouse = costFromThisHouseToOtherHouse - costFromRootToThisHouse;
            if(costFromThisHouseToOtherHouse < 0)
                costFromThisHouseToOtherHouse = 0;

            currentCostFromRootToOtherHouse = getRoadCost(0, j);

            newCostFromRootToOtherHouse = costFromRootToThisHouse + costFromThisHouseToOtherHouse;

            //Relax if possible
            if(currentCostFromRootToOtherHouse == 0 || newCostFromRootToOtherHouse < currentCostFromRootToOtherHouse)
                addEdge(0, j, newCostFromRootToOtherHouse);
        }

        //Check if visited house is the last house?
        if(houseIndex == numberOfHouses - 1){
            keepVisiting = false;
        }
    }

    /*
     * Find the node with least cost - and which is not already visited.
     */
    private static int findNextNodeToVisit() {
        //Poll the Q
        Edge nextNode = rootHouseNeighbors.poll();

        if(nextNode == null) {
            keepVisiting = false;
            return -1;
        }else
            return nextNode.houseIndex;
    }


}
