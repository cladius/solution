import java.io.*;
import java.util.*;

/**
 * Semi Final 2 - Score 100
 * 
 * @author cladius_fernando
 *
 */
public class CandidateCodeSF2Final {

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
		
		String[] numbers = rows_string.split(" ");
		
		List<Integer> rows = new LinkedList<Integer>();
		
		int index = 0;
		int row = 0;
		int row_sum = 0;
		
		int empty_rows = 0;
		int full_rows = 0;
		
		for(; index < row_count; index++) {
			row = Integer.parseInt(numbers[index]);
			
			if(row == 0)
				empty_rows++;
			else if(row == column_count)
				full_rows++;
			
			row_sum += row;
			rows.add(row);
		}
		
		Collections.sort(rows, Collections.reverseOrder());
		
		//Now for the columns
		numbers = columns_string.split(" ");
		
		List<Integer> columns = new LinkedList<Integer>();
		
		index = 0;
		int column = 0;
		int column_sum = 0;
		
		int empty_columns = 0;
		int full_columns = 0;
		
		for(; index < column_count; index++) {
			column = Integer.parseInt(numbers[index]);
			
			if(column == 0)
				empty_columns++;
			else if (column == row_count)
				full_columns++;
			
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
		
		int max_row = rows.get(0);
		int min_row = rows.get(row_count - 1);

		int max_possible_row = column_count - empty_columns;
		if(max_row > max_possible_row) {
			return false;
		}
		
		int min_possible_row = full_columns;
		if(min_row < min_possible_row) {
			return false;
		}

		int max_column = columns.get(0);
		int min_column = columns.get(column_count - 1);

		int max_possible_column = row_count - empty_rows;
		if(max_column > max_possible_column) {
			return false;
		}

		int min_possible_column = full_rows;
		if(min_column < min_possible_column) {
			return false;
		}

		return true;
	}

}
