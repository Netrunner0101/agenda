package com.planning.planning.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.planning.planning.entity.PersonneEntity;
import com.planning.planning.service.PersonneService;

@RestController
public class PersonneController {
	
	@Autowired PersonneService personneServ;
	
	@GetMapping("/personnes")
	public List<PersonneEntity> getAllPersonnes(){
		return (List<PersonneEntity>) personneServ.getAllpersonnes();
	}
	
	@GetMapping("/personne/{id}")
	public Optional<PersonneEntity> getPersonneById(@PathVariable("id")long idPersonne){
		return  personneServ.getPersonneById(idPersonne);
	}
	
	@PostMapping("/personne/create")
	public PersonneEntity createPersonne(@RequestBody PersonneEntity personne) {
		try {
			return personneServ.postNewPersonne(personne);
		}catch(Exception e) {
			return null;
		}
	}
	
	@PutMapping("/personne/update/{id}")
	public PersonneEntity updatePersonne(@RequestBody PersonneEntity personne, @PathVariable("id") long idPersonne) {
		return personneServ.updatePersonne(personne, idPersonne);
	}
	
	@DeleteMapping("/personne/delete/{id}")
	public void deletePersonne(@PathVariable("id") long idPersonne) {
		personneServ.deletePersonne(idPersonne);
	}
	
}
