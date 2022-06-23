package q3;

public class Common{
	public void fun1(String name){
		synchronized (Common.class) {
			System.out.print("Welcome ");
			try{
			Thread.sleep(1000);
			}
			catch(Exception ee){
			}
			System.out.println(name);
			}
		}
		
}
