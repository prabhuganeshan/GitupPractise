package Javapractise;

import java.util.Iterator;

public class Firstletter_cap {

	
	public static void main(String[] args) {
		String s="string change first letter is capital";
		
		String[] split = s.split(" ");
		
		String store="";
		
		for (String string : split) {
			
			char charAt = string.charAt(0);
			String substring = string.substring(1);
			char upperCase = Character.toUpperCase(charAt);
			store=store+" "+upperCase+substring;
			
			
		}
		String trim = store.trim();
		System.out.println(trim);
	}
}
