package q1;

public class ThreadA implements Runnable {
	int prod=1;
	@Override
	public void run() {
		
		System.out.println("ThreadA start...");
		for(int i=1;i<=10;i++) {
			prod*=i;
		}
		System.out.println("ThreadA ends...");
		
	}
 
}
