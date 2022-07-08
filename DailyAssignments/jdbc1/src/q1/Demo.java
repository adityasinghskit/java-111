package q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id:");
		int id=sc.nextInt();
		sc.close();
		
		//loading the jdbc driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("problem with loding the driver main class");
		}
		
		//Preparing the connection string
		String cs = "jdbc:mysql://localhost:3306/db1";
		
		//estd. the connection
		try(Connection conn= DriverManager.getConnection(cs,"root","goosebumps7");) {
		 
		 //Statement st= conn.createStatement();
		 
		 PreparedStatement ps= conn.prepareStatement("select salary from employee where eid=?");
		 ps.setInt(1, id);
		 ResultSet rs=ps.executeQuery();
		 
		 if(rs.next() ) {
			 int s=rs.getInt("salary");
		 	 System.out.println("salary of employee is "+s);
		 }
		 else
			 System.out.println("not retrieved/inserted");
		 
		
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}

}
