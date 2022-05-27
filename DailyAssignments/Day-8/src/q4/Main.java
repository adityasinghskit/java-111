package q4;

public class Main {

	
public static void main(String[] args) {
	Animal[] a1= new Animal[3];
	//a1[0]=(Dog)a1[0];
	a1[0]=new Dog();
	a1[1]=new Cat();
	a1[2]=new Tiger();
	//Cat c1=(Cat)a1[1];
	//Tiger t1=(Tiger)a1[2];
	for(int i=0;i<a1.length;i++) {
		a1[i].makeNoise();
		a1[i].eat();
		a1[i].walk();
	}
	}
}

