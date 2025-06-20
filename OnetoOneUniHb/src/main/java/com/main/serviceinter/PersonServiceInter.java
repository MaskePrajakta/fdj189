package com.main.serviceinter;

import com.main.model.Person;

public interface PersonServiceInter {

	Person savePerson(Person p);

	Person getPerson(int pId);

	void deletePerson(int pId);

	

}
