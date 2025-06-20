package com.main.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.main.model.Person;




@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{


}
