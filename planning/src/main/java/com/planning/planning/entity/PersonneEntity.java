package com.planning.planning.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

@Entity
@Table(name="personne")
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "idpersonne")
public class PersonneEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idpersonne")
	private long idpersonne ;
	
	@Column(name="nom")
	private String nom ;
	
	public long getIdpersonne() {
		return idpersonne;
	}
	
	public void setIdpersonne(long idpersonne) {
		this.idpersonne = idpersonne;
	}

	@Column(name="prenom")
	private String prenom;

	@OneToMany(mappedBy="agenda_personne")
	private List<AgendaEntity> personne_agenda;
	
	public long getIdPersonne() {
		return idpersonne;
	}

	public void setIdPersonne(long idPersonne) {
		this.idpersonne = idPersonne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<AgendaEntity> getPersonne_agenda() {
		return personne_agenda;
	}

	public void setPersonne_agenda(List<AgendaEntity> personne_agenda) {
		this.personne_agenda = personne_agenda;
	}
	
}
