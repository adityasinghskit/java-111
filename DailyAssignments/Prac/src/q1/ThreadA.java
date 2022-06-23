package q1;

public class ThreadA implements Runnable{
	Common c;
	String name;
	public ThreadA(Common c,String name) {
	this.c=c;
	this.name=name;
	}
	@Override
	public void run() {
	c.fun1(name);
	}
	}

	
	
