/**
 *
 * @author Ekkachai.K
 * @date Jul 21, 2015
 */
package com.grandek.mydb.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.grandek.mydb.dao.ProductDAO;
import com.grandek.mydb.model.Product;
@Repository("productDao")
public class ProductDAOImpl extends GenericDAOImpl<Product, Integer> implements ProductDAO {

	public ProductDAOImpl() {
		super(Product.class);
	}

	@Override
	public List<Product> findByCriteria(Product model) {
		Criteria c = getCurrentSession().createCriteria(Product.class);
		if (!StringUtils.isEmpty(model.getProductName())) {
		 c.add(Restrictions.like("productName", "%"+model.getProductName()+"%"));
		}
		if (model.getCategory() != null && model.getCategory().getCategoryId() != null) {
		 c.add(Restrictions.eq("category", model.getCategory()));
		}
		return c.list();
	}
	
	

}
