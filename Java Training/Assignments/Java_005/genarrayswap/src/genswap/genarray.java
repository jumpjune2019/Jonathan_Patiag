package genswap;

import java.util.Scanner;

class Main {
	
	// Program to create a generic array in Java
	public static void main(String[] args)
	{
		final int length = 5;
		Scanner input = new Scanner(System.in);
		// create an Integer array of given length
		Generics<Integer> iArray = new Generics<Integer>(length);
		Generics<Character> cArray = new Generics<Character>(length-2);
		int a = 0, b = 0, j = 0;
		char c;
		/*
		 * Customising the indexes in the arrays
		 */
		cArray.set(0, 'J');
		cArray.set(1, 'O');
		cArray.set(2, 'N');
		for (int i = 0; i < length; i++) {
			iArray.set(i, i + 1);
		}
		/*
		 * Print the arrays before swapping
		 */
		System.out.println("Array of integers");
		for (int i = 0; i < length; i++) {
			iArray.get(i);
			j = (iArray.get(i)).intValue();
			System.out.println(j);
		}
		System.out.println("Array of characters");
		for (int i = 0; i < length-2; i++) {
			cArray.get(i);
			c = (cArray.get(i)).charValue();
			System.out.println(c);
		}
		/*
		 * Test 1: An array of Integers
		 */
		System.out.println("First test!");
		/*
		 * Prompt for indexes to swap
		 */
		System.out.println("Select the first element to swap: ");
		a = input.nextInt();
		System.out.println("Select the second element to swap: ");
		b = input.nextInt();
		iArray.swap(a, b, iArray); //calls the function to swap the elements in the array
		System.out.println("Integer array after swapping.");
		for (int i = 0; i < length; i++) { //go through the array and print all elements
			iArray.get(i);
			j = (iArray.get(i)).intValue();
			System.out.println(j);
		}
		/*
		 * Test 2: An array of Characters
		 */
		System.out.println("Second test!");
		/*
		 * Reprompt for the next elements to swap
		 */
		System.out.println("Select the first element to swap: ");
		a = input.nextInt();
		System.out.println("Select the second element to swap: ");
		b = input.nextInt();
		cArray.swap(a, b, cArray); //call function to swap
		System.out.println("Character array after swapping.");
		for (int i = 0; i < length-2; i++) {//go through array and print all elements
			cArray.get(i);
			c = (cArray.get(i)).charValue();
			System.out.println(c);
		}
		input.close();
	}
}
