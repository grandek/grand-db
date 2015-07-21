/**
 *
 * @author Ekkachai.K
 * @date Jul 20, 2015
 */
package com.grandek.mydb.model;

import static org.junit.Assert.*;

import java.util.Locale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.grandek.mydb.dao.CategoryDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring4.xml" })
@Transactional
@TransactionConfiguration(defaultRollback=true)
public class SpringDAOTest {
	@Autowired private CategoryDAO categoryDao;
	@Autowired private MessageSource message;
	@Test
	public void testFindAllNotNull() {
		assertNotNull(categoryDao.findAll());
	}
	
	@Test
	public void testFindByIdMustEquals() {
		assertEquals("Beverages",categoryDao.find(1).getCategoryName());
	}
	
	@Test
	public void testCreate() {
		Category category = new Category();
		category.setCategoryName("Snack");
		categoryDao.create(category);
		assertNotNull(category.getCategoryId());
	}
	
	@Test
	public void testUpdate() {
		Category category = categoryDao.find(1);
		category.setCategoryName("UpdateCategory");
		categoryDao.update(category);
		assertEquals("UpdateCategory",categoryDao.find(1).getCategoryName());
	}
	
	@Test
	public void testDelete() {
		Category category = categoryDao.find(1);
		categoryDao.delete(category);
		assertNull(categoryDao.find(1));;
	}
	
//	@Test
//	public void testMessageReturnCorrect(){
//		assertEquals("Welcome",message.getMessage("welcome.message", null, Locale.ENGLISH));
//	}

}
