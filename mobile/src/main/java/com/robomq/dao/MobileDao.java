package com.robomq.dao;

import java.util.List;

import com.robomq.pojo.Mobile;;

public interface MobileDao {

	Mobile getPersonById(int id);

	List<Mobile> getAllPersons();

	boolean deletePerson(Mobile person);

	boolean updatePerson(Mobile person);

	boolean createPerson(Mobile person);

}
