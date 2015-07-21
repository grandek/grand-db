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

import com.grandek.mydb.dao.CustomerDAO;
import com.grandek.mydb.model.Customer;
import com.grandek.mydb.service.CustomerService;
@Transactional
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired private CustomerDAO customerDao;
	@Override
	public List<Customer> findAll() throws DataAccessException {
		return customerDao.findAll();
	}

	@Override
	public Customer find(Integer id) {
		return customerDao.find(id);
	}

	@Override
	public void create(Customer model) {
		customerDao.create(model);
	}

	@Override
	public void update(Customer model) {
		customerDao.update(model);
	}

	@Override
	public void delete(Customer model) {
		customerDao.delete(model);
	}

	@Override
	public void flush() {
		customerDao.flush();
	}

}
