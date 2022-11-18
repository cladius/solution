package agniveer;

/**
 * Solution Code for Agniveer - TG Finale Prob 2
 *
 * @author cladius_fernando
 * Score ??
 * 
 */
/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;


public class CandidateCode {
    static final boolean DEBUG = true;
   
    static int maxTotalCost = 0;
   
	public static void main(String[] args) throws Exception {
		try {
			// Read the input from CLI
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				
			processTestCase(reader);
		} catch (Exception e) {
		}
	}

	private static void processTestCase(BufferedReader reader) {
		String input;
		try {
			//Read P and S
			input = reader.readLine();
			String inputs[];
			inputs = input.split(" ");
			int P = Integer.parseUnsignedInt(inputs[0]);
			int S = Integer.parseUnsignedInt(inputs[1]);
			
			//Read num of Criminals
			input = reader.readLine();			
			int N = Integer.parseUnsignedInt(input);
			
			//Read Ti of Criminals
			input = reader.readLine();
			inputs = input.split(" ");
			int length = inputs.length;
			
			//Read Li of Criminals
			input = reader.readLine();
			String lInputs[] = input.split(" ");
			
			//Reverse self-ordering map. Because we will start with the highest time stage first.
			Map<Integer,Set<Integer>> timeMap = new TreeMap<Integer, Set<Integer>>(Collections.reverseOrder());
			
			for(int i = 0; i < length; i++) {
				addEntry(timeMap, inputs[i], lInputs[i]);
			}
			
			//Mark Agniveer's position at t=0
			addEntry(timeMap, "0", "" + P);
			
			if(DEBUG)
				System.out.println(timeMap.toString());
			
			Map<Integer, Integer> costMap = new HashMap<Integer, Integer>();
			
			startProcessing(timeMap, costMap, P, S);
			
			if(DEBUG)
				System.out.println(costMap.toString());
			
			System.out.println(N - maxTotalCost);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	/*
	 * timeMap = time level stages mapped to positions
	 * 
	 * costMap = max costs for each position
	 * 
	 * p = starting position of Agniveer
	 * 
	 * s = speed of Agniveer
	 * 
	 * maxTime = highest time level stage
	 */
	private static void startProcessing(Map<Integer, Set<Integer>> timeMap,
			Map<Integer, Integer> costMap, int p, int s) {
		
		/*
		 * Start from the highest time level stage and then work your way downwards
		 * towards Agniveer.
		 */
		Set<Integer> timeStages = timeMap.keySet();
		
		Set<Integer> prevStages = new HashSet<Integer>();
		
		for (Iterator<Integer> iterator = timeStages.iterator(); iterator.hasNext();) {
			Integer stage = iterator.next();
			
			if(stage == 0)
				break;
			
			//Get the nodes at this time-stage
			Set<Integer> nodesAtStage = timeMap.get(stage);
			
			if(nodesAtStage != null) {
				//Iterate over these nodes
				for (Integer node : nodesAtStage) {
					if(feasible(p, node, stage, s)) {
						//This is the last level, consider cost as 1
						if(prevStages.isEmpty()) {
							recordCost(node, 1, costMap);
							
						}else {
							/*
							 * check max of higher stages, as long as it's
							 * feasible to get to the higher stage from this node
							 */
							int maxCost = 0;
							
							for(Integer prevStage : prevStages) {
								
								Set<Integer> nodesAtPrevStage = timeMap.get(prevStage);
								if(nodesAtPrevStage != null) { //Is this check needed??
									
									/*
									 * If it's possible to get to this node from the starting
									 * position of Agniveer, then count as 1.
									 */
									if(feasible(p, node, stage, s)) {
										/*
										 * Set to 1, since at least if this node is reachable
										 * cost should be 1.
										 */
										int newMaxCost = 1;
		
										for (Iterator<Integer> iterator2 = nodesAtPrevStage.iterator(); iterator2.hasNext();) {
											Integer prevStageNode = iterator2.next();
											
											/*
											 * Check if it's feasible to get to this prev stage node
											 * from the current node in the mentioned time diff
											 * with the mentioned speed
											 */
											if( feasible(node, prevStageNode, prevStage - stage, s) ) {
												/*
												 * Count the current node + the max cost already calculated
												 * for the prev stage node
												 */
												newMaxCost = 1 + costMap.get(prevStageNode);
											}

											if(newMaxCost > maxCost)
												maxCost = newMaxCost;
										}
									}									
								}
								
								//Set maxCost as the cost for the current node
								recordCost(node, maxCost, costMap);
							}
						}
					}else {
						recordCost(node, 0, costMap);
					}
				}
			}
			
			//Add this stage to the prevStages set
			prevStages.add(stage);
		}
	}

	private static void recordCost(int node, int cost, Map<Integer, Integer> costMap) {
		costMap.put(node, cost);
		if(cost > maxTotalCost)
			maxTotalCost = cost;
	}

	/*
	 * Check if it is possible to reach destination from source in t mins at speed s
	 */
	private static boolean feasible(int source, int destination, int t, int s) {
		return (s * t >= Math.abs(destination-source));
	}

	private static void addEntry(Map<Integer, Set<Integer>> timeMap, String timeInput, String positionInput) {
		int time = Integer.parseInt(timeInput);
		int position = Integer.parseInt(positionInput);
		
		Set<Integer> set = timeMap.get(time);
		//If no set exists, let's create one
		if(set == null) {
			set = new HashSet<Integer>();
			timeMap.put(time, set);
		}
		
		//Add the new position at that time position
		set.add(position);
	}


}
