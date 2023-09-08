package all_JAVA_PROGRAM;

import java.util.HashSet;
import java.util.Set;

public class Print_duplicate_string {
	
	 public static void main(String[] args) {
	        String s = "aabbccdefghabbc";
	        Set<Character> seenCharacters = new HashSet<>();
	        Set<Character> duplicateCharacters = new HashSet<>();

	        for (int i = 0; i < s.length(); i++) {
	            char currentChar = s.charAt(i);
	            if (seenCharacters.contains(currentChar)) {
	                duplicateCharacters.add(currentChar);
	            }
	            seenCharacters.add(currentChar);
	        }

	        for (char duplicate : duplicateCharacters) {
	            System.out.println(duplicate);
	        }

}
}
