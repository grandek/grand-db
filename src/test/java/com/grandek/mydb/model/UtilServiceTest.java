/**
 *
 * @author Ekkachai.K
 * @date Jul 20, 2015
 */
package com.grandek.mydb.model;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.grandek.mydb.service.impl.UtilService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring4.xml" })
@Transactional
@TransactionConfiguration(defaultRollback=false)
public class UtilServiceTest {
	@Autowired UtilService utilService;
	
	@Test
	public void testSave() {
		Category category = new Category();
		category.setCategoryName("Snack");
		
		Product product = new Product();
//		product.setProductName("333");
		
		utilService.save(category, product);
		assertNotNull(category.getCategoryId());
	}

}
