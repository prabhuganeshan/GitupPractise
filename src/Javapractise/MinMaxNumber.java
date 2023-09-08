package Javapractise;

public class MinMaxNumber {
	
	public static void main(String[] args) {
		
		
		int a[]= {1,5,10,2,8,9,100,100};
		
		int min= a[0];
		int max=a[0];
		
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>max) {
				
				max=a[i];
				
			}
			else if(a[i]<min) {
				min=a[i];
			}
			
		}
		System.out.println("MIN = "+min);
		System.out.println("Max = "+max);
	}

}
