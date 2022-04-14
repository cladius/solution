import java.io.*;
import java.util.*;

/**
 * 10 score Semi Final 2
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
		List<Integer> rows = stringToList(rows_string);
		List<Integer> columns = stringToList(columns_string);

		if (DEBUG) {
			System.out.println(rows);
			System.out.println(columns);
		}

		boolean possible = true;

		possible = preliminaryValidation(row_count, column_count, rows, columns);

		if (!possible) {
			return false;
		}

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

		if (DEBUG)
			System.out.println(rows.toString() + " , " + columns.toString());

		// Fill up the rows
		row_count = rows.size();
		column_count = columns.size();
		boolean matrix[][] = new boolean[row_count][column_count];

		int row_index, column_index, row_sum;
		for (row_index = 0; row_index < row_count; row_index++) {
			row_sum = rows.get(row_index);
			for (column_index = 0; column_index < column_count; column_index++) {
				if (column_index >= row_sum) {
					matrix[row_index][column_index] = false;
				} else {
					matrix[row_index][column_index] = true;
				}
			}
		}

		if (DEBUG)
			printMatrix(matrix, row_count, column_count);

		List<Integer> columnSums = calculateColumnSum(matrix, row_count, column_count);

		if (DEBUG)
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
		int row_count = rows.size();
		int column_count = columns.size();

		if (DEBUG)
			System.out.println("Min: " + rows.toString() + " , " + columns.toString());

		int index = 0, row, column;

		int full_rows = 0;
		int empty_rows = 0;

		int result = 0;

		List<Integer> minimized_rows = new ArrayList<>();
		List<Integer> minimized_columns = new ArrayList<>();

		for (; index < row_count; index++) {
			row = rows.get(index);
			if (row == 0)
				empty_rows++;
			else if (row == column_count)
				full_rows++;
			else if (row < 0 || row > column_count) {
				result = -1;
				break;
			} else
				minimized_rows.add(row);
		}

		// There was at least 1 full row, so we can reduce the column sum for each
		// column
		if ((full_rows > 0 || empty_rows > 0) && result != -1) {
			for (index = 0; index < column_count; index++) {
				column = columns.get(index);

				column -= full_rows;

				if (column < 0 || column > row_count) {
					result = -1;
					break;
				} else if (column > 0) {
					minimized_columns.add(column);
				}

				columns.set(index, column);
			}

			rows.clear();
			rows.addAll(minimized_rows);

			columns.clear();
			columns.addAll(minimized_columns);
		}

		if ((full_rows > 0 || empty_rows > 0) && result != -1) {
			minimize(rows, columns);
		}

		return result;
	}

	private static boolean preliminaryValidation(int row_count, int column_count, List<Integer> rows,
			List<Integer> columns) {
		int row_sum = 0; // calculateSum(rows);
		int column_sum = 0; // calculateSum(columns);
		int index = 0;
		int row, column;

		boolean isPossible = true;

		for (; index < row_count; index++) {
			row = rows.get(index);
			row_sum += row;

			if (row < 0 || row > column_count) {
				isPossible = false;
				break;
			}
		}

		for (index = 0; isPossible && index < column_count; index++) {
			column = columns.get(index);
			column_sum += column;

			if (column < 0 || column > row_count) {
				isPossible = false;
				break;
			}
		}

		if (row_sum != column_sum)
			isPossible = false;

		return isPossible;
	}

	private static int calculateSum(List<Integer> items) {
		int length = items.size();

		int sum = 0;
		for (int index = 0; index < length; index++) {
			sum += items.get(index);
		}

		return sum;
	}

	private static List<Integer> stringToList(String input_string) {
		String[] numbers = input_string.split(" ");
		
		int count = numbers.length;
		List<Integer> list = new ArrayList<Integer>();
		
		int index = 0;
		for(; index < count; index++) {
			list.add(Integer.parseInt(numbers[index]));
		}
		
		Collections.sort(list);
		Collections.reverse(list);

		return list;
	}
	
	private static List<Integer> stringToListOld(String input_string) {
		Scanner scanner = new Scanner(input_string);
		List<Integer> list = new ArrayList<Integer>();
		while (scanner.hasNextInt()) {
			list.add(scanner.nextInt());
		}

		Collections.sort(list);
		Collections.reverse(list);

		scanner.close();
		return list;
	}

}
