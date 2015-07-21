/**
 *
 * @author Ekkachai.K
 * @date Jul 21, 2015
 */
package com.grandek.mydb.dao.impl;

import org.springframework.stereotype.Repository;

import com.grandek.mydb.dao.OrderDetailsDAO;
import com.grandek.mydb.model.OrderDetails;
@Repository("orderDetailsDao")
public class OrdersDAOImpl extends GenericDAOImpl<OrderDetails, Integer> implements OrderDetailsDAO {

	public OrdersDAOImpl() {
		super(OrderDetails.class);
	}

}
