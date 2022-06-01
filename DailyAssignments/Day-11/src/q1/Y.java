package q1;

public interface Y {
	abstract void funY1();
	default void funY2() {
		System.out.println("inside Y2 of Y");
	}
	static void funY3() {
		
	}
}
