package all_JAVA_PROGRAM;

public class RemoveSpace {

	public static void main(String[] args) {
		String s1="indu ravi";
		String word[]=s1.split("\\s");
		String value="";
		
		for(String words:word) {
		String substr=words.substring(0,1);
		String reletter = words.substring(1);
		value+=substr.toUpperCase()+reletter;
		 }
		 System.out.println(value);
		 
		 
		 //one more way
		 String s = "Prabhu Ganesan";
	        String result = s.replaceAll("\\s", "");
	        System.out.println(result);
		 
		 
			}
		}

