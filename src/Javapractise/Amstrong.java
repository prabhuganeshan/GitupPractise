package Javapractise;

public class Amstrong {
	
	public static void main(String[] args) {
		int a=153;
		int add =0;
		int n=a;
		while(n>0) {
			
			int i=n%10;
			add=(i*i*i)+add;
			n=n/10;
		
			
		}
		System.out.println(add);
	}

}
