package headtailtally;

public class HeadTailTally {
	
	/*This function returns a random number between the min and max.
	 * This includes the minimum and maximum values
	 */
	
	public static int coinFlip(int min, int max) {
		return (int)(Math.random() * ((max - min) + 1)) + min;
	}
	
	public static void main(String[] args) {
		System.out.println("1000 Coin Flips");
		int min = 1; //initialise min value
		int max = 2; //initialise max value
		int i = 0, j = 0, k = 0; //initialise other values
		int tallyArray[] = new int[2]; //creating a new array with size 2
		
		/*The next few statements loop 1000 times
		 * Depending on the outcome of the coinflip function,
		 * tallies are added to either the first or second index.
		 * 1 adds to the head index (0)
		 * 2 adds to the tails index (1)
		 */
		for (i = 0; i < 1000; i++) { 
			j = coinFlip(min, max);
			if(j == 1) {
				tallyArray[k]++; //
			} else if (j == 2) {
				k = 1;
				tallyArray[k]++;
			}
		}
		
		//print the results
		System.out.println("Count of Heads: " + tallyArray[0]);
		System.out.println("Count of Tails: " + tallyArray[1]);
	}

}