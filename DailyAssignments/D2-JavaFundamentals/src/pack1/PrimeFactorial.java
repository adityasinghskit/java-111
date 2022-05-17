package pack1;

public class PrimeFactorial {
	static void primeNo(int n) {
		
		if(n>2 && n<100) {
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					System.out.println(i);
				}
			}
		}
		else {
			System.out.println("Invalid number");
		}
	}
	public static void main(String[] args) {
		primeNo(12);
	}
}
