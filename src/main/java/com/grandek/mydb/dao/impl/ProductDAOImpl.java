/**
 *
 * @author Ekkachai.K
 * @date Jul 21, 2015
 */
package com.grandek.mydb.dao.impl;

import org.springframework.stereotype.Repository;

import com.grandek.mydb.dao.ProductDAO;
import com.grandek.mydb.model.Product;
@Repository("productDao")
public class ProductDAOImpl extends GenericDAOImpl<Product, Integer> implements ProductDAO {

	public ProductDAOImpl() {
		super(Product.class);
	}

}
