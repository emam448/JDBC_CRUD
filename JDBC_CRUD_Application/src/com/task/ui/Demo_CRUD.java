package com.task.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.task.bean.EmployeeBean;
import com.task.service.EmployeeService;

public class Demo_CRUD {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Select your option"); 
		System.out.println("1.Insert Employee Data"); //create C
		System.out.println("2.Update Employee Data"); //Update U
		System.out.println("3.SelectEmployee Data"); //Read R
		System.out.println("4.Delete Employee Data"); //Delete D
		
		int option=sc.nextInt();
		
		switch(option)
		{
		case 1:{
			//insert
			insertEmployee();
			break;
		}
		case 2:{
			//Update
			updateEmployee();
			break;
		}
		case 3:{
			selectEmployee();
			break;
		}
		case 4:{
			deleteEmployee();
			break;
		}
		default:{
			System.out.println("Your Entered option is not match");
		}
		}

	}


	private static void insertEmployee() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeService service=new EmployeeService();
		EmployeeBean bean=new EmployeeBean();
		//or we can use scanner class
		
		System.out.println("Enter Empid");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		bean.setEmpid(id);
		
		System.out.println("Enter EmpName");
		String name=sc.next();
		bean.setEmpname(name);
		
		System.out.println("Enter Address");
		String address=sc.next();
		bean.setEmpaddress(address);
		
		service.insertEmployee(bean);
	}
	
	private static void updateEmployee() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		EmployeeService service=new EmployeeService();
		EmployeeBean bean=new EmployeeBean();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee Id that you want update");
		int id=sc.nextInt();
		bean.setEmpid(id);
		
		System.out.println("Enter Employee name");
		String name=sc.next();
		bean.setEmpname(name);
		
		System.out.println("Enter Employee Address");
		String address=sc.next();
		bean.setEmpaddress(address);
		
		service.updateEmployee(bean);
		
	}
	
	private static void selectEmployee() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeService service = new EmployeeService();
		EmployeeBean bean=new EmployeeBean();
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter EmpId of the employee to view details: ");
	    int id = sc.nextInt();

	    service.selectEmployee(bean);
		
	}
	

	private static void deleteEmployee() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeService service=new EmployeeService();
		EmployeeBean bean=new EmployeeBean();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Employee id that you want to delete");
		int id=sc.nextInt();
		
		service.deleteEmployee(bean);
	}

	
	

}
