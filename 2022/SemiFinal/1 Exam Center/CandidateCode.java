package missingrooms;
/* Read input from STDIN. Print your output to STDOUT*/

//Score 100/100

import java.io.*;
import java.util.*;
public class CandidateCode {
   static final boolean DEBUG = false;
	static int[] rooms = new int [1300];

	public static void main(String[] args) throws Exception {
		try {
			String input;
			
			prepareRooms();
			
			if(DEBUG) {
				for(int i =0; i< 20; i++)
					System.out.print(rooms[i] + " ");
			}

			// Read the input from CLI
			if(!DEBUG) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				input = reader.readLine();
			}else {
				input = "16";
			}
			
			System.out.println(execute(input));

		} catch (Exception e) {
			System.out.println("ERROR");
		}
	}

	
	/*
	 * Prepare the rooms in advance
	 */
	private static void prepareRooms() {
		int currentRoomIndex = 0; 
		for(int i = 1; i < 1955; i++) { //Ran the max input of 1300 and determined this number
			if(roomOk(i))
				rooms[currentRoomIndex++] = i;
		}
	}

	private static boolean roomOk(int roomNum) {
		String room = roomNum + "";
		if(room.contains("2") || room.contains("14"))
			return false;
		else
			return true;
	}


	public static int execute(String input) {
		return processTestCase(Integer.parseUnsignedInt(input));
	}

	

	public static int processTestCase(int input) {
		return rooms[input - 1];
	}
}
