package java_concepts;

public class Stringimmutable {
	
	
	
	    public static void main(String[] args) {
	        String str1 = "Hello";
	        String str2 = str1; // Reference assignment
	        
	        System.out.println("Before modification:");
	        System.out.println("str1: " + str1); // Output: Hello
	        System.out.println("str2: " + str2); // Output: Hello
	        
	        // Modifying str1
	        str1 = str1 + " World";
	        
	        System.out.println("After modification:");
	        System.out.println("str1: " + str1); // Output: Hello World
	        System.out.println("str2: " + str2); // Output: Hello (Unchanged)
	        
	        
	        System.out.println("address of strings");
	        int hashCode1 = str1.hashCode();
	        System.out.println("Hash Code: " + hashCode1);
	        int hashCode2 = str1.hashCode();
	        System.out.println("Hash Code: " + hashCode2);
	        
	        
	        
	        		
	    }
	}


