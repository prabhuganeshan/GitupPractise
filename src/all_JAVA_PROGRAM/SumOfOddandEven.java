package all_JAVA_PROGRAM;

public class SumOfOddandEven {
	public static void main(String[] args) {
		int Evensum=0;
		int Oddsum=0;
		for (int i = 1; i <=10; i++) {
			if(i%2==1) {
				
				System.out.println("odd="+i);
				Oddsum=Oddsum+i;
				
			}
			else if(i%2==0) {
				System.out.println("Even="+i);
				Evensum=Evensum+i;
			
				
			}
			
		}
		System.out.println("sum of even="+Evensum);
		System.out.println("sum of even number="+Oddsum);
	}

}
