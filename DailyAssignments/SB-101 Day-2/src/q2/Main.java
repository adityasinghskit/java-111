package q2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
public static void main(String[] args) throws IOException {
	/*FileReader fr= new FileReader("abc.txt");
	int i=fr.read();
	while(i!=-1) {
		System.out.println((char)i);
		i=fr.read();
	}*/
	
	File f= new File("abc.txt");
	FileReader fr= new FileReader(f);
	char[] chr=new char[(int)f.length()];
	fr.read(chr);
	for(char c:chr) {
		System.out.println(c);
	}
}
}
