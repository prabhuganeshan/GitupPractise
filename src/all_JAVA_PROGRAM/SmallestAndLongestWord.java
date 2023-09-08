package all_JAVA_PROGRAM;

public class SmallestAndLongestWord {
	public static void main(String[] args) {
		
		String s="This is my company";
		String str=s+"";
		int length = str.length();
		
		int min=length, max=0, le=0;
		String longestword="",shortest="",word="";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c!=' ') {
				word =word+c;
			}
			else {
				le=word.length();
				if(le<min) {
					min=le;
					shortest=word;
				
				}
				if(le>max) {
					max=le;
					longestword=word;
				}
				word="";
				
			}
			
		}
		
		System.out.println("shortstword="+shortest+"  length="+min);
	
		System.out.println("longest word="+longestword+" length="+max);
	}
	

}
