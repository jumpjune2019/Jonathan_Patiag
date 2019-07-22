package lambdaht;

import java.util.Scanner;

public class CoinFlip {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the game of Head or Tail where you will flip your life away!");
		Scanner input = new Scanner (System.in);
		String key = "";
		System.out.println("Press the F Key and flip your luck!");
		key = input.nextLine();
		if(!key.equals("F") && !key.equalsIgnoreCase("q")) {
			System.out.println("Wrong key!");
			System.exit(-1);
		}
		String result = "";
		while(key.equals("F")) {
			//the random function implemented in the original is placed here as a lambda expression
			FunctionalCF coinFlip = (min, max) -> (int)(Math.random()* ((max-1) + min)) + min;
			int end = coinFlip.function(1, 2);
			//the compare functions for determing heads or tails are brought up here as lambda expressions
			CFFunc compare1 = (n) -> n == 1;
			CFFunc compare2 = (n) -> n == 2;
			if(compare1.func(end)) {
				result = "heads";
			}
			
			if(compare2.func(end)) {
				result = "tails";
			}
			
	 		/*The next lines determine what happens based on the 
			 * results of the coinFlip function. 1 = heads, and 2 = tails
			 */
			System.out.println("The Coin Flip is: " + result);
			System.out.println("Press the F key to try again, or Q or q to quit!");
			key = input.nextLine();
			if(!key.equals("F") && !key.equalsIgnoreCase("q")) {
				System.out.println("Wrong key!");
				System.exit(-1);
			}
			if(key.equalsIgnoreCase("q")) {
				break;
			}
		}
		System.out.println("Thank you for playing!");
		input.close();
	}
}