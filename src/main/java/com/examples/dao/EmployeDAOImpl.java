package com.examples.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.examples.model.EmpTbl;

@Repository
public class EmployeDAOImpl implements EmployeeDAO {
	
	
	@Autowired
    private SessionFactory sessionFactory;
 
    public void addEmployee(EmpTbl employee) {
        sessionFactory.getCurrentSession().saveOrUpdate(employee);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<EmpTbl> getAllEmployees() {
 
        return sessionFactory.getCurrentSession().createQuery("from com.examples.model.EmpTbl").list();
    }
 
    @Override
    public void deleteEmployee(Integer employeeId) {
    	EmpTbl employee = (EmpTbl) sessionFactory.getCurrentSession().load(
    			EmpTbl.class, employeeId);
        if (null != employee) {
            this.sessionFactory.getCurrentSession().delete(employee);
        }
 
    }
 
    public EmpTbl getEmployee(int empid) {
        return (EmpTbl) sessionFactory.getCurrentSession().get(
        		EmpTbl.class, empid);
    }
 
    @Override
    public EmpTbl updateEmployee(EmpTbl employee) {
        sessionFactory.getCurrentSession().update(employee);
        return employee;
    }
}
