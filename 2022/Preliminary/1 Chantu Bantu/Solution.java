package gift;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * Solution Code
 *
 * @author cladius_fernando
 *
 * Score 100
 *
 */
public class Solution {

	static final boolean DEBUG = false;

	public static void main(String[] args) throws Exception {
		try {
			String input;

			int minGifts, totalGifts;
			List<Integer> giftCosts;

			// Read the input from CLI
			if(!DEBUG) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				input = reader.readLine();
				
				int numberOfTestCases = Integer.parseInt(input);
				
				String outputs [] = new String[numberOfTestCases];
				
				for(int i = 0; i < numberOfTestCases ; i++) {
					input = reader.readLine();
					minGifts = Integer.parseInt(input);
					
					input = reader.readLine();
					totalGifts = Integer.parseInt(input);
					
					input = reader.readLine();
					giftCosts = convertStrToIntArr(input, totalGifts);
					
					outputs[i] = processTestCase(minGifts, totalGifts, giftCosts);
				}
				
				for(int i = 0; i < numberOfTestCases ; i++) {
					System.out.println(outputs[i]);
				}
				
				/*
2
3
8
50 70 30 100 80 20 150 10
4
6
10 20 32 412 500 11
				 */
				
			}else {
//				input = "3 4 5";
			}
			
//			System.out.println(execute(input));

		} catch (Exception e) {
			System.out.println("ERROR");
		}
	}

	private static List<Integer> convertStrToIntArr(String input, int size) {
		String inputStr [] = input.split(" ");
		List<Integer> intList = new ArrayList<>(size);
		for(int i = 0; i < size; i++) {
			intList.add(Integer.parseInt(inputStr[i]));
		}
		return intList;
	}

	public static int execute(String input) {
		
//		int output = processTestCase(numbers);
		
		return 1;
	}

	public static String processTestCase(int minGifts, int totalGifts, List<Integer> giftCosts) {
		BigInteger minMoney = BigInteger.ZERO;
		
		Collections.sort(giftCosts);
		
		for(int i = 0; i < minGifts; i++) {
			minMoney = minMoney.add(BigInteger.valueOf(giftCosts.get(i)));
		}
		
		return minMoney.toString();
	}
}
