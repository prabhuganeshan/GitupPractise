package all_JAVA_PROGRAM;

public class MaxMinInArray {
public static void main(String[] args) {
	
	
	int a[]= {5,7,3,9,5,8,3,80,58};
	int min =a[0];
	int max=a[0];
	
	for (int i = 0; i < a.length; i++) {
		if(a[i]>max) {
			max=a[i];
			
		}
		else if(a[i]<min) {
			min=a[i];
		}	
	}
	System.out.println(min+"====="+max);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
