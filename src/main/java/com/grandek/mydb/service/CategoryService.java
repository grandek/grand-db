/**
 *
 * @author Ekkachai.K
 * @date Jul 21, 2015
 */
package com.grandek.mydb.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.grandek.mydb.model.Category;

public interface CategoryService {
	public List<Category> findAll() throws DataAccessException;

	public Category find(Integer id);

	public abstract void create(Category model);

	public abstract void update(Category model);

	public abstract void delete(Category model);

	public abstract void flush();

}
