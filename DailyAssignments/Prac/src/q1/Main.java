package q1;

public class Main{
	public static void main(String[] args)throws Exception {
		MyThread mt=new MyThread();
		//mt.start();
		synchronized (mt) {
		mt.start();//getting the lock of mt object
		System.out.println("main thread calls the wait method");
		mt.wait(2000);
		System.out.println("main thread got the notification");
		System.out.println(mt.num);
		}
		}
	}