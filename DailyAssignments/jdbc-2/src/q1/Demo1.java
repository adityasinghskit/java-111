package q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter employee id: ");
	int id=sc.nextInt();
	sc.close();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Driver not found");
	}
	String cs="jdbc:mysql://localhost:3306/db2";

	try(Connection conn = DriverManager.getConnection(cs, "root", "goosebumps7")) {
		PreparedStatement ps=conn.prepareStatement("select salary from employee2 where eid=? ");
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			int s=rs.getInt("salary");
			System.out.println("Employee salary is: "+s);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
	
}
}
