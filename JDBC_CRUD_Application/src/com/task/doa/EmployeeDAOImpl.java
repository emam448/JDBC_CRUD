package com.task.doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.task.bean.EmployeeBean;
import com.task.util.EmployeeUtil;

public class EmployeeDAOImpl implements IEmployeeDAO{

	public static PreparedStatement pst=null;
	public static Connection connection=null;
	
	@Override
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int empId=bean.getEmpid();
		String empName=bean.getEmpname();
		String empAddress=bean.getEmpaddress();
		
		connection=EmployeeUtil.getDBConnection();
		
		pst=connection.prepareStatement("insert into emp values(?,?,?)");
		pst.setInt(1, empId);
		pst.setString(2, empName);
		pst.setString(3, empAddress);
		
		pst.executeUpdate();
		System.out.println("Inserted one record");
	}

	public void updateEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		int empId=bean.getEmpid();
		String empName=bean.getEmpname();
		String empAddress=bean.getEmpaddress();
		
		connection =EmployeeUtil.getDBConnection();
		
		pst=connection.prepareStatement("update emp SET empname = ?,empaddress = ? where empid = ?");
		pst.setString(1, empName);
		pst.setString(2, empAddress);
		pst.setInt(3, empId);
		
		pst.executeUpdate();
		
		System.out.println("Updated one record");
}

	public void selectEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int empId=bean.getEmpid();
		String empName=bean.getEmpname();
		String empAddress=bean.getEmpaddress();
		
		connection = EmployeeUtil.getDBConnection();
	    pst = connection.prepareStatement("SELECT * FROM emp where empid = ?");
		pst.setInt(1, empId);

	    ResultSet rs = pst.executeQuery();
	    if (rs.next()) {
	        System.out.println("Employee Details:");
	        System.out.println("ID: " + rs.getInt("empid"));
	        System.out.println("Name: " + rs.getString("empname"));
	        System.out.println("Address: " + rs.getString("empaddress"));
	    } else {
	        System.out.println("Employee not found");
	    }
		
	}

	public void deleteEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int empId=bean.getEmpid();
		
		connection=EmployeeUtil.getDBConnection();
		pst=connection.prepareStatement("DELETE FROM emp where empid= ? ");
		pst.setInt(1, empId);
		
		pst.executeUpdate();
		
		System.out.println("Deleted");
	}
	

}
