package all_JAVA_PROGRAM;

public class FirstLetterintoUpper {
public static void main(String[] args) {
	String s="hello welcome to java";
	String[] sp = s.split(" ");
	String cut= "";
	for (String spli : sp) {
		

		char c = spli.charAt(0);
		char upper = Character.toUpperCase(c);
		String sub = spli.substring(1);
		
		cut=cut+upper+sub+" ";
	}
	
	
System.out.println(cut);	
}

}