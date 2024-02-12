package com.task.doa;

import java.sql.SQLException;

import com.task.bean.EmployeeBean;

public interface IEmployeeDAO {
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException;
	public void updateEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException;
	public void selectEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException;
	public void deleteEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException;
}

