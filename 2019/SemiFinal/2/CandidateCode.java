import java.io.*;
import java.util.*;

/**
 * Score 40 for Semi Final 2
 * 
 * @author cladius_fernando
 *
 */
public class CandidateCode {

//	static final boolean DEBUG = true;
	static final boolean DEBUG = false;

	public static void main(String[] args) throws Exception {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			String input = reader.readLine();
			int test_case_count = Integer.parseUnsignedInt(input);

			int test_case_index = 0;
			int row_count, column_count;
			String rows, columns;
			for (; test_case_index < test_case_count; test_case_index++) {
				input = reader.readLine();
				String[] counts = input.split(" ");
				row_count = Integer.parseUnsignedInt(counts[0]);
				column_count = Integer.parseUnsignedInt(counts[1]);

				input = reader.readLine();
				rows = input;

				input = reader.readLine();
				columns = input;

				boolean possible = processTestCase(row_count, column_count, rows, columns);
				String result = (possible) ? "YES" : "NO";
				System.out.println(result);
			}
		} catch (Exception e) {
			System.out.println("ERROR");
		}
	}

	private static boolean processTestCase(int row_count, int column_count, String rows_string, String columns_string) {
		
		//Can expand function here to calculate sum and get list in just 1 iteration
		/*
		List<Integer> rows = stringToList(rows_string);
		List<Integer> columns = stringToList(columns_string);
		*/
		
		String[] numbers = rows_string.split(" ");
		
		List<Integer> rows = new LinkedList<Integer>();
		
		int index = 0;
		int row = 0;
		int row_sum = 0;
		for(; index < row_count; index++) {
			row = Integer.parseInt(numbers[index]);
			row_sum += row;
			rows.add(row);
		}
		
		Collections.sort(rows, Collections.reverseOrder());
		
		//Now for the columns
		//TODO use stringtokenizer
		numbers = columns_string.split(" ");
		
		List<Integer> columns = new LinkedList<Integer>();
		
		index = 0;
		int column = 0;
		int column_sum = 0;
		for(; index < column_count; index++) {
			column = Integer.parseInt(numbers[index]);
			column_sum += column;
			columns.add(column);
		}
		
		if (row_sum != column_sum)
			return false;

		Collections.sort(columns, Collections.reverseOrder());

		if (DEBUG) {
			System.out.println(rows);
			System.out.println(columns);
		}

		boolean possible = true;

		int minimize_result = 0;

		minimize_result = minimize(rows, columns);
		// If minimize_result !=0, then some error has occurred.
		if (minimize_result != 0) {
			return false;
		}

		// Transpose and minimize
		minimize_result = minimize(columns, rows);
		// If minimize_result !=0, then some error has occurred.
		if (minimize_result != 0) {
			return false;
		}
		
		//Solved owing to simplistic matrix
		if (rows.size() == 0 || rows.size() == 1) {
			return true;
		}

		/*
		if (DEBUG)
			System.out.println(rows.toString() + " , " + columns.toString());

		List<Integer> columnSums = new ArrayList<>(column_count);
		
		for(index = 0; index < column_count; index++) {
			columnSums.add(row_count);
		}
		
		int column_index, difference;
		for(index = 0; index < row_count; index++) {
			difference = column_count - rows.get(index);
			column_index = 0;
			
			for(column_index = (column_count - difference); column_index < column_count; column_index++) {
				columnSums.set(column_index, columnSums.get(column_index) - 1);
			}
		}
		
		if(DEBUG)
			System.out.println(columnSums.toString());

		// Check if the initial configuration matches the column count
		if (columns.equals(columnSums)) {
			return true;
		}

		possible = compareDesiredAndActual(columns, columnSums, row_count, column_count);
		
		if(!possible)
			return false;

			// Shuffle each row from top to bottom and after each shift check the column
			// count
			// shuffle();
//				possible = false;
 * 
 * 
 */
		return true;
	}

	private static boolean compareDesiredAndActual(List<Integer> columns, List<Integer> columnSums, int row_count,
			int column_count) {
		int column_index = 0;

		int total_difference = 0;
		int difference = 0;
		for (; column_index < column_count; column_index++) {
			difference = columnSums.get(column_index) - columns.get(column_index);
			if (difference > 0) {
				total_difference += difference;
			}
		}

		if (total_difference > row_count)
			return false;
		else
			return true;
	}

	private static List<Integer> calculateColumnSum(boolean[][] matrix, int row_count, int column_count) {
		List<Integer> columnSums = new ArrayList<>();

		int row_index, column_index, column_sum;
		for (column_index = 0; column_index < column_count; column_index++) {
			column_sum = 0;
			for (row_index = 0; row_index < row_count; row_index++) {
				if (matrix[row_index][column_index])
					column_sum++;
			}
			columnSums.add(column_sum);
		}

		return columnSums;
	}

	private static void printMatrix(boolean[][] matrix, int row_count, int column_count) {
		int row_index, column_index;
		for (row_index = 0; row_index < row_count; row_index++) {
			System.out.println();
			for (column_index = 0; column_index < column_count; column_index++) {
				System.out.print(matrix[row_index][column_index] + " ");
			}
		}
		System.out.println();
	}

	private static int minimize(List<Integer> rows, List<Integer> columns) {
		int column_count = columns.size();
		int row_count = rows.size();
		
		if (DEBUG)
			System.out.println("Min: " + rows.toString() + " , " + columns.toString());

		int row, column;

		int full_rows = 0;
		int empty_rows = 0;

		int result = 0;
		
		ListIterator<Integer> rows_iterator =  rows.listIterator();
		while(rows_iterator.hasNext()) {
			row = rows_iterator.next();
			
			if (row == 0) {
				empty_rows++;
				rows_iterator.remove();
			} else if (row == column_count) {
				full_rows++;
				rows_iterator.remove();
			} else if (row < 0 || row > column_count) {
				result = -1;
				break;
			}			
		}
		
		// There was at least 1 full row, so we can reduce the column sum for each
		// column
		if ((full_rows > 0 || empty_rows > 0) && result != -1) {
			
			ListIterator<Integer> columns_iterator = columns.listIterator();
			
			while(columns_iterator.hasNext()) {
				column = columns_iterator.next();

				column -= full_rows;

				if (column < 0 || column > row_count) {
					result = -1;
					break;
				} else if (column == 0) {
					columns_iterator.remove();
				}else
					columns_iterator.set(column);
			}			
		}

		if ((full_rows > 0 || empty_rows > 0) && result != -1) {
			minimize(rows, columns);
		}

		return result;
	}

}
