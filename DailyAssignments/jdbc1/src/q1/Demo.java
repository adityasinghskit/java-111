package q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Demo {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("problem with loding the driver main class");
		}
			

		
		
		String cs = "jdbc:mysql://localhost:3306/sb101db";
		
			
		try {
		 Connection conn= DriverManager.getConnection(cs,"root","goosebumps7");
		
		 Statement st= conn.createStatement();
		 
		 int x= st.executeUpdate("insert into student values('s6','ram','delhi',9829527976,13)");
		 
		 if(x >0 )
			 System.out.println("inserted..");
		 else
			 System.out.println("not inserted");
		 
		
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		 
		
		
		
	}

}
