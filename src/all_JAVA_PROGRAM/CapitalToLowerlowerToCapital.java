package all_JAVA_PROGRAM;

public class CapitalToLowerlowerToCapital {
	public static void main(String[] args) {
		String s1="";
		
		String input = "Hello THIS Is PhoTon World, Welcome To PHoTOn";
		for (int i = 0; i < input.length(); i++) {
			
			char c = input.charAt(i);
			if (Character.isUpperCase(c)) {
				char lowercase = Character.toLowerCase(c);
				s1=s1+lowercase;
			}
			else {
				char uppercase = Character.toUpperCase(c);
				s1=s1+uppercase;
			}
			
		
		}

		
		System.out.println(s1);
	}
}
