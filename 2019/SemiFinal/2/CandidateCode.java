import java.io.*;
import java.util.*;

/**
 * Score 0 -Semi Final 2
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

		int minimize_result = 0;

		minimize_result = minimize(rows, columns);
		// If minimize_result !=0, then some error has occurred.
		if (minimize_result != 0) {
			return false;
		}

		/*
		// Transpose and minimize
		minimize_result = minimize(columns, rows);
		// If minimize_result !=0, then some error has occurred.
		if (minimize_result != 0) {
			return false;
		}*/
		
		return true;
	}

	private static int minimize(List<Integer> rows, List<Integer> columns) {
		int column_count = columns.size();
		int row_count = rows.size();
		
		if (DEBUG)
			System.out.println("Min: " + rows.toString() + " , " + columns.toString());

		int row, column;

		int full_rows = 0;
		int empty_columns = 0;
		int empty_rows = 0;
		
		int result = 0;
		
		boolean minimification_done = false;
		
		//Short circuit: if the max elements in both rows and columns is 0, then
		//all the elements are zero. No further need to process.
		if(rows.get(0) == 0 && columns.get(0) == 0) {
			return result;
		}
		
		//Short circuit: TODO evaluate this
		if(row_count == column_count) {
			if (rows.equals(columns)) 
				return 0;
		}
		
		int index = 0;
		//Find the zero columns count.
		for(index = (column_count - 1); index >= 0 ; index--) {
			column =  columns.get(index);
			if(column == 0) {
				empty_columns++;
			}else {
				break;
			}
		}
		
		int max_row_sum_possible = column_count - empty_columns;
		
		//Now check the max column value
		index = 0;
		//Find the zero rows count.
		for(index = (row_count - 1); index >= 0 ; index--) {
			row =  rows.get(index);
			if(row == 0) {
				empty_rows++;
			}else {
				break;
			}
		}

		int max_column_sum_possible = row_count - empty_rows;
		
		//NOTE: this change failed all the test cases
		if(columns.get(0) > max_column_sum_possible) {
			return -1;
		}
		
		//Iterate over the rows and find all the full rows and remove them from the list 
		ListIterator<Integer> rows_iterator =  rows.listIterator();
		while(rows_iterator.hasNext()) {
			row = rows_iterator.next();
			
			//If the row value is more than the permissible max value, then return with -1
			if (row > max_row_sum_possible) {
				result = -1;
				break;
			} else if(row == max_row_sum_possible) {
				//Delete the full row elements from the list and increment the full rows count.
				full_rows++;
				rows_iterator.remove();
				minimification_done = true;
			} else {
				//If the current element is lesser than the column count 
				break;
			}
		}

		
		// There was at least 1 full row, so we need to reduce the column 
		// sum for each column
		if (full_rows > 0 && result == 0) {
			ListIterator<Integer> columns_iterator = columns.listIterator();
			
			while(columns_iterator.hasNext()) {
				column = columns_iterator.next();
				
				//If this was a zero column, let's remove it.
				if(column == 0) {
					columns_iterator.remove();
				}else {
					//Decrement the value of each non-zero column to be in sync with the deleted full rows
					column -= full_rows;
	
					if (column < 0) {
						result = -1;
						break;
					} else {
						columns_iterator.set(column);
					}
				}
			}
		}

		if (minimification_done && result == 0) {
			//result = minimize(rows, columns);
			result = minimize(columns, rows);
		}

		return result;
	}

}
