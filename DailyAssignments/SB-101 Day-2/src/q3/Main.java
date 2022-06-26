package q3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws IOException {
		File f= new File("abc3.txt");
		FileReader fr= new FileReader(f);
		char[] chr= new char[(int)f.length()];
		fr.read(chr);
		int count=0;
		for(char c:chr) {
			if(Pattern.matches("[aA]",Character.toString(c))) {
				count++;
			}
		}
		System.out.println("count of a: "+count);
	}
}
