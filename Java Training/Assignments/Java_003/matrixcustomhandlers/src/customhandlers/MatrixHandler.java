package customhandlers;

import java.io.*;
import java.util.Scanner;
import customhandlers.WrongKeyException;

public class MatrixHandler{
	
	public static void testKey(String line) throws WrongKeyException{
		 if((!line.equals("1")) && (!line.equals("2")) && (!line.equals("3"))) {
			 throw new WrongKeyException("You have inputted an incorrect key.");
		 } 
	}
	
	public static void InvalidValue(int x) throws InvalidValueException{
		 if(x < 0  || x > 5) {
			 throw new InvalidValueException("That number is invalid, try another one.");
		 } 
	 }
	
	
    public static void main(String arr[]) throws FileNotFoundException { 
     // Creating a File object that represents the disk file. 
     PrintStream o = new PrintStream(new File("matrix.txt")); 

     // Store current System.out before assigning a new value 
     PrintStream console = System.out; 
     
     
     
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
		
		Scanner input = new Scanner(System.in);
		System.out.println("Print to txt file (1), screen(2), or both(3)? Choose! ");
		String answer = input.nextLine();
		System.out.println(answer);
		try {
			testKey(answer);
		}catch(Exception m) {System.out.println("Exception occured: " + m);
		System.out.println("Pleas4e press 1, 2, or 3: ");
		answer = input.nextLine();
		}
		if(answer.equals("1")) {
			System.setOut(console);
			System.out.println("Dice Combinations Label Matrix");
			System.out.println("");
			System.out.println("	Die1			Die2		Die3			Die4		Die5			Die6");
			System.out.println("Die 1	" + pair[0][0]	+ "		" + pair[0][1] + "	" + pair[0][2] + "	" + pair[0][3] + "	" + pair[0][4] + "		" + pair[0][5]);
			System.out.println("Die 2	" + pair[1][0] + "   " + pair[1][1] + "	" + pair[1][2] + "		" + pair[1][3] + "	" + pair[1][4] + "		" + pair[1][5]);
			System.out.println("Die 3	" + pair[2][0] + "		" + pair[2][1] + "		" + pair[2][2] + "		" + pair[2][3] + "		" + pair[2][4] + "	" + pair[2][5]);
			System.out.println("Die 4	" + pair[3][0] + "		" + pair[3][1] + "	" + pair[3][2] + "		" + pair[3][3] + "	" + pair[3][4] + "		" + pair[3][5]);
			System.out.println("Die 5	" + pair[4][0] + "	" + pair[4][1] + "	" + pair[4][2] + "		" + pair[4][3] + "	" + pair[4][4] + "		" + pair[4][5]);
			System.out.println("Die 6	" + pair[5][0] + "		" + pair[5][1] + "	" + pair[5][2] + "		" + pair[5][3] + "	" + pair[5][4] + "	" + pair[5][5]);
		} else if (answer.equals("2")) {
			System.setOut(o);
			System.out.println("Dice Combinations Label Matrix");
			System.out.println("");
			System.out.println("	Die1			Die2		Die3			Die4		Die5			Die6");
			System.out.println("Die 1	" + pair[0][0]	+ "		" + pair[0][1] + "	" + pair[0][2] + "	" + pair[0][3] + "	" + pair[0][4] + "		" + pair[0][5]);
			System.out.println("Die 2	" + pair[1][0] + "   " + pair[1][1] + "	" + pair[1][2] + "		" + pair[1][3] + "	" + pair[1][4] + "		" + pair[1][5]);
			System.out.println("Die 3	" + pair[2][0] + "		" + pair[2][1] + "		" + pair[2][2] + "		" + pair[2][3] + "		" + pair[2][4] + "	" + pair[2][5]);
			System.out.println("Die 4	" + pair[3][0] + "		" + pair[3][1] + "	" + pair[3][2] + "		" + pair[3][3] + "	" + pair[3][4] + "		" + pair[3][5]);
			System.out.println("Die 5	" + pair[4][0] + "	" + pair[4][1] + "	" + pair[4][2] + "		" + pair[4][3] + "	" + pair[4][4] + "		" + pair[4][5]);
			System.out.println("Die 6	" + pair[5][0] + "		" + pair[5][1] + "	" + pair[5][2] + "		" + pair[5][3] + "	" + pair[5][4] + "	" + pair[5][5]);
		}
		
		else if (answer.equals("3")) {
			System.setOut(console);
			System.out.println("Dice Combinsations Label Matrix");
			System.out.println("");
			System.out.println("	Die1			Die2		Die3			Die4		Die5			Die6");
			System.out.println("Die 1	" + pair[0][0]	+ "		" + pair[0][1] + "	" + pair[0][2] + "	" + pair[0][3] + "	" + pair[0][4] + "		" + pair[0][5]);
			System.out.println("Die 2	" + pair[1][0] + "   " + pair[1][1] + "	" + pair[1][2] + "		" + pair[1][3] + "	" + pair[1][4] + "		" + pair[1][5]);
			System.out.println("Die 3	" + pair[2][0] + "		" + pair[2][1] + "		" + pair[2][2] + "		" + pair[2][3] + "		" + pair[2][4] + "	" + pair[2][5]);
			System.out.println("Die 4	" + pair[3][0] + "		" + pair[3][1] + "	" + pair[3][2] + "		" + pair[3][3] + "	" + pair[3][4] + "		" + pair[3][5]);
			System.out.println("Die 5	" + pair[4][0] + "	" + pair[4][1] + "	" + pair[4][2] + "		" + pair[4][3] + "	" + pair[4][4] + "		" + pair[4][5]);
			System.out.println("Die 6	" + pair[5][0] + "		" + pair[5][1] + "	" + pair[5][2] + "		" + pair[5][3] + "	" + pair[5][4] + "	" + pair[5][5]);
			System.setOut(o);
			System.out.println("Dice Combinations Label Matrix");
			System.out.println("");
			System.out.println("	Die1			Die2		Die3			Die4		Die5			Die6");
			System.out.println("Die 1	" + pair[0][0]	+ "		" + pair[0][1] + "	" + pair[0][2] + "	" + pair[0][3] + "	" + pair[0][4] + "		" + pair[0][5]);
			System.out.println("Die 2	" + pair[1][0] + "   " + pair[1][1] + "	" + pair[1][2] + "		" + pair[1][3] + "	" + pair[1][4] + "		" + pair[1][5]);
			System.out.println("Die 3	" + pair[2][0] + "		" + pair[2][1] + "		" + pair[2][2] + "		" + pair[2][3] + "		" + pair[2][4] + "	" + pair[2][5]);
			System.out.println("Die 4	" + pair[3][0] + "		" + pair[3][1] + "	" + pair[3][2] + "		" + pair[3][3] + "	" + pair[3][4] + "		" + pair[3][5]);
			System.out.println("Die 5	" + pair[4][0] + "	" + pair[4][1] + "	" + pair[4][2] + "		" + pair[4][3] + "	" + pair[4][4] + "		" + pair[4][5]);
			System.out.println("Die 6	" + pair[5][0] + "		" + pair[5][1] + "	" + pair[5][2] + "		" + pair[5][3] + "	" + pair[5][4] + "	" + pair[5][5]);
		}
		int a = 0, b = 0;
		System.out.println("Why don't we run another test? Type 2 integers!");
		System.out.println("What is the first integer?");
		a = input.nextInt();
		try {
			InvalidValue(a);
		}catch(Exception e) {System.out.println("Got an exception " + e);
			System.out.println("Please enter a number between 0 and 5, (inclusive): ");
			a = input.nextInt();
		}
		System.out.println("What is the second integer?");
		b = input.nextInt();
		try {
			InvalidValue(b);
		}catch(Exception e) {System.out.println("Got an exception " + e);
			System.out.println("Please enter a number between 0 and 5 (inclusive): ");
			b = input.nextInt();
		}
		System.out.println("A dice roll of " + a + " and " + b + " gives out the term " + pair[a+1][b+1] + "! Nice!");
		input.close();
 	} 
} 