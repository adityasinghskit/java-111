package q4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter employee id: ");
	int eid=sc.nextInt();
	System.out.println("ENter employee name: ");
	String name=sc.next();
	System.out.println("Enter employee salary: ");
	int salary=sc.nextInt();
	sc.close();
	//loading the jdbc driver
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Problem loading the driver main class");
	}
	//connection string
	String cs="jdbc:mysql://localhost:3306/db1";
	
	//estd connection
	try(Connection conn=DriverManager.getConnection(cs, "root", "goosebumps7");) {
		PreparedStatement ps=conn.prepareStatement("insert into employee(eid,name,salary)");
		
		int x=ps.executeUpdate();
		
		if(x>0) {
			System.out.println(x+" records updated");
		}else {
			System.out.println("not updated");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
