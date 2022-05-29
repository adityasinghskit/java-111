package q1;

import java.util.Arrays;

public class Student {
public static void main(String[] args) {
	String s1="abc";
	String[] arr1= s1.split("");
	int n=arr1.length;
	String[] arr2= new String[n];
	for(int i=n-1;i>=0;i--) {
		arr2[n-1-i]=arr1[i];
	}
	System.out.println(Arrays.toString(arr2));
	
}
	
	
}
