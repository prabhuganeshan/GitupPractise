package all_JAVA_PROGRAM;

public class PalindromeInteger {
	public static void main(String[] args) {
		
		int num=141;
		int a=num;
		int rem=0 , rev=0;
		
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
		
		if(rev==a) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
