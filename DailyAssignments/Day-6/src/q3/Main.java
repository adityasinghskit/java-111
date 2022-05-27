package q3;

import java.util.Arrays;

public class Main {
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		//int[] arr = {10,12,5,50,11,14,15};
		int n=inputArray.length;
		int[] out=new int[n];
		//StringBuilder sb= new StringBuilder();
		
	for(int i=0;i<inputArray.length;i++) {
		boolean flag=false;
		for(int j=2;j<inputArray[i];j++) {
			if(inputArray[i]%j==0){
				flag=true;
				break;
			}
		}
		if(!flag) {
			if(out.length==0)
			out[0]=inputArray[i];
			else
				out[out.length-1]=inputArray[i];
		}
	}
	return out;
	}
	
public static void main(String[] args) {
	Main m1=new Main();
	int[] arr = {10,12,5,50,11,14,15};
	int[] ans=m1.findAndReturnPrimeNumbers(arr);
	System.out.println(Arrays.toString(ans).trim());
	
}
}
