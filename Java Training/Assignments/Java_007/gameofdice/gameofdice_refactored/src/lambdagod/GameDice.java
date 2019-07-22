package lambdagod;

import java.util.Scanner;

public class GameDice {


	public static void main(String[] args) {
		
		/*
		 * This line makes a new Scanner object in order for its methods to be used.
		 */
		Scanner input = new Scanner(System.in); 
		System.out.println("Welcome to the Dice Game! Do you feel lucky, punk? Do ya???");
		System.out.println("Press any key to throw a die. Press Q to quit and chicken out."); //Scans for next input.
		String answer = input.nextLine();
		/*
		 * If either Q or q is pressed.....
		 */
		if(answer.equalsIgnoreCase("q")) {
			System.out.println("Oh well, see you later alligators!");
			System.exit(0);
		}
		
		/*
		 * initalises variables
		 */
		int xplay = 0, yplay = 0, xcomp = 0, ycomp = 0, sumplay = 0, sumcomp = 0;
		String[][] pair = new String[6][6]; // initialise the 2-d String array
		/*
		 * For the next few lines,
		 * we insert all labels inside the 2-D array
		 */
		pair[0][0] = "Snake Eyes";
		pair[0][1] = "Australian yo";
		pair[0][2] = "Little Jo from Komomo";
		pair[0][3] = "No field five";
		pair[0][4] = "Easy six";
		pair[0][5] = "Six one you're done";
		pair[1][0] = "Ace caught in a deuce";
		pair[1][1] = "Ballerina";
		pair[1][2] = "The fever";
		pair[1][3] = "Jimmie Hicks";
		pair[1][4] = "Benny Blue";
		pair[1][5] = "Easy eight";
		pair[2][0] = "Easy four";
		pair[2][1] = "OJ";
		pair[2][2] = "Brooklyn Forest";
		pair[2][3] = "Big Red";
		pair[2][4] = "Eighter from Decatur";
		pair[2][5] = "Nina from Pasadena";
		pair[3][0] = "Little Phoebe";
		pair[3][1] = "Easy six";
		pair[3][2] = "Skinny Mckinney";
		pair[3][3] = "Square pair";
		pair[3][4] = "Railroad nine";
		pair[3][5] = "Big one on the end";
		pair[4][0] = "Sixie from Dixie";
		pair[4][1] = "Skinny Dugan";
		pair[4][2] = "Easy eight";
		pair[4][3] = "Jesse James";
		pair[4][4] = "Puppy paws";
		pair[4][5] = "Yo";
		pair[5][0] = "The devil";
		pair[5][1] = "Easy eight";
		pair[5][2] = "Lou Brown";
		pair[5][3] = "Tennessee";
		pair[5][4] = "Six five no jive";
		pair[5][5] = "Midnight";
		//the random function in previous assignments is changed to a lambda expression
		GameInterface dieRoll = (a, b) -> (int)(Math.random()* ((b-1) + a)) + a;
		//this function tests the outcome of the two sums of the dice rolls of the player and the computer
		//only tests for >, <, and ==. Testing for doubles take place outside of the function
		CheckInterface check = (a, b) -> {
			if (a > b) {
				System.out.println("You win!!!");
			} else if (a < b) {
				System.out.println("I win!!!");
			} else if (a == b) {
				System.out.println("We tied, it seems.");
			}
		};
		/*
		 * Calls the lambda expression 4 times.
		 */
 		xplay = dieRoll.function(1, 6);
		yplay = dieRoll.function(1, 6);
		xcomp = dieRoll.function(1, 6);
		ycomp = dieRoll.function(1, 6);
		System.out.println("You have rolled a " +xplay+ " and " +yplay+ ", the " +pair[xplay-1][yplay-1]+ "!"); //results of rolls
		System.out.println("I have rolled a " +xcomp+ " and " +ycomp+ ", the " +pair[xcomp-1][ycomp-1]+ "!");
		sumplay = xplay + yplay;
		sumcomp = xcomp + ycomp;
		if((xplay == yplay) && (xcomp != ycomp) && sumplay == sumcomp) {
			System.out.println("You Win by a double! LUCKY!!!");
		} else if((xcomp == ycomp) && (xplay != yplay) && sumplay == sumcomp) {
			System.out.println("I Win by a double! TOO BAD!!!");
		} else {
			check.function(sumplay, sumcomp);
		}
		System.out.println("Play again?");
		answer = input.nextLine(); 
		
		/*
		 * While loop that continues as long as y or Y is entered
		 */
		while(answer.equalsIgnoreCase("Y")) {
			System.out.println("Ok, let's roll!");
			xplay = dieRoll.function(1, 6);
			yplay = dieRoll.function(1, 6);
			xcomp = dieRoll.function(1, 6);
			ycomp = dieRoll.function(1, 6);
			System.out.println("You have rolled a " +xplay+ " and " +yplay+ ", the " +pair[xplay-1][yplay-1]+ "!"); //results of rolls
			System.out.println("I have rolled a " +xcomp+ " and " +ycomp+ ", the " +pair[xcomp-1][ycomp-1]+ "!");
			sumplay = xplay + yplay;
			sumcomp = xcomp + ycomp;
			if((xplay == yplay) && (xcomp != ycomp) && sumplay == sumcomp) {
				System.out.println("You Win by a double! LUCKY!!!");
			}
			if((xcomp == ycomp) && (xplay != yplay) && sumplay == sumcomp) {
				System.out.println("I Win by a double! TOO BAD!!!");
			} else { //after the doubles have been checked, the lambad block is called
				check.function(sumplay, sumcomp);
			}
			System.out.println("Play again?");
			answer = input.nextLine(); 
		}
		input.close(); 
		System.out.println("Thanks for playing! See you later!");
	}
}
