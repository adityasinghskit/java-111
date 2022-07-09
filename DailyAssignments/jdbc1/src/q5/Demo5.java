package q5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo5 {
public static void main(String[] args) {
	//loading jdbc driver
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Cannot load the driver");
	}
	//connection string
	String cs="jdbc:mysql://localhost:3306/db1";
	//estd connection
	try(Connection conn=DriverManager.getConnection(cs, "root", "goosebumps7");) {
		PreparedStatement ps=conn.prepareStatement("select * from employee where eid=5");
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			int i=rs.getInt("eid");
			String n=rs.getString("name");
			String a=rs.getString("address");
			int s=rs.getInt("salary");
			
			System.out.println("Employee id: "+i);
			System.out.println("Employee name: "+n);
			System.out.println("Employee address: "+a);
			System.out.println("Employee salasry: "+s);
		}else {
			System.out.println("Record not found");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}
}
