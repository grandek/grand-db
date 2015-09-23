/**
 *
 * @author Ekkachai.K
 * @date Jul 21, 2015
 */
package com.grandek.mydb.dao;

import java.util.List;

import com.grandek.mydb.model.Product;

public interface ProductDAO extends GenericDAO<Product, Integer> {
	public List<Product> findByCriteria(Product model);
}
