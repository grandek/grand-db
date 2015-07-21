/**
 *
 * @author Ekkachai.K
 * @date Jul 21, 2015
 */
package com.grandek.mydb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.grandek.mydb.dao.EmployeeDAO;
import com.grandek.mydb.model.Employee;
import com.grandek.mydb.service.EmployeeService;
@Transactional
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired private EmployeeDAO employeeDao;
	@Override
	public List<Employee> findAll() throws DataAccessException {
		return employeeDao.findAll();
	}

	@Override
	public Employee find(Integer id) {
		return employeeDao.find(id);
	}

	@Override
	public void create(Employee model) {
		employeeDao.create(model);
	}

	@Override
	public void update(Employee model) {
		employeeDao.update(model);
	}

	@Override
	public void delete(Employee model) {
		employeeDao.delete(model);
	}

	@Override
	public void flush() {
		employeeDao.flush();
	}

}
