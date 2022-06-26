package q3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File f= new File("abc3.txt");
		FileReader fr= new FileReader(f);
		char[] chr= new char[(int)f.length()];
		fr.read(chr);
		int count=0;
		for(char c:chr) {
			if(c=='a') {
				count++;
			}
		}
		System.out.println("count of a: "+count);
	}
}
