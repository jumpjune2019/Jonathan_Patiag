package traffic;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	/*
	 * Special thanks go to Angela Leighton
	 * and Elbert Buchanan for assistance with the code beginnings
	 */
	
	public static void main(String[] args) throws IOException {
		System.out.println("Traffic Light Simulator is a go!!"); //starter message
		enterFunc();//calling the function
	}
	
	/*
	 * This function will set up the thread holding the enum lights
	 * It also sets up input, so when the user presses enter, 
	 * the functions stop
	 */
	synchronized static void enterFunc() {
			TrafficThread trafficlights = new TrafficThread("trafficlights"); //sets up thread
	        Scanner input = new Scanner(System.in); //set up input
	        String key = input.nextLine(); //input is collected here
	        //this loop will run while Enter is not pressed
	        while(key.equals("")) {
	        	/*
	        	 * Ends the thread if enter is pressed
	        	 * while nothing else has been pressed, 
	        	 * then breaks out of while
	        	 */
	            if (key.isEmpty()) {
	                System.out.println("Traffic Light Simulator is Done!");
	                trafficlights.lightstop();

	                break;
	            }

	            if (input.hasNextLine()) {
	                key = input.nextLine();
	            } else {
	                key = null;
	            }

	        }
	        /*releasing input, then exiting*/
	        input.close();
	        System.exit(0);
	    }
	}