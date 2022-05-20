package day4;

public class Q4 {
	void print(int i) {
		if(i>0) {
			if(i%2==1) {
				System.out.println(i);
			}else {
				int r=i%10;
				i=i-r;
				System.out.println(10*(i/10+1));
			}
		}else {
			System.out.println("Error");
		}
		
	}
	public static void main(String[] args) {
		new Q4().print(-5);
	}
}
