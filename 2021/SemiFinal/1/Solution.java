import java.io.*;
import java.util.*;

/**
 * Semi Final 1 - Version 3 Score 100 
 *
 * @author cladius_fernando
 *
 */
public class Solution {

//	static final boolean DEBUG = true;
    static final boolean DEBUG = false;

	public static void main(String[] args) throws Exception {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			//Read the number of packets
			String input = reader.readLine();
			int test_case_count = Integer.parseUnsignedInt(input);

			int test_case_index = 0;
			long packetSize;
			long totalMoves = 0;

			input = reader.readLine();
			String[] packetSizes = input.split(" ");

			for (; test_case_index < test_case_count; test_case_index++) {
				packetSize = Long.parseLong(packetSizes[test_case_index]);
				totalMoves += processTestCase(packetSize);
			}
			System.out.println(totalMoves);

		} catch (Exception e) {
			System.out.println("ERROR");
		}
	}

	private static long processTestCase(long packetSize) {
		if(packetSize == 1L)
			return 1L;
		return calculateMoves(packetSize);
	}


	private static long calculateMoves(long number) {
		List<Long> divisors = getDivisors(number);
		if(DEBUG)
			System.out.println(divisors);
		int size = divisors.size();
		int i = size - 1;
		long moves = 1;

		long lastProduct = 1;

		for (; i > 0; i--) {
			lastProduct = lastProduct * divisors.get(i);
			moves += lastProduct;
		}

		if(DEBUG)
			System.out.println(moves + number);
		return moves + number;
	}

	private static List<Long> getDivisors(long number) {
		List<Long> divisors = new ArrayList<>();

		long maxLimit = number / 2 + 1;

		long divisor = 2;
		for (; divisor < maxLimit; ) {
			//If the number is divisible then divide and reset the var
			if (number % divisor == 0 && number != divisor) {
				divisors.add(divisor);
				number = number / divisor;
				maxLimit = number / divisor + 1;
			} else {
				divisor++;
				maxLimit = number / divisor + 1;
			}
		}

		divisors.add(number);

		return divisors;
	}


}
