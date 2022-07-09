package q4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo4 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter employee id: ");
	int id=sc.nextInt();
	System.out.println("ENter employee name: ");
	String name=sc.next();
	System.out.println("Enter employee salary: ");
	int salary=sc.nextInt();
	sc.close();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Driver not found!");
	}
	String cs="jdbc:mysql://localhost:3306/db2";
	try(Connection conn=DriverManager.getConnection(cs, "root", "goosebumps7");) {
		PreparedStatement ps=conn.prepareStatement("insert into employee2 (eid,name,salary) values(?,?,?)");
		
		ps.setInt(1,id);
		ps.setString(2, name);
		ps.setInt(3, salary);
		int x=ps.executeUpdate();
		if(x>0) {
			System.out.println("Update sucessful.");
		}else {
			System.out.println("Unable to update!");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
