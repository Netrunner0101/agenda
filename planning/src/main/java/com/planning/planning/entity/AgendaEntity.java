package com.planning.planning.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="agenda")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "idagenda")
public class AgendaEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idagenda")
	private long idagenda ;
	
	@Column(name="date")
	@Temporal(TemporalType.DATE)
	private Date dateAgenda;
	
	@Column(name="heure")
	@Temporal(TemporalType.TIME)
	@JsonFormat(pattern="HH:mm:ss")
	private Date heureAgenda;
	
	@Column(name="action")
	private String action;
	
	@ManyToOne
	@JoinColumn(name="idpersonne")
	private PersonneEntity agenda_personne ; 
	
	public long getIdagenda() {
		return idagenda;
	}
	
	public void setIdagenda(long idagenda) {
		this.idagenda = idagenda;
	}

	public Date getDateAgenda() {
		return dateAgenda;
	}

	public void setDateAgenda(Date dateAgenda) {
		this.dateAgenda = dateAgenda;
	}

	public Date getHeureAgenda() {
		return heureAgenda;
	}

	public void setHeureAgenda(Date heureAgenda) {
		this.heureAgenda = heureAgenda;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public PersonneEntity getAgenda_personne() {
		return agenda_personne;
	}

	public void setAgenda_personne(PersonneEntity agenda_personne) {
		this.agenda_personne = agenda_personne;
	}

}
