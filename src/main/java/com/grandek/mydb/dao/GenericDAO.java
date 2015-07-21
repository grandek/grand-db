/**
 *
 * @author Ekkachai.K
 * @date 2 December 2014
 */
package com.grandek.mydb.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.springframework.dao.DataAccessException;

public interface GenericDAO <E, I extends Serializable> {
	    public Session getCurrentSession();
	    public List<E> findAll() throws DataAccessException;
	    public E find(I id);
	    public void create(E e);
	    public void update(E e);
	    public void delete(E e);
	    public void flush();
}
