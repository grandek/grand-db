/**
 *
 * @author Ekkachai.K
 * @date Jul 20, 2015
 */
package com.grandek.mydb.dao.impl;

import org.springframework.stereotype.Repository;

import com.grandek.mydb.dao.CategoryDAO;
import com.grandek.mydb.model.Category;
@Repository(value="categoryDao")
public class CategoryDAOImpl extends GenericDAOImpl<Category, Integer> implements CategoryDAO {

	public CategoryDAOImpl() {
		super(Category.class);
	}

}
