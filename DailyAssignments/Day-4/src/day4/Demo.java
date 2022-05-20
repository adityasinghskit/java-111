package day4;

public class Demo {
	Demo(){
		System.out.println("Inside Demo() of Demo class");
	}
	Demo(String s){
		System.out.println("Inside Demo(String s) of Demo class");
	}
	Demo(int i){
		System.out.println("Inside Demo(int i) of Demo class");
	}
	Demo(float f){
		System.out.println("Inside Demo(float f) of Demo class");
	}
	public static void main(String[] args) {
		new Demo();
		new Demo("abc");
		new Demo(12);
		new Demo(12.00f);
	}
}
