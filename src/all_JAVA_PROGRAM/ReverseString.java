package all_JAVA_PROGRAM;

public class ReverseString {
	public static void main(String[] args) {
		String s="prabhu";
		String rev="";
		for (int i = s.length()-1; i>=0 ; i--) {
			char c = s.charAt(i);
			rev=rev+c;
			
		}
		System.out.println(rev);
	}

}
