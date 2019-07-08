package app;

//import the class from the package
import static arrayutils.StringArrayUtility2.*;

public class ArrUtil {
	public static void main(String[] args) {
		String myList[] = {"Bozo", "FooBar", "Delta", "Foozball", "Demo", "Money", "Zoo"};
		String a = "zo";
		int i = 0;
		/*
		 * Beginning testing in these statements.
		 */
		System.out.println("Testing functions. Scenario 1.");
		boolean result = arrayHasExactMatch(myList, a, false);
		System.out.println("arrayHasExactMatch(myList, " + a + ", false) is: " + result);
		a = "zoo";
		result = arrayHasExactMatch(myList, a, false);
		System.out.println("Scenario 2.");
		System.out.println("arrayHasExactMatch(myList, " + a + ", false) is: " + result);
		result = arrayHasExactMatch(myList, a, true);
		System.out.println("Scenario 3.");
		System.out.println("arrayHasExactMatch(myList, " + a + ", true) is: " + result);
		a = "foo";
		result = arrayHasExactMatch(myList, a, true);
		System.out.println("Scenario 4.");
		System.out.println("arrayHasExactMatch(myList, " + a + ", true) is: " + result);
		result = arrayHasExactMatch(myList, a, false);
		System.out.println("Scenario 5.");
		System.out.println("arrayHasExactMatch(myList, " + a + ", false) is: " + result);
		a = "delta";
		result = arrayHasExactMatch (myList, a, true);
		System.out.println("Scenario 6.");
		System.out.println("arrayHasExactMatch(myList, " + a + ", true) is: " + result);
		a = "Delta";
		result = arrayHasExactMatch (myList, a, true);
		System.out.println("Scenario 7.");
		System.out.println("arrayHasExactMatch(myList, " + a + ", true) is: " + result);
		a = "zo";
		int score[] = indexOfOccurenceInArray(myList, a, false); 
		System.out.println("Scenario 8.");
		System.out.println("indexOfOccurenceInArray(myList, " + a + ", false) returns " + score[i]);
		a = "zoo";
		score = indexOfOccurenceInArray(myList, a, false); 
		System.out.println("Scenario 9.");
		System.out.println("indexOfOccurenceInArray(myList, " + a + ", false) returns " + score[i]);
		score = indexOfOccurenceInArray(myList, a, true);
		System.out.println("Scenario 10.");
		System.out.println("indexOfOccurenceInArray(myList, " + a + ", true) returns " + score[i]);
		a = "foo";
		score = indexOfOccurenceInArray(myList, a, true);
		System.out.println("Scenario 11.");
		System.out.println("indexOfOccurenceInArray(myList, " + a + ", true) returns " + score[i]);
		score = indexOfOccurenceInArray(myList, a, false);
		System.out.println("Scenario 12.");
		System.out.println("indexOfOccurenceInArray(myList, " + a + ", false) returns " + score[i]);
		a = "delta";
		score = indexOfOccurenceInArray(myList, a, true);	
		System.out.println("Scenario 13.");
		System.out.println("indexOfOccurenceInArray(myList, " + a + ", true) returns " + score[i]);
		a = "Delta";
		score = indexOfOccurenceInArray(myList, a, true);	
		System.out.println("Scenario 14.");
		System.out.println("indexOfOccurenceInArray(myList, " + a + ", true) returns " + score[i]);
	}
}
