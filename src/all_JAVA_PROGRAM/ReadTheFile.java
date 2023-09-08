package all_JAVA_PROGRAM;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;

public class ReadTheFile {
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\prabhu\\eclipse-workspace\\javaInterviewprograms\\names.txt");
		FileReader fil=new FileReader(f);
		BufferedReader b=new BufferedReader(fil);
		String st;
		while((st=b.readLine())!=null)
			System.out.println(st);
		
		
		
		
		
	}

}
