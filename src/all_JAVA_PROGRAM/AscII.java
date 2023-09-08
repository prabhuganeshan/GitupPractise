package all_JAVA_PROGRAM;

//AscII
//A-Z= 65-90
//a-z= 97-122
//numbers=48-57
//special=33-47 and 58-64

//numbers=48-57
//A-Z    =65-90
//a-z	 =97-122

public class AscII {
	public static void main(String[] args) {
		String s="Prabhu123@gamil.com";
		String cap="";
		String small="";
		String number="";
		String special="";
		
		int capcount=0;
		int smalllcount=0;
		int numbercount=0;
		int specialcount=0;
	
		for (int i = 0; i < s.length(); i++) {
			
			char capital = s.charAt(i);
			int x= capital;
			if((x>=65)&&(x<=90)) {
				cap=cap+capital;
				capcount++;
				
			}
			else if((x>=97)&&(x<=122)){
				
					small=small+capital;
					smalllcount++;
				}
			else if((x>=48)&&(x<=57)){
				number=number+x;
				numbercount++;
			}
				else {
					special=special+capital;
					specialcount++;
					
					
				}
						
			
		}System.out.println(cap+" "+capcount);
		
		System.out.println(small+" "+smalllcount);
		
		System.out.println(number+" "+numbercount);
		
		System.out.println(special+" "+specialcount);
		}}
		
