package q1;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		Path p1= Paths.get("d://abc.txt");
		List<String> list=Files.readAllLines(p1);
		System.out.println("Reading from the class");
		for(String str: list) {
			System.out.println(str);
	}

}
}
