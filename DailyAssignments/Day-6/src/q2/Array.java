package q2;

public class Array {
public static void main(String[] args) {
	int[][] array= {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	for(int j=0;j<3;j++) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			if(array[i][j]%2==0) {
				sum+=array[i][j];
			}
		}
		System.out.println(sum);
	}
	
}
}
