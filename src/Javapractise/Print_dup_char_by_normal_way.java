package Javapractise;

import java.util.HashSet;
import java.util.Set;

public class Print_dup_char_by_normal_way {
	
	public static void main(String[] args) {
		
		String s="aabbccddefghabcee";
		
		Set<Character> set=new HashSet<>();
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				
					
			if(s.charAt(i)==s.charAt(j)) {
				set.add(s.charAt(i));
			}
		}
		}
		
		System.out.println(set);
	}

}
