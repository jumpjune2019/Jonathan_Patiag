package arrayutils;

public class StringArrayUtility2 {
	
	/*
	 * This function will determine if a certain String a can/can't be found
	 * in a String array[], depending on the boolean b. 
	 */
	public static boolean arrayHasExactMatch(String array[], String a, boolean b) {
		int arrlen = array.length; //determines array length
		int i = 0;
		boolean found = false; //initialises return boolean
		for (i = 0; i < arrlen; i++) {
			if (b == true) {
				if (array[i].equals(a) == true) {
					found = true;
					continue;
				}
			} else {
				if (array[i].equalsIgnoreCase(a) == true) {
					found = true;
					continue;
				}
			}
		}
		return found;
	}
	
	/*
	 * This function keeps tab on how many values of String a are matches
	 * in a String array, or depending on the boolean, how many values do not match the String.
	 */
	public static int[] indexOfOccurenceInArray(String array[], String a, boolean b) {
		int arrlen = array.length;
		int i = 0, j = 0; //initialise variables
		int foundindexes[] = new int[1]; //creating a new variable 
		for (i = 0; i < arrlen; i++) {
			if (b == false) {
				if (array[i].equalsIgnoreCase(a) == true) {
					foundindexes[j]++;
				}
			} else {
				if (array[i].equals(a) == true) {
					foundindexes[j]++;
				}
			}
		}
		if(foundindexes[j] == 0) {
			foundindexes[j]--;
		}
		return foundindexes;
	}
}
