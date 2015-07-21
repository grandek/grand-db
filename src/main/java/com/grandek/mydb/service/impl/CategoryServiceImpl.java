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

import com.grandek.mydb.dao.CategoryDAO;
import com.grandek.mydb.model.Category;
import com.grandek.mydb.service.CategoryService;
@Transactional
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

	@Autowired private CategoryDAO categoryDao;
	@Override
	public List<Category> findAll() throws DataAccessException {
		return categoryDao.findAll();
	}

	@Override
	public Category find(Integer id) {
		return categoryDao.find(id);
	}

	@Override
	public void create(Category model) {
		categoryDao.create(model);
	}

	@Override
	public void update(Category model) {
		categoryDao.update(model);
	}

	@Override
	public void delete(Category model) {
		categoryDao.delete(model);
	}

	@Override
	public void flush() {
		categoryDao.flush();
	}

}
