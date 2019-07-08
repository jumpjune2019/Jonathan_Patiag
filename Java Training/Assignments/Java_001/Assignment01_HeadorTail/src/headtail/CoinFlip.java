package headtail;

public class CoinFlip {
	
	/*This function returns a random number between the min and max.
	 * This includes the minimum and maximum values
	 */
	
	public static int coinFlip(int min, int max) {
		//the addition of the min is to ensure the min and max are included
		return (int)(Math.random() * ((max - min) + 1)) + min; 
	}
	
	public static void main(String[] args) {
		System.out.println("Coin Flip Program");
		int min = 1; //initialise min value
		int max = 2; //initialise max value
		int i = coinFlip(min, max); //calls the flip function
		/*The next lines determine what happens based on the 
		 * results of the coinFlip function. 1 = heads, and 2 = tails
		 */
		String result;
		if (i == 1) { 
			result = "Head";
			System.out.println("The Coin Flip is: " + result);
		} else if (i == 2) {
			result = "Tails";
			System.out.println("The Coin Flip is: " + result);
		}
	}

}