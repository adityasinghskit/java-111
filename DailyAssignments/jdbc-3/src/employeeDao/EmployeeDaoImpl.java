package employeeDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbUtility.DbUtility;
import employeeBeanClass.Employee;
import employeeException.EmployeeException;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public int getSalaryById(int id) {
		int salary=-1;
		try(Connection conn=DbUtility.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select salary from employee3 where eid=? ");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				salary=rs.getInt("salary");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return salary;
	}

	@Override
	public List<Employee> getEmployeeInfo() throws EmployeeException {
		
		List<Employee> employees=new ArrayList<>();
		try(Connection conn=DbUtility.provideConnection()) {
			PreparedStatement ps=conn.prepareStatement("select * from employee3");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int i=rs.getInt("eid");
				String n=rs.getString("name");
				String a=rs.getString("address");
				int s=rs.getInt("salary");
				
				Employee employee= new Employee(i,n,a,s);
				
				employees.add(employee);
			}
			if(employees.size()<=0) {
				throw new EmployeeException("No employee present in the table");
			}
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		
		return employees;
	}

	@Override
	public boolean addBonus(int bonus) {
		boolean b=false;
		try(Connection conn=DbUtility.provideConnection()) {
			PreparedStatement ps=conn.prepareStatement("update employee set salary=salary+?");
			ps.setInt(1, bonus);
			int x=ps.executeUpdate();
			if(x>0) {
				b=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return b;
	}

	@Override
	public boolean insertEmployeeWOAddress(int eid, String name, String address) {
		boolean b=false;
		try(Connection conn=DbUtility.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("insert into employee3 (int eid,String name,String address) values(?,?,?)");
			ps.setInt(1, eid);
			ps.setString(2, name);
			ps.setString(3, address);
			int x=ps.executeUpdate();
			if(x>0) {
				b=false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public Employee getEmployeeById(int id) throws EmployeeException {
		Employee employee= null;
		try(Connection conn= DbUtility.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("select * from employee3 where eid=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				int i=rs.getInt("eid");
				String n=rs.getString("name");
				String a=rs.getString("address");
				int s=rs.getInt("salary");
				
				employee=new Employee(i,n,a,s);
			}else {
				throw new EmployeeException("No record of employee with id= "+id+" found.");
			}
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		return employee;
	}

	@Override
	public List<Employee> getEmployeeWithSalaryBelow(int salary)throws EmployeeException {
		List<Employee> employees= new ArrayList<>();
		try(Connection conn=DbUtility.provideConnection()) {
			PreparedStatement ps=conn.prepareStatement("select * from employee3 where salary<?");
			ps.setInt(1, salary);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				int i=rs.getInt("eid");
				String n=rs.getString("name");
				String a=rs.getString("address");
				int s=rs.getInt("salary");
				
				Employee employee=new Employee(i,n,a,s);
				employees.add(employee);
			}
			if(employees.size()<=0) {
				throw new EmployeeException("No matching records found");
			}
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		return employees;
	}
	
}
