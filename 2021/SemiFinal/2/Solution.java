import java.io.*;
import java.util.*;

/**
 * Semi Final 2 - Version 2 Score 20
 * 2 passed
 * 1 mismatch
 * 7 TLEs
 *
 * @author cladius_fernando
 *
 */
public class Solution {
//    static final boolean DEBUG = false;


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

    static final boolean DEBUG = true;

    private static int [][] roadCosts;
    private static Set<Integer> visitedNodes;
    private static int numberOfHouses;
    private static boolean keepVisiting = true;
    private static final String NOT_POSSIBLE = "NOT POSSIBLE";

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            //Read the number of houses and roads
            String input[] = reader.readLine().split(" ");
            numberOfHouses = parseInt(input[0]);
            int numberOfRoads = parseInt(input[1]);

            roadCosts = new int[numberOfHouses][numberOfHouses];
            visitedNodes = new HashSet<>();

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
        roadCosts[source][destination] = weight;
        roadCosts[destination][source] = weight;
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
            System.out.println(roadCosts[0][1]);
        else {
            //Let the calculations begin
            do {
                int houseIndex = findNextNodeToVisit();
                if (houseIndex != -1)
                    visit(houseIndex);
            } while (keepVisiting);

            int finalCost = roadCosts[0][numberOfHouses - 1];
            if (finalCost == 0)
                System.out.println(NOT_POSSIBLE);
            else
                System.out.println(finalCost);
        }
    }

    private static void visit(int houseIndex) {
        //Add house to visited set
        visitedNodes.add(houseIndex);
        int costFromRootToThisHouse = roadCosts[0][houseIndex];

        int currentCostFromRootToOtherHouse, newCostFromRootToOtherHouse, costFromThisHouseToOtherHouse;

        /*
         * Check if there is an edge from 'houseIndex' to any "other" houses
         * If cost(root, houseIndex) + cost (houseIndex, otherHouse) < cost(root, otherHouse) => set new min cost
         */
        for(int j = 0; j < numberOfHouses; j++){
            //If other house is already visited - skip
            if(visitedNodes.contains(j))
                continue;

            costFromThisHouseToOtherHouse = roadCosts[houseIndex][j];

            //If there is no route from this house to the other house
            if(costFromThisHouseToOtherHouse == 0)
                continue;

            costFromThisHouseToOtherHouse = costFromThisHouseToOtherHouse - costFromRootToThisHouse;
            if(costFromThisHouseToOtherHouse < 0)
                costFromThisHouseToOtherHouse = 0;

            currentCostFromRootToOtherHouse = roadCosts[0][j];

            newCostFromRootToOtherHouse = costFromRootToThisHouse + costFromThisHouseToOtherHouse;

            //Relax if possible
            if(currentCostFromRootToOtherHouse == 0 || newCostFromRootToOtherHouse < currentCostFromRootToOtherHouse)
                roadCosts[0][j] = newCostFromRootToOtherHouse;
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
        int houseIndex = 0;
        int minWeight = -1;
        int nextNode = -1;

        for(; houseIndex < numberOfHouses; houseIndex++){
            //If the node has already been visited - let's skip it.
            if(visitedNodes.contains(houseIndex)){
                continue;
            }

            int costFromRoot = roadCosts[0][houseIndex];
            //If there is no minWeight set so far or this weight is less than earlier selected minWeight
            //Also if costFromRoot == 0 => there is no path yet till this node from root.
            if(minWeight == -1 || (costFromRoot != 0 && costFromRoot < minWeight) ) {
                minWeight = costFromRoot;
                nextNode = houseIndex;
            }
        }

        if(nextNode == -1)
            keepVisiting = false;

        return nextNode;
    }


}
