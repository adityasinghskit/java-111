package q2;

public class Main {
public static void main(String[] args) {
	Ticket t1=new Ticket();
	t1.setId(123);
	t1.setPrice(150);
	t1.setAvailable(18);
	System.out.println(t1.calculateTicketCost(10));
	System.out.println("Tickets available after booking:"+t1.getAvailable());
}
}
