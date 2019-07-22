package hit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Match{ 
	//made 2 separate text files that will be compared
	private static final String file1 = "file.txt";
	private static final String file2 = "file2.txt";
    public static void main(String[] args) throws IOException 
    { 	
    	/*
    	 * The next following statements all contribute towards
    	 * reading in lines from the file.
    	 */
        File filea = new File(file1); 
        File fileb = new File(file2);
        FileInputStream fileStreama = new FileInputStream(filea); 
        FileInputStream fileStreamb = new FileInputStream(fileb);
        InputStreamReader inputa = new InputStreamReader(fileStreama); 
        InputStreamReader inputb = new InputStreamReader (fileStreamb);
        BufferedReader reader1 = new BufferedReader(new FileReader(filea));
        BufferedReader reader2 = new BufferedReader(new FileReader(fileb));
        String line1 = reader1.readLine();
        String line2 = reader2.readLine();
        int characterCount1 = 0;
        int characterCount2 = 0;
         
        boolean areEqual = true;
         
        int lineNum = 1;
         
        /*
         * This code determines whether the contents of the 
         * 2 text files are equal
         */
        while (line1 != null || line2 != null)
        {
        	characterCount1 += line1.length();
        	characterCount2 += line2.length();
            if(line1 == null || line2 == null)
            {
                areEqual = false;
                 
                break;
            }
            else if(! line1.equalsIgnoreCase(line2))
            {
                areEqual = false;
                 
                break;
            }
             
            line1 = reader1.readLine();
             
            line2 = reader2.readLine();
             
            lineNum++; //continue searching if the lines remain equal
        }
        
        /*
         * The results after the while loop above
         * will be shown here
         */
        int characterCount = 0;
        if (characterCount1 == characterCount2 && areEqual == true) { //if both are the same
        	characterCount = characterCount1;
        	System.out.println("identical content");
        	System.out.println("character length for both: " + characterCount);
        } else if (characterCount1 == characterCount2 && areEqual == false) { //if character count's the same, but the characters in text file are different
        	characterCount = characterCount1;
        	System.out.println("different content");
        	System.out.println("character length for both: " + characterCount);
        } else if (characterCount1 != characterCount2 && areEqual == true) { //if character count is different, but the characters are the same
        	System.out.println("identical content");
        	System.out.println("character length for file1.txt " + characterCount1);
        	System.out.println("character length for file2.txt " + characterCount2);
        } else if (characterCount1 != characterCount2 && areEqual == false) { //if neither are the same
        	System.out.println("different content");
        	System.out.println("character length for file1.txt " + characterCount1);
        	System.out.println("character length for file2.txt " + characterCount2);
        }
        
        /*
         * Make sure to close readers afterwards
         */
        inputa.close();
        inputb.close(); 
        reader1.close();
        reader2.close();
    }
} 
