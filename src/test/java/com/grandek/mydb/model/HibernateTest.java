/**
 *
 * @author Ekkachai.K
 * @date Jul 20, 2015
 */
package com.grandek.mydb.model;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Test;

public class HibernateTest {
	private static final SessionFactory sessionFactory = createSessionFactory();
	@Test
	public void testListProductNotNull() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Product");
		List<Product> products = query.list();
		for (Product product : products){
			System.out.println(product.getProductName());
		}
		session.getTransaction().commit();
		session.close();
		assertNotNull(products);
	}
	
	public static SessionFactory createSessionFactory() {
	    Configuration configuration = new Configuration();
	    configuration.configure();
	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
	            configuration.getProperties()). buildServiceRegistry();
	    return configuration.buildSessionFactory(serviceRegistry);
	}
	
	@Test
	public void testListCategoryMustEqual() {
		Session session = sessionFactory.openSession();
//		session.beginTransaction();
		Query query = session.createQuery("from Category");
		List<Category> cates = query.list();
//		session.getTransaction().commit();
		session.close();
		assertEquals(2, cates.size());
	}

}
