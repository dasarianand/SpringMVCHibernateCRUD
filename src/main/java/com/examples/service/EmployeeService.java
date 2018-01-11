package com.examples.service;

import java.util.List;

import com.examples.model.EmpTbl;
 
public interface EmployeeService {
     
    public void addEmployee(EmpTbl employee);
 
    public List<EmpTbl> getAllEmployees();
 
    public void deleteEmployee(Integer employeeId);
 
    public EmpTbl getEmployee(int employeeid);
 
    public EmpTbl updateEmployee(EmpTbl employee);
}