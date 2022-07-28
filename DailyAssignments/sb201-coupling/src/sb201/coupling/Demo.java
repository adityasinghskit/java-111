package sb201.coupling;

public class Demo {
public static void main(String[] args) {
	Travel tr= new Travel();
	
	tr.setV(new Car());
	tr.journey();
}
}
