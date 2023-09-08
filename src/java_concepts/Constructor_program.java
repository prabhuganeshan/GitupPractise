package java_concepts;

import java.util.ArrayList;

public class Constructor_program {
	

		public Constructor_program() {
		System.out.println("i am in constructor");
		}
		public Constructor_program(int a) {
		System.out.println("1 argument int");
		}
		private void Constructor_program(int i) {
		System.out.println(i);
		}
		public static void main(String[] args) {
			
	
		Constructor_program c = new Constructor_program();
		Constructor_program c1 = new Constructor_program(10);
		c.Constructor_program(10);
		
		

		
		}
		

	
	
	
}