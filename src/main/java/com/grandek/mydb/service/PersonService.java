/**
 *
 * @author Ekkachai.K
 * @date Jul 21, 2015
 */
package com.grandek.mydb.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.grandek.mydb.model.Person;

public interface PersonService {
	public List<Person> findAll() throws DataAccessException;

	public Person find(Integer id);

	public abstract void create(Person model);

	public abstract void update(Person model);

	public abstract void delete(Person model);

	public abstract void flush();

}
