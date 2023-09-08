package all_JAVA_PROGRAM;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveduplicateInArray {
	public static void main(String[] args) {
	 
		  int arr[] = {2,5,8,5,9,6,8,5,9,7};
		  Set<Integer> s=new LinkedHashSet<>();
		  for (int i = 0; i < arr.length; i++) {
			  s.add(arr[i]);
			  
			
		}
		  System.out.println(s);
		  StringBuilder b=new StringBuilder();
		  for (Integer num : s) {
			  b.append(num);
			
		}
		  System.out.println(b);
    }  
}  
