package all_JAVA_PROGRAM;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharCountRepeatedCharCount {
	public static void main(String[] args) {
	String s="welcomewelcome";
	
	
	Map<Character,Integer> m=new LinkedHashMap<Character,Integer>();
	for (int i = 0; i < s.length(); i++) {
		char cha = s.charAt(i);
		if(m.containsKey(cha)) {
			Integer countm=m.get(cha);
			m.put(cha, countm+1);
			
		}
		else {
			m.put(cha, 1);
			
		}
		
		
	}
	System.out.println(m);
	
		
		
	}

}
