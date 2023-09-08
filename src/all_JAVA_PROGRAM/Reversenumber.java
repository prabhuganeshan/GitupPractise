package all_JAVA_PROGRAM;

public class Reversenumber {
	public static void main(String[] args) {
		
		int a=12345;
		int rev=0,rem=0;
		while(a>0) {
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
			
		}
		
		System.out.println(rev);
		
	}

}