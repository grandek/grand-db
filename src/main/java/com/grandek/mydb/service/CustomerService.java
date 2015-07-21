/**
 *
 * @author Ekkachai.K
 * @date Jul 21, 2015
 */
package com.grandek.mydb.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.grandek.mydb.model.Customer;

public interface CustomerService {
	public List<Customer> findAll() throws DataAccessException;

	public Customer find(Integer id);

	public abstract void create(Customer model);

	public abstract void update(Customer model);

	public abstract void delete(Customer model);

	public abstract void flush();

}
