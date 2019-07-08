package pairofdice;

import java.util.Scanner; //imports the package needed for input

public class pairDice {
	
	/*
	 * This function will return a random number between the min and max, including min and max.
	 */
	public static int dieRoll(int min, int max) {
		return (int)(Math.random() * ((max - min) + 1)) + min;
	}

	public static void main(String[] args) {
		/*
		 * This line makes a new Scanner object in order for its methods to be used.
		 */
		Scanner input = new Scanner(System.in); 
		System.out.println("Press any key to throw a die. Press Q to quit."); //Scans for next input.
		String answer = input.nextLine();
		/*
		 * If either Q or q is pressed.....
		 */
		if(answer.equals("Q") || answer.equals("q")) {
			System.out.println("Error!");
			System.exit(0);
		}
		/*
		 * initalises variables
		 */
		int min = 1;
		int max = 6;
		int x = 0;
		int y = 0;
		x = dieRoll(min, max); //call to dieRoll function
		y = dieRoll(min, max); //second call for second die
		System.out.println("You rolled the following: " + x + " + " + y); //results of rolls
		System.out.println("Play again?");
		answer = input.nextLine(); // input
		/*
		 * While loop that continues as long as y or Y is entered
		 */
		while(answer.equals("y") || answer.equals("Y")) {
			x = dieRoll(min, max);
			y = dieRoll(min, max);
			System.out.println("You rolled the following: " + x + " + " + y);
			System.out.println("Play again?");
			answer = input.nextLine();
		}
		input.close();
		System.out.println("Bye now!"); //if anything other than y or Y is pressed
	}	
}