/**
 *
 * @author Ekkachai.K
 * @date Jul 21, 2015
 */
package com.grandek.mydb.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.grandek.mydb.model.Product;

public interface ProductService {
	public List<Product> findAll() throws DataAccessException;

	public Product find(Integer id);

	public abstract void create(Product model);

	public abstract void update(Product model);

	public abstract void delete(Product model);

	public abstract void flush();

}
