/**
 *
 * @author Ekkachai.K
 * @date Jul 24, 2015
 */
package com.grandek.mydb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.grandek.mydb.model.Category;
import com.grandek.mydb.model.Product;
import com.grandek.mydb.service.CategoryService;
import com.grandek.mydb.service.ProductService;

@Transactional
@Service
public class UtilService {
	@Autowired private CategoryService categoryService;
	@Autowired private ProductService productService;
	
	public void save(Category category, Product product){
		categoryService.create(category);
		productService.create(product);
		
	}
}
