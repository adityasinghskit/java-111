package q2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class EmployeeBonus {
	public double findBonus(String doj) throws InvalidAge {
		try {
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld= LocalDate.parse(doj, dtf);
		LocalDate now=LocalDate.now();
		Period diff= Period.between(ld, now);
		int years=diff.getYears();
		if(diff.getDays()<0 || diff.getMonths()<0 || diff.getYears()<0) {
			System.out.println("Age should not be in the future");
			return 0.00;
		}else if(years==0) {
			return 5000.00;
		}else if(years==1) {
			return 8000.00;
		}else  {
			return 10000.00;
		}
		}
		catch(DateTimeParseException dtp) {
			System.out.println(dtp.getMessage());
			InvalidAge ia= new InvalidAge("Please pass the date in the correct format");
				throw ia;
		}
	}
}
