package all_JAVA_PROGRAM;

import java.util.Arrays;

public class Annagram {
public static void main(String[] args) {
	
	String s="Ke ep";
	String s1="Peek";
	
	

	s=s.replaceAll("\\s", "");
	s1=s1.replaceAll("\\s", "");
	System.out.println(s);
	System.out.println(s1);
	

		
	if(s.length() ==s1.length()) {
		 char[] charArray = s.toLowerCase().toCharArray();
		 char[] charArray2 = s1.toLowerCase().toCharArray();
		 
		 Arrays.sort(charArray);
		 Arrays.sort(charArray2);
		 
		 boolean equals = Arrays.equals(charArray, charArray2);
		 
		 if(equals) {
			 System.out.println("Anagram");
			 
			System.out.println(charArray);
			System.out.println(charArray2);
		
		 }
		
		
	}
	else {
		
		System.out.println("Not an anagram");
		 
	}

}

}
