/**
 *
 * @author Ekkachai.K
 * @date Jul 20, 2015
 */
package com.grandek.mydb.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.grandek.mydb.dao.CategoryDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring4.xml" })
@Transactional
@TransactionConfiguration(defaultRollback=true)
public class JacksonTest {
	@Autowired private CategoryDAO categoryDao;
	
	@Test//(expected = JsonMappingException.class)
	public void givenBidirectionRelation_whenSerializing_thenException()
	  throws JsonProcessingException {
	    new ObjectMapper().writeValueAsString(categoryDao.find(1));
	}
	


}
