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

import com.grandek.mydb.dao.OrderDetailsDAO;
import com.grandek.mydb.model.OrderDetails;
import com.grandek.mydb.service.OrderDetailsService;
@Transactional
@Service("orderDetailsService")
public class OrderDetailsServiceImpl implements OrderDetailsService {

	@Autowired private OrderDetailsDAO orderDetailsDao;
	@Override
	public List<OrderDetails> findAll() throws DataAccessException {
		return orderDetailsDao.findAll();
	}

	@Override
	public OrderDetails find(Integer id) {
		return orderDetailsDao.find(id);
	}

	@Override
	public void create(OrderDetails model) {
		orderDetailsDao.create(model);
	}

	@Override
	public void update(OrderDetails model) {
		orderDetailsDao.update(model);
	}

	@Override
	public void delete(OrderDetails model) {
		orderDetailsDao.delete(model);
	}

	@Override
	public void flush() {
		orderDetailsDao.flush();
	}

}
