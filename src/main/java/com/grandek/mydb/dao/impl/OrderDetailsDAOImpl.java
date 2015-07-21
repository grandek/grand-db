/**
 *
 * @author Ekkachai.K
 * @date Jul 21, 2015
 */
package com.grandek.mydb.dao.impl;

import org.springframework.stereotype.Repository;

import com.grandek.mydb.dao.OrdersDAO;
import com.grandek.mydb.model.Orders;
@Repository("ordersDao")
public class OrderDetailsDAOImpl extends GenericDAOImpl<Orders, Integer> implements OrdersDAO {

	public OrderDetailsDAOImpl() {
		super(Orders.class);
	}

}
