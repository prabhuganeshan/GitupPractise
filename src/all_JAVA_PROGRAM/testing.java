package all_JAVA_PROGRAM;

public class Amstrong {
	public static void main(String[] args) {
		int a=153;
		int res=0;
		int rem=0;
		int num=a;
		while(a>0) {
			rem=a%10;
			res=res+(rem*rem*rem);
			a=a/10;
		}

		System.out.println("confilcts");
		System.out.println(res);if(num==res) {
			System.out.println("amstrong");
		}
		else {
			System.out.println("not amstrang");
		}



	}

}
