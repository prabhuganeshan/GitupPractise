package all_JAVA_PROGRAM;

public class ToSeggregateCharacters {

	public static void main(String[] args) {
		String s="prabhuGANESAN2233@gmail.com";
		
		String Uletter="";
		String Lletter="";
		String number="";
		String specchar="";
		int ucount=0;
		int lcount=0;
		int ncount=0;
		int specount=0;
				

		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			if(Character.isUpperCase(c)) {
				Uletter=Uletter+c;
				ucount++;
							
			}
			else if(Character.isLowerCase(c)) {
				Lletter=Lletter+c;
				lcount++;
				
			}
			else if(Character.isDigit(c)) {
				number=number+c;
				ncount++;
			
			}
			else {	
				specchar=specchar+c;
				specount++;
				
			}
			}
				
		
		System.out.println(Uletter +"="+ucount);
		System.out.println(Lletter +"="+lcount);
		System.out.println(number +"="+ncount);
		System.out.println(specchar+"="+specount);
		
			
		}
		
				
	}

