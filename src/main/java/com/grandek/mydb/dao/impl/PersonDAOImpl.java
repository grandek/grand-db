/**
 *
 * @author Ekkachai.K
 * @date Jul 20, 2015
 */
package com.grandek.mydb.dao.impl;

import org.springframework.stereotype.Repository;

import com.grandek.mydb.dao.PersonDAO;
import com.grandek.mydb.model.Person;
@Repository("personDao")
public class PersonDAOImpl extends GenericDAOImpl<Person, Integer> implements PersonDAO {

	public PersonDAOImpl() {
		super(Person.class);
	}

}
