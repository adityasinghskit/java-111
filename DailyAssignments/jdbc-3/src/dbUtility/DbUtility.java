package dbUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtility {
public static Connection provideConnection() {
	Connection conn=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Driver not found!");
	}
	String cs="jdbc:mysql://localhost:3306/db3";
	try {
		conn=DriverManager.getConnection(cs, "root", "goosebumps7");
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return conn;
}

}
