package all_JAVA_PROGRAM;

import java.util.Arrays;
import java.util.Collections;

public class MaxMin_By_arrays_concepts {
	public static void main(String[] args) {
		Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};
	      int min = (int) Collections.min(Arrays.asList(numbers));
	      int max = (int) Collections.max(Arrays.asList(numbers));
	      
	      System.out.println("Min number: " + min);
	      System.out.println("Max number: " + max);
	      
	      
	      
	      
	      int number[] = new int[]{8, 2, 7, 1, 4, 9, 5};
	      int s = number[0];
	      int l = number[0];
	      
	      for(int i = 1; i < number.length; i++) {
	         if(number[i] > l)l = number[i];
	         else if (number[i] < s)s = number[i];
	      } 
	      System.out.println("Largest Number is : " + l);
	      System.out.println("Smallest Number is : " + s);
	   }


}