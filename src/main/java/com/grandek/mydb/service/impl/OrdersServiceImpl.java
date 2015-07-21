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

import com.grandek.mydb.dao.OrdersDAO;
import com.grandek.mydb.model.Orders;
import com.grandek.mydb.service.OrdersService;
@Transactional
@Service("ordersService")
public class OrdersServiceImpl implements OrdersService {

	@Autowired private OrdersDAO ordersDao;
	@Override
	public List<Orders> findAll() throws DataAccessException {
		return ordersDao.findAll();
	}

	@Override
	public Orders find(Integer id) {
		return ordersDao.find(id);
	}

	@Override
	public void create(Orders model) {
		ordersDao.create(model);
	}

	@Override
	public void update(Orders model) {
		ordersDao.update(model);
	}

	@Override
	public void delete(Orders model) {
		ordersDao.delete(model);
	}

	@Override
	public void flush() {
		ordersDao.flush();
	}

}
