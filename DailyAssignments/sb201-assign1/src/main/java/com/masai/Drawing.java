package com.masai;

public class Drawing {
Shape s;
int sides;

//injection using setter for s
public void setS(Shape s) {
	this.s = s;
}
//injection using setter for sides
public void setSides(int sides) {
	this.sides = sides;
}
public void drawShape() {
	s.draw();
	System.out.println("Drawing complete");
}

}
