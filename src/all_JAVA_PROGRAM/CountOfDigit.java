package all_JAVA_PROGRAM;

public class CountOfDigit {
public static void main(String[] args) {
	int num= 12345;
	
	int count=0;
	while(num>0) {
		count++;
		num=num/10;	
}
	System.out.println(count);
	

	
}
}
