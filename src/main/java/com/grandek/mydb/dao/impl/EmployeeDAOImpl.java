/**
 *
 * @author Ekkachai.K
 * @date Jul 21, 2015
 */
package com.grandek.mydb.dao.impl;

import org.springframework.stereotype.Repository;

import com.grandek.mydb.dao.EmployeeDAO;
import com.grandek.mydb.model.Employee;
@Repository("employeeDao")
public class EmployeeDAOImpl extends GenericDAOImpl<Employee, Integer> implements EmployeeDAO {

	public EmployeeDAOImpl() {
		super(Employee.class);
	}

}
