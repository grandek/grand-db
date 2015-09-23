/**
 *
 * @author Ekkachai.K
 * @date Jul 20, 2015
 */
package com.grandek.mydb.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.grandek.mydb.service.CategoryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring4.xml" })
@Transactional
@TransactionConfiguration(defaultRollback=true)
public class SpringServiceTest {
	@Autowired CategoryService categoryService;
	
	@Test
	public void testFindAllNotNull() {
		assertNotNull(categoryService.findAll());
	}
	
	@Test
	public void testFindAllCategoryMustEqual() {
		List<Category> categories = categoryService.findAll();
		assertEquals(2, categories.size());
	}
	
	@Test
	public void testFindByIdMustEquals() {
		assertEquals("Beverages",categoryService.find(1).getCategoryName());
	}
	
	@Test
	public void testCreate() {
		Category category = new Category();
		category.setCategoryName("Snack");
		categoryService.create(category);
		assertNotNull(category.getCategoryId());
	}
	
	@Test
	public void testUpdate() {
		Category category = categoryService.find(1);
		category.setCategoryName("UpdateCategory");
		categoryService.update(category);
		assertEquals("UpdateCategory",categoryService.find(1).getCategoryName());
	}
	
	@Test
	public void testDelete() {
		Category category = categoryService.find(1);
		categoryService.delete(category);
		assertNull(categoryService.find(1));;
	}

}
