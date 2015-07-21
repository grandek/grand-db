/**
 *
 * @author Ekkachai.K
 * @date 2 December 2014
 */
package com.grandek.mydb.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.grandek.mydb.dao.GenericDAO;

public class GenericDAOImpl<E, I extends Serializable> implements GenericDAO<E, I> {
    private Class<E> entityClass;

    @Autowired
    private SessionFactory sessionFactory;

    public GenericDAOImpl(Class<E> entityClass) {
        this.entityClass = entityClass;
    }

    @Override
    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<E> findAll() throws DataAccessException {
        return getCurrentSession().createCriteria(entityClass).list();
    }

    @Override
    @SuppressWarnings("unchecked")
    public E find(I id) {
        return (E) getCurrentSession().get(entityClass, id);
    }

    @Override
    public void create(E e) {
        getCurrentSession().save(e);
    }

    @Override
    public void update(E e)  {
        getCurrentSession().update(e);
    }

    @Override
    public void delete(E e) {
        getCurrentSession().delete(e);
    }

    @Override
    public void flush() {
        getCurrentSession().flush();
    }
}