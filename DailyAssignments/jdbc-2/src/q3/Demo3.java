package q3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo3 {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Driver not found!");
	}
	String cs="jdbc:mysql://localhost:3306/db2";
	try(Connection conn=DriverManager.getConnection(cs, "root", "goosebumps7");) {
		PreparedStatement ps=conn.prepareStatement("update employee2 set salary=salary+500");
		int x=ps.executeUpdate();
		if(x>0) {
			System.out.println("Updated "+x+" "
					+ "records");
		}else {
			System.out.println("No records to update!");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
