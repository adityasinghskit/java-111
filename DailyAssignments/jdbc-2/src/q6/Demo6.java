package q6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo6 {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Driver not found!");
	}
	String cs="jdbc:mysql://localhost:3306/db2";
	try(Connection conn=DriverManager.getConnection(cs, "root", "goosebumps7")) {
		PreparedStatement ps=conn.prepareStatement("select * from employee2 where salary<8000");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			int i=rs.getInt("eid");
			String n=rs.getString("name");
			String a=rs.getString("address");
			int s=rs.getInt("salary");
			
			System.out.println("Employee id: "+i);
			System.out.println("Employee name: "+n);
			System.out.println("Employee address: "+a);
			System.out.println("Employee salary: "+s);
			System.out.println("==================");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
