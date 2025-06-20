package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Person;
import com.main.serviceinter.PersonServiceInter;



@RestController
public class PersonController {

	@Autowired
	PersonServiceInter psi;
	
	@PostMapping("/person")
	public Person savePersonData(@RequestBody Person p)
	{
		return psi.savePerson(p);
		
		 
		
	}
	
	@GetMapping("/person/{pId}")
	public Person getPersonData(@PathVariable int pId)
	{
		
		System.out.println(pId);
		return psi.getPerson(pId);
	}
	
	@DeleteMapping("/person/{pId}")
	public void deletePersonData(@PathVariable int pId)
	{
		psi.deletePerson(pId);
	}
	
	@PutMapping("/person/{pId}")
	public Person editPersonData(@PathVariable int pId,@RequestBody Person p)
	{
		if(pId==p.getpId())
		{
			psi.getPerson(pId);
		}
		return psi.savePerson(p);
		
	}
	
}
