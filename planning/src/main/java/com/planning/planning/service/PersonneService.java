package com.planning.planning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planning.planning.entity.PersonneEntity;
import com.planning.planning.repository.PersonneRepository;
import java.util.List;
import java.util.Optional;

@Service
public class PersonneService {
	
	@Autowired PersonneRepository personneRepo;
	
	public List<PersonneEntity> getAllpersonnes() {
		return (List<PersonneEntity>) personneRepo.findAll();
	}
	
	public Optional<PersonneEntity> getPersonneById(long idPersonne) {
		return personneRepo.findById(idPersonne);
	}
	
	public PersonneEntity postNewPersonne(PersonneEntity personne) {
		return personneRepo.save(personne);
	}
	
	public PersonneEntity updatePersonne(PersonneEntity personne, long idPersonne ) {
		PersonneEntity updateP = personneRepo.findById(idPersonne).get();
		updateP.setNom(personne.getNom());
		updateP.setPrenom(personne.getPrenom());
		return personneRepo.save(updateP);
	}
	
	public void deletePersonne(long idPersonne) {
		personneRepo.deleteById(idPersonne); 
	}
	
}
