package all_JAVA_PROGRAM;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Arraytolist_Set {

	public static void main(String[] args) {
		int a[]= {2, 4,2,3, 6, 7};
		List<Integer> li=new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			li.add(a[i]);
			
		}
		System.out.println(li);
		Set<Integer> si=new LinkedHashSet<Integer>();
		si.addAll(li);
		System.out.println(si);
	}
}
