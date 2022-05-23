package q5;


public class Main {
public static void main(String[] args) {
	Shapes s1= new Shapes();
	Circle c1= new Circle();
	c1.radius=7;
	Rectangle r1= new Rectangle();
	r1.length=10;
	r1.breadth=10;
	Square sq1= new Square();
	sq1.side=5;
	s1.area(c1);
	s1.area(r1);
	s1.area(sq1);
}
}
