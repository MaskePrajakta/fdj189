package com.main.serviceimpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Person;
import com.main.repo.PersonRepository;
import com.main.serviceinter.PersonServiceInter;



@Service
public class PersonServiceImpl implements PersonServiceInter {

	@Autowired
	PersonRepository prs;

	@Override
	public Person savePerson(Person p) {
		return prs.save(p);
		
	}

	@Override
	public Person getPerson(int pId) {
		return prs.findById(pId).get();
	}

	@Override
	public void deletePerson(int pId) {
		prs.deleteById(pId);
		
	}

	

	
	
	


	
}
