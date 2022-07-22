package spaceship;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Solution Code
 *
 * @author cladius_fernando
 *
 * Score 100
 */
public class Solution {

	static final boolean DEBUG = false;

	public static void main(String[] args) throws Exception {
		try {
			String inputs[] = new String[2];

			// Read the input from CLI
			if(!DEBUG) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				inputs[0] = reader.readLine();
				inputs[1] = reader.readLine();
			}else {
				inputs[0] = "19 50";
				inputs[1] = "02 20";
			}
			
			System.out.println(execute(inputs));

		} catch (Exception e) {
			System.out.println("ERROR");
		}
	}

	public static String execute(String[] inputs) {
		return processTestCase(inputs);
	}

	private static int[] getNumbersFromString(String input) {
		String[] splits = input.split(" ");
		int [] numbers = new int[splits.length];
		int length = splits.length;
		for (int i = 0; i < length; i++) {
			numbers[i] = Integer.parseInt(splits[i]);
		}
		return numbers;
	}

	public static String processTestCase(String[] inputs) {
		String output;
		
		//parse first input as a timestamp
		String launchDate = "2022-03-31 " + inputs[0];    
          
        // create instance of the SimpleDateFormat that matches the given date  
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH mm");  
          
        //create instance of the Calendar class and set the date to the given date  
        Calendar cal = Calendar.getInstance();  
        try {
			cal.setTime(sdf.parse(launchDate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
        // adding the hours and minutes
        String hhMM[] = inputs[1].split(" ");
        
        cal.add(Calendar.HOUR, Integer.parseInt(hhMM[0]) );
        cal.add(Calendar.MINUTE, Integer.parseInt(hhMM[1]));
        
        //System.out.println(dateAfter);
	
		//Extract hh mm portion and return as output
        int hours = cal.get(Calendar.HOUR_OF_DAY);
        String hoursStr;
        
        if(hours < 10)
        	hoursStr = "0" + hours;
        else
        	hoursStr = "" + hours;
        
        int minutes = cal.get(Calendar.MINUTE);
        String minutesStr;
        
        if(minutes < 10)
        	minutesStr = "0" + minutes;
        else
        	minutesStr = "" + minutes;

        output = hoursStr + " " + minutesStr;
		
		return output;
	}
}
