package com.examples.dao;

import java.util.List;

import com.examples.model.EmpTbl;

public interface EmployeeDAO {
	
	public void addEmployee(EmpTbl employee);
	 
    public List<EmpTbl> getAllEmployees();
 
    public void deleteEmployee(Integer employeeId);
 
    public EmpTbl updateEmployee(EmpTbl employee);
 
    public EmpTbl getEmployee(int employeeid);
}
