package q1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
public static void main(String[] args) throws IOException {
	FileReader f1= new FileReader("abc.txt");
	BufferedReader br= new BufferedReader(f1);
	String line=br.readLine();
	while(line!=null) {
		System.out.println(line);
		line=br.readLine();
	}
	br.close();
}
}
