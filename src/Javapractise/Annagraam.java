package Javapractise;

import java.util.Arrays;
import java.util.Iterator;

public class Annagraam {

	public static void main(String[] args) {
		String s1="k eep ";
		String s2="pe ek ";
		
		
		s1=s1.replaceAll("\\s", "");
		s2=s2.replaceAll("\\s", "");
		
		
		
		if(s1.length() != s2.length()){
			
			System.out.println("not an anagram");
			
		}
		else {
		
		
			boolean equals = Arrays.equals(s1.toLowerCase().toCharArray(), s1.toLowerCase().toCharArray());
			
		
			if(equals) {
				System.out.println("s1 = "+s1);
				System.out.println("s2 = "+s2);
				System.out.println("Strings are anagram");
			}
			
			else {
				System.out.println("not a anagram");
			}
			
			
		
	
	}
}
}
