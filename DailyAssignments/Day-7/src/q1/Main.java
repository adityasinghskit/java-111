package q1;

public class Main {
	
	public static void main(String[] args) {
	Employee e1=new Employee();
	e1.name="Aditya";
	e1.age=26;
	e1.phoneNumber="9521827360";
	e1.address="109/34";
	e1.salary=50000.00;
	Manager m1= new Manager();
	m1.name="Arjun";
	m1.age=37;
	m1.phoneNumber="9928228503";
	m1.address="Indore";
	m1.salary=200000.00;
	e1.print();
	m1.print();
}
}
