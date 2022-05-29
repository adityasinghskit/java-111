package q2;

public class Parent {
public void method1() {
	System.out.println("Inside method1 of Parent");
}
private void method2() {
	System.out.println("Inside method2 of Parent");
}
 void method3() {
	 System.out.println("Inside method3 of Parent");
}
int number;

}
class Child extends Parent{
	@Override
	public void method1() {
		System.out.println("Inside method1 of Child");
		System.out.println("The no entered is : "+this.number);
	}
	@Override
	void method3() {
		System.out.println("Inside method3 of Child");
	}
	void method4() {
		System.out.println("Inside method4 of Child");
	}
}
