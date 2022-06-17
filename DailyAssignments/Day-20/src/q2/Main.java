package q2;

import java.util.*;

public class Main {
public static void main(String[] args) {
	List<String> al=new ArrayList<>();
	al.add("Jaipur");
	al.add("Joadhpur");
	al.add("Udaipur");
	al.add("Kota");
	al.add("Bikaner");
	Intr i1=l -> {
		Collections.sort(l);
		Collections.reverse(l);
		System.out.println(al);
	};
	
	i1.sortList(al);
	
}
}
