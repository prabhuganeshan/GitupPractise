package Javapractise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Print_duplicate_Array {
	
	public static void main(String[] args) {
		
		int a[]= {5,7,7,1,3,9,0,0,1,7,8,8};
		
		Set<Integer> set=new HashSet<>();
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]==a[j]) {
					set.add(a[i]);
					
				}
				
			}
			
		}
		System.out.println(set);
	}

}
