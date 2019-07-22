package sort;

import java.util.Collections;
import java.util.Arrays;


public class sorting {

	
		
	
		   public static void main(String[] args){
			   /*
			    * Initialize the arrays
			    */
		       Integer[] numArr = { 10, 3, 4, 15, 7, 9, 1, 21 };
		       String[] strArr = { "claude", "Phil", "lois", "clark", "Arthur", "Mera", "bruce" };
		       	   
		       /*
		        * The next 2 lambda blocks determine whether the
		        * function will be in ascending or descending order. 
		        */
		           Sorter<Integer> intArray=(a,s,c)->{
		               Integer[] Array = a;
		               if(s.equals("ASC")){
		               Arrays.sort(Array);
		               }else if(s.equals("DESC")){
		               Arrays.sort(Array,Collections.reverseOrder());}
		               return Array;
		           };
		           
		           
		           Sorter<String> stringArray= (a, s,c) -> {
		        	   Boolean caseSens = c;
		        	   String[] Array = a;
		        	   
		        	   
		        	   if(s.equals("DESC")&& caseSens==true) {//this if sorts the array in a descending order and array is case sensitive
		        		   
		        		   Arrays.sort(Array,String.CASE_INSENSITIVE_ORDER);
		        		   Collections.reverse(Arrays.asList(Array));
		        		   
		        	   }else if(s.equals("ASC") && caseSens==true) {//this if sorts the array in an ascending order and array is case sensitive
		        		   
		        		   Arrays.sort(Array, String.CASE_INSENSITIVE_ORDER);
		        	   }else if(s.equals("DESC")) {//this if sorts the array in reverse to signale descending
		        		   
		        		   Arrays.sort(Array,Collections.reverseOrder());
		        	   }else if(s.equals("ASC")) {//this if sorts the ascending array normally
		        		   
		        		   Arrays.sort(Array);
		        	   }
		        	   return Array;
		           };
		           
		       //printing array before sort
		       for (int element:numArr){
		           System.out.print(element+" ,");
		       };
		       System.out.print("\n");
		       for (String element: strArr) {
		    	   System.out.print(element +", ");
		       };

		       System.out.println();
		       // sorts array ascending or descending based on ASC or DESC
		       numArr=intArray.sort(numArr,"ASC",false);
		       System.out.println("Ascending:" + Arrays.toString(numArr));
		       System.out.print("");
		       numArr=intArray.sort(numArr,"DESC" ,false);
		       System.out.println("Descending:" +Arrays.toString(numArr));
		       System.out.println("");
		       strArr=stringArray.sort(strArr, "ASC", false);
		       System.out.println("Ascending:"+ Arrays.toString(strArr));
		       System.out.println("");
		       strArr=stringArray.sort(strArr, "DESC", false);
		       System.out.println("Descending:" +Arrays.toString(strArr));
		       System.out.println("");
		       strArr=stringArray.sort(strArr, "ASC", true);
		       System.out.println("Ascending and Case Insensitive:" +Arrays.toString(strArr));
		       System.out.println("");
		       strArr=stringArray.sort(strArr, "DESC", true);
		       System.out.println("Descending and Case Insensitive:"  +Arrays.toString(strArr));
		       System.out.println("");

		   }
		}
	
