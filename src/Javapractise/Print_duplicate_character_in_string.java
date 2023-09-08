package Javapractise;

import java.util.HashSet;
import java.util.Set;

public class Print_duplicate_character_in_string {
	
public static void main(String[] args) {
	
	String s="aabbccdefghacccc";
	
	Set<Character> duplicate=new HashSet<>();
	Set<Character> notduplicate=new HashSet<>();
	
	for (int i = 0; i < s.length(); i++) {
		
		if(notduplicate.contains(s.charAt(i))){
			duplicate.add(s.charAt(i));
		}
		else {
			notduplicate.add(s.charAt(i));
		}
		
	}
	
	System.out.println("Duplicate character = "+duplicate);
	System.out.println("non Duplicate character = "+notduplicate);
	
}
}
