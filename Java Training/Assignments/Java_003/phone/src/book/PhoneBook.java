package book;

import java.util.Scanner;
import java.io.*;

public class PhoneBook {
	
	 /*
	  * This function throws the custom exception
	  * from its class.  
	  */
	 public static void testNotEmpty(String line) throws BlankException{
		 if(line.equals("")) { //this is a requirement that tests if the value is empty
			 throw new BlankException("This is empty!");
		 } 
	 }

	 public static void main(String arr[]) throws FileNotFoundException {
		String[][] phonebook = new String[5][3]; // initialise the 2-d String array
		
		// Creating a File object that represents the disk file.
	     PrintStream o = new PrintStream(new File("phone.txt")); 

	     // Store current System.out before assigning a new value 
	     PrintStream console = System.out; 
		
		/*
		 * For the next few lines,
		 * we insert all labels inside the 2-D array
		 */
		String answer;
		int i = 0, a = 0;
		Scanner input = new Scanner(System.in);
		for (i = 0; i < 5; i++) {
			System.out.println("Input your name: ");
			answer = input.nextLine(); //inputs prompt into answer
			/*
			 * testing the answer with try-catch statements with custom exceptions
			 */
			try {
				testNotEmpty(answer);
			}catch(Exception m) {System.out.println("An exception occured: " + m);
				System.out.println("Please enter a name: ");
				answer = input.nextLine();
			}
			//if passes try-catch, put answer in the array
			phonebook[i][0] = answer;
			System.out.println("Next, your phone number: ");
			answer = input.nextLine();
			/*
			 * testing the answers with try-catch statements with custom exceptions
			 */
			try {
				testNotEmpty(answer);
			}catch(Exception m) {System.out.println("An exception occured: " + m);
				System.out.println("Please enter a number: ");
				answer = input.nextLine();
			}
			phonebook[i][1] = answer;
			System.out.println("Finally, the city you live in: ");
			answer = input.nextLine();
			/*
			 * testing the answers with try-catch statements with custom exceptions
			 */
			try {
				testNotEmpty(answer);
			}catch(Exception m) {System.out.println("An exception occured: " + m);
				System.out.println("Please enter a city: ");
				answer = input.nextLine();
			}
			phonebook[i][2] = answer;
			System.out.println("You entered: " + phonebook[i][0] + " " + phonebook[i][1] + " " + phonebook[i][2]);
			/*
			 * Added Requirement 2, if the keys entered are not "y" or "Y"
			 * loop through while loop and input again
			 */
			System.out.println("Is this correct? Type y or Y to accept and any other key to reinput.");
			answer = input.nextLine();
			while (!answer.equalsIgnoreCase("y")) {
				System.out.println("Input your name: ");
				answer = input.nextLine();
				/*
				 * testing the answers with try-catch statements with custom exceptions
				 */
				try {
					testNotEmpty(answer);
				}catch(Exception m) {System.out.println("An exception occured: " + m);
					System.out.println("Please enter a name: ");
					answer = input.nextLine();
				}
				phonebook[i][0] = answer;
				System.out.println("Next, your phone number: ");
				answer = input.nextLine();
				/*
				 * testing the answers with try-catch statements with custom exceptions
				 */
				try {
					testNotEmpty(answer);
				}catch(Exception m) {System.out.println("An exception occured: " + m);
					System.out.println("Please enter a number: ");
					answer = input.nextLine();
				}
				phonebook[i][1] = answer;
				System.out.println("Finally, the city you live in: ");
				answer = input.nextLine();
				/*
				 * testing the answers with try-catch statements with custom exceptions
				 */
				try {
					testNotEmpty(answer);
				}catch(Exception m) {System.out.println("An exception occured: " + m);
					System.out.println("Please enter a city: ");
					answer = input.nextLine();
				}
				phonebook[i][2] = answer;
				System.out.println("You entered: " + phonebook[i][0] + " " + phonebook[i][1] + " " + phonebook[i][2]);
				System.out.println("Is this correct? Type y or Y to accept and any other key to reinput.");
				answer = input.nextLine();
			}
		}
		
		/*
		 * These lines either print the phonebook to file, screen, or both.
		 */
		System.out.println("Print to txt file (f), screen(s), or both(b)? Choose! ");
		answer = input.nextLine();
		System.out.println(answer);
		if(answer.equals("s")) {
			System.setOut(console);
			System.out.println("Phonebook app");
			System.out.println("Name	Phone	City");
			for (a = 0; a < 5; a++) {
				System.out.println(phonebook[a][0] + "	" + phonebook[a][1] + "	" + phonebook[a][2]);
			}
		} else if (answer.equals("f")) {
			System.setOut(o);
			System.out.println("Phonebook app");
			System.out.println("Name	Phone	City");
			for (a = 0; a < 5; a++) {
				System.out.println(phonebook[a][0] + "	" + phonebook[a][1] + "	" + phonebook[a][2]);
			}
		}
		
		else if (answer.equals("b")) {
			System.setOut(console);
			System.out.println("Phonebook app");
			System.out.println("Name	Phone	City");
			for (a = 0; a < 5; a++) {
				System.out.println(phonebook[a][0] + "	" + phonebook[a][1] + "	" + phonebook[a][2]);
			}
			System.setOut(o);
			System.out.println("Phonebook app");
			System.out.println("Name	Phone	City");
			for (a = 0; a < 5; a++) {
				System.out.println(phonebook[a][0] + "	" + phonebook[a][1] + "	" + phonebook[a][2]);
			}
		}
		input.close();
	}
}
