/**
 *
 * @author Ekkachai.K
 * @date Jul 21, 2015
 */
package com.grandek.mydb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.grandek.mydb.dao.PersonDAO;
import com.grandek.mydb.model.Person;
import com.grandek.mydb.service.PersonService;
@Transactional
@Service("personService")
public class PersonServiceImpl implements PersonService {

	@Autowired private PersonDAO personDao;
	@Override
	public List<Person> findAll() throws DataAccessException {
		return personDao.findAll();
	}

	@Override
	public Person find(Integer id) {
		return personDao.find(id);
	}

	@Override
	public void create(Person model) {
		personDao.create(model);
	}

	@Override
	public void update(Person model) {
		personDao.update(model);
	}

	@Override
	public void delete(Person model) {
		personDao.delete(model);
	}

	@Override
	public void flush() {
		personDao.flush();
	}

}
