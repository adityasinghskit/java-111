package q2;

public class Ticket {
	
	private int ticketId;
	private int price;
	private static int availableTickets;
	Ticket(){
		
	}
	//getter
	public int getId() {
		return this.ticketId;
	}
	public int getPrice() {
		return this.price;
	}
	public int getAvailable() {
		return availableTickets;
	}
	//setter
	public void setId(int i) {
		this.ticketId=i;
	}
	public void setPrice(int p) {
		this.price=p;
	}
	public void setAvailable(int a) {
		if(a>0)
		availableTickets=a;
		else 
			System.out.println("Enter valid count!");
	}
	public int calculateTicketCost(int nooftickets) {
		int no= this.getAvailable();
		if(no>=nooftickets) {
			no=no-nooftickets;
			this.setAvailable(no);
			int amount=nooftickets*this.getPrice();
			return amount;
		}else 
			return -1;
		
	}
	
}
