package all_JAVA_PROGRAM;

public class EachwordFirstCaps {
	public static void main(String[] args) {
		String s = "hai how are you";

		String cap = "";
		String[] spl = s.split(" ");

		for (String x : spl) {
			char ch = x.charAt(0);
			char ch1 = Character.toUpperCase(ch);
			String sa = x.substring(1);
			System.out.print(cap + " " + ch1 + sa);

		}
		

	}

}

