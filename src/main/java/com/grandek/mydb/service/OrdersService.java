/**
 *
 * @author Ekkachai.K
 * @date Jul 21, 2015
 */
package com.grandek.mydb.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.grandek.mydb.model.Orders;

public interface OrdersService {
	public List<Orders> findAll() throws DataAccessException;

	public Orders find(Integer id);

	public abstract void create(Orders model);

	public abstract void update(Orders model);

	public abstract void delete(Orders model);

	public abstract void flush();

}
