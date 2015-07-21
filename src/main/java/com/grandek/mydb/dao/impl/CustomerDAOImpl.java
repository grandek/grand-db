/**
 *
 * @author Ekkachai.K
 * @date Jul 21, 2015
 */
package com.grandek.mydb.dao.impl;

import org.springframework.stereotype.Repository;

import com.grandek.mydb.dao.CustomerDAO;
import com.grandek.mydb.model.Customer;
@Repository("customerDao")
public class CustomerDAOImpl extends GenericDAOImpl<Customer, Integer> implements CustomerDAO {

	public CustomerDAOImpl() {
		super(Customer.class);
	}

}
