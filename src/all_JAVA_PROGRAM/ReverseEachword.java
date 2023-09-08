package all_JAVA_PROGRAM;

public class ReverseEachword {
	
	
		
	    public static void main(String[] args) {
	        String s = "Welcome to India";
	        String[] words = s.split(" ");
	        StringBuilder reversed = new StringBuilder();
	        
	        for (String word : words) {
	            StringBuilder reversedWord = new StringBuilder(word);
	            reversedWord.reverse();
	            reversed.append(reversedWord).append(" ");
	        }
	        
	        reversed.setLength(reversed.length() - 1); // Remove the trailing space
	        System.out.println(reversed.toString());
	    }
	}

	
	