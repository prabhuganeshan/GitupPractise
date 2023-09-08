package all_JAVA_PROGRAM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(120);
		li.add(90);
		li.add(15);
		li.add(20);
		li.add(9);
		Collections.sort(li);
		System.out.println(li);
		
		Integer min = Collections.min(li);
		System.out.println(min);
		
		Integer max=Collections.max(li);
		System.out.println(max);
		
	}
}