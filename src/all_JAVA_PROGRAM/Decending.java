package all_JAVA_PROGRAM;

public class Decending {
	public static void main(String[] args) {
		int a[]= {10,25,2,52,36,78};
		
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
				
			
		}
	}
		System.out.println("decending");
		for (int i : a) {
					
		System.out.println(i);
	}
	
}
}