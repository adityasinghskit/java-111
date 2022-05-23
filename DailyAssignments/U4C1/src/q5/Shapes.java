package q5;

class Circle{
	int radius;
}
class Rectangle{
	int length;
	int breadth;
	
}
class Square{
	int side;
}
public class Shapes {
public void area(Circle circle) {
	System.out.println("Circle area: "+Math.PI*circle.radius*circle.radius);
}
public void area(Rectangle rectangle) {
	System.out.println("Rectangle area: "+rectangle.length*rectangle.breadth);
}
public void area(Square square) {
	System.out.println("Square area: "+square.side*square.side);
}


}
