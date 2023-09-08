package all_JAVA_PROGRAM;

public class Ascending {
	public static void main(String[] args) {
		int a[]= {2,58,85,6,1,98};
		int temp ;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
	for (int i : a) {
		System.out.println(i);
	}	
	}

}
