package all_JAVA_PROGRAM;

public class RemoveSpecialcharacter {
	public static void main(String[] args) {
		String s="prabhubla75846@#$^)-_+";
		String s1="prabhubla75846@#$^)-_+";
		
		
		//print alphanumeric
		String  alphanumeric = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(alphanumeric);
		
		//print special characters only
		  String specialCharacters = s1.replaceAll("[a-zA-Z0-9]+", "");
	        System.out.println(specialCharacters);
		
		
		
		
	}

}
