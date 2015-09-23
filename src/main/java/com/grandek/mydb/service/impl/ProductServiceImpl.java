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

import com.grandek.mydb.dao.ProductDAO;
import com.grandek.mydb.model.Product;
import com.grandek.mydb.service.ProductService;
@Transactional
@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired private ProductDAO productDao;
	@Override
	public List<Product> findAll() throws DataAccessException {
		return productDao.findAll();
	}

	@Override
	public Product find(Integer id) {
		return productDao.find(id);
	}

	@Override
	public void create(Product model) {
		productDao.create(model);
	}

	@Override
	public void update(Product model) {
		productDao.update(model);
	}

	@Override
	public void delete(Product model) {
		productDao.delete(model);
	}

	@Override
	public void flush() {
		productDao.flush();
	}

	@Override
	public List<Product> findByCriteria(Product model) {
		return productDao.findByCriteria(model);
	}

}
