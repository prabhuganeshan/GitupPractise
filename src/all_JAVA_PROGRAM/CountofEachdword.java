package all_JAVA_PROGRAM;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountofEachdword {
	public static void main(String[] args) {
		String sp="Hai How Are How You";
		String[] spli = sp.split(" ");
		
		
		Map <String,Integer> mp=new LinkedHashMap<String,Integer>();
  		
		for (String x : spli) {
			if(mp.containsKey(x)){
				
				 int j = mp.get(x);
				mp.put(x, j+1);
			
		}
			else {
				mp.put(x, 1);
			}
}
		System.out.println(mp);
		}
}