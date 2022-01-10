package com.planning.planning.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planning.planning.entity.AgendaEntity;
import com.planning.planning.repository.AgendaRepository;

@Service
public class AgendaService {
	
	@Autowired AgendaRepository agendaRepo;
	
	public Iterable<AgendaEntity> getAllAgendas(){
		return agendaRepo.findAll();
	}
	
	public Optional<AgendaEntity> getAgendaById(long idAgenda) {	
		return agendaRepo.findById(idAgenda);
	}
	
	public AgendaEntity createAgenda(AgendaEntity newAgenda) {
		return agendaRepo.save(newAgenda);
	}
	
	public AgendaEntity updateAgenda(AgendaEntity newAgenda, long idAgenda) {
		AgendaEntity updatedAgenda = agendaRepo.findById(idAgenda).get();
		updatedAgenda.setDateAgenda(newAgenda.getDateAgenda());
		updatedAgenda.setHeureAgenda(newAgenda.getHeureAgenda());
		return agendaRepo.save(updatedAgenda) ; 
	}
	
	public void deleteAgenda(long idAgenda) {
		agendaRepo.deleteById(idAgenda);
	}
	
}
