package com.examples.service;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examples.dao.EmployeeDAO;
import com.examples.model.EmpTbl;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	private static final Logger logger = Logger.getLogger(EmployeeServiceImpl.class);
	
    @Autowired
    private EmployeeDAO employeeDAO;
 
    @Override
    @Transactional
    public void addEmployee(EmpTbl employee) {
        employeeDAO.addEmployee(employee);
    }
 
    @Override
    @Transactional
    public List<EmpTbl> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
 
    @Override
    @Transactional
    public void deleteEmployee(Integer employeeId) {
        employeeDAO.deleteEmployee(employeeId);
    }
 
    public EmpTbl getEmployee(int empid) {
        return employeeDAO.getEmployee(empid);
    }
 
    public EmpTbl updateEmployee(EmpTbl employee) {
        // TODO Auto-generated method stub
        return employeeDAO.updateEmployee(employee);
    }
 
    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
}
