/**
 *
 * @author Ekkachai.K
 * @date Jul 21, 2015
 */
package com.grandek.mydb.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.grandek.mydb.model.Employee;

public interface EmployeeService {
	public List<Employee> findAll() throws DataAccessException;

	public Employee find(Integer id);

	public abstract void create(Employee model);

	public abstract void update(Employee model);

	public abstract void delete(Employee model);

	public abstract void flush();

}
