/**
 *
 * @author Ekkachai.K
 * @date Jul 21, 2015
 */
package com.grandek.mydb.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.grandek.mydb.model.OrderDetails;

public interface OrderDetailsService {
	public List<OrderDetails> findAll() throws DataAccessException;

	public OrderDetails find(Integer id);

	public abstract void create(OrderDetails model);

	public abstract void update(OrderDetails model);

	public abstract void delete(OrderDetails model);

	public abstract void flush();

}
