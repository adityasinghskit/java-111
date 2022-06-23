package q1;

public class MyThread extends Thread{
	int num=0;
	@Override
	public void run() {
	synchronized (this) {
	System.out.println("child thread performing calculation");
	for(int i=0;i<=100;i++){
	num=num+i;
	}
	System.out.println("child thread giving the notification");
	this.notify();
	}
	}
	}


