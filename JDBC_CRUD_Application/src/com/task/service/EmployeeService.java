package com.task.service;

import java.sql.SQLException;

import com.task.bean.EmployeeBean;
import com.task.doa.EmployeeDAOImpl;

public class EmployeeService implements EmployeeServiceI {

	@Override
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeDAOImpl dao=new EmployeeDAOImpl();
		EmployeeBean bean1=new EmployeeBean(); 
		dao.insertEmployee(bean1);
	}
	@Override
	public void updateEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		EmployeeDAOImpl dao=new EmployeeDAOImpl();
		EmployeeBean bean1=new EmployeeBean();
		dao.updateEmployee(bean1);
		
	}
	
	@Override
	public void selectEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeDAOImpl dao=new EmployeeDAOImpl();
		EmployeeBean bean1=new EmployeeBean();
		dao.selectEmployee(bean1);
	}
	@Override
	public void deleteEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeDAOImpl dao=new EmployeeDAOImpl();
		EmployeeBean bean1=new EmployeeBean();
		dao.deleteEmployee(bean1);
	}
	
}


	