package q1;

public class Main {
	public static void main(String[] args) {
		ThreadA t1= new ThreadA();
		Thread ta= new Thread(t1);
		ta.start();
		try {
			ta.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main Thead start...");
		System.out.println("Product of first ten digits: "+t1.prod);
	}

}
