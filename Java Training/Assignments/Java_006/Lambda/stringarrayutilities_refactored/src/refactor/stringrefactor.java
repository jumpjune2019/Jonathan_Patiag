package refactor;

public class stringrefactor {
	
		public static void main(String[] args) {
			/*
			 * Initalising all variables
			 */
			String myList[] = {"Bozo", "FooBar", "Delta", "Foozball", "Demo", "Money", "Zoo"};
			String a = "zo";
			int i = 0;
			numIndex index;
			indexMatch match;
			boolean result;
			match = (array, x, y) -> { //this lambda block tests whether a String appears in a list of Strings or not
				boolean found = false; //initialises return boolean
				for (int k = 0; k < array.length; k++) {
					if (y == true) {
						if (array[k].equals(x) == true) {
							found = true;
							continue;
						}
					} else {
						if (array[k].equalsIgnoreCase(x) == true) {
							found = true;
							continue;
						}
					}
				}
				return found;
			};
			index = (array, b, c) -> { //this lambda block determines how many times a String appears/doesn't appear in the list.
				int j = 0; //initialise variables
				int foundindexes[] = new int[1]; //creating a new variable 
				for (int z = 0; z < array.length; z++) {
					if (c == false) {
						if (array[z].equalsIgnoreCase(b) == true) {
							foundindexes[j]++;
						}
					} else {
						if (array[z].equals(b) == true) {
							foundindexes[j]++;
						}
					}
				}
				if(foundindexes[j] == 0) {
					foundindexes[j]--;
				}
				return foundindexes;
			};
			/*
			 * Beginning testing in these statements. Any functions
			 * that were previously implemented here are replaced by lambad functions
			 */
			System.out.println("Testing functions. Scenario 1.");
			result = match.function(myList, a, false);
			System.out.println("arrayHasExactMatch(myList, " + a + ", false) is: " + result);
			a = "zoo";
			result = match.function(myList, a, false);
			System.out.println("Scenario 2.");
			System.out.println("arrayHasExactMatch(myList, " + a + ", false) is: " + result);
			result = match.function(myList, a, true);
			System.out.println("Scenario 3.");
			System.out.println("arrayHasExactMatch(myList, " + a + ", true) is: " + result);
			a = "foo";
			result = match.function(myList, a, true);
			System.out.println("Scenario 4.");
			System.out.println("arrayHasExactMatch(myList, " + a + ", true) is: " + result);
			result = match.function(myList, a, false);
			System.out.println("Scenario 5.");
			System.out.println("arrayHasExactMatch(myList, " + a + ", false) is: " + result);
			a = "delta";
			result = match.function(myList, a, true);
			System.out.println("Scenario 6.");
			System.out.println("arrayHasExactMatch(myList, " + a + ", true) is: " + result);
			a = "Delta";
			result = match.function(myList, a, true);
			System.out.println("Scenario 7.");
			System.out.println("arrayHasExactMatch(myList, " + a + ", true) is: " + result);
			a = "zo";
			int score[] = index.function(myList, a, false); 
			System.out.println("Scenario 8.");
			System.out.println("indexOfOccurenceInArray(myList, " + a + ", false) returns " + score[i]);
			a = "zoo";
			score = index.function(myList, a, false); 
			System.out.println("Scenario 9.");
			System.out.println("indexOfOccurenceInArray(myList, " + a + ", false) returns " + score[i]);
			score = index.function(myList, a, true);
			System.out.println("Scenario 10.");
			System.out.println("indexOfOccurenceInArray(myList, " + a + ", true) returns " + score[i]);
			a = "foo";
			score = index.function(myList, a, true);
			System.out.println("Scenario 11.");
			System.out.println("indexOfOccurenceInArray(myList, " + a + ", true) returns " + score[i]);
			score = index.function(myList, a, false);
			System.out.println("Scenario 12.");
			System.out.println("indexOfOccurenceInArray(myList, " + a + ", false) returns " + score[i]);
			a = "delta";
			score = index.function(myList, a, true);	
			System.out.println("Scenario 13.");
			System.out.println("indexOfOccurenceInArray(myList, " + a + ", true) returns " + score[i]);
			a = "Delta";
			score = index.function(myList, a, true);	
			System.out.println("Scenario 14.");
			System.out.println("indexOfOccurenceInArray(myList, " + a + ", true) returns " + score[i]);
		
	}
}
