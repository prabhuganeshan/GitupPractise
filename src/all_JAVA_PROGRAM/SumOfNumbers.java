package all_JAVA_PROGRAM;

public class SumOfNumbers {
	public static void main(String[] args) {
		int a=123456;
		int i,j=0;
		
		while(a>0) {
			i=a%10;
			j=(j+i);
		
		
			a=a/10;
		}
		System.out.println(j);
		
	}

}
