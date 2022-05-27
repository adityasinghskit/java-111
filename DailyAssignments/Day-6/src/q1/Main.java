package q1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static String reverseString(String str) {
		int n= str.length();
		char[] temp1=str.toCharArray();
		char[] temp2=new char[n];
		for(int i=n-1;i>=0;i--) {
			temp2[n-1-i]=temp1[i];
			//System.out.println(temp2[n-1-i]);
		}
		String str2=Arrays.toString(temp2);
		return str2;
	}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a string to reverse: ");
		String strI=scan.next();
		String strF=reverseString(strI);
		System.out.println("Initial string is: "+strI);
		System.out.println("Reversed string is "+strF);
		scan.close();
	}
}
