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

import com.planning.planning.entity.AgendaEntity;

import com.planning.planning.service.AgendaService;

@RestController
public class AgendaController {
	
	@Autowired AgendaService agendaServ;
	
	@GetMapping("/agendas")
	public List<AgendaEntity> allAgendas(){
		return (List<AgendaEntity>) agendaServ.getAllAgendas();
	}
	
	@GetMapping("/agenda/{id}")
	public Optional<AgendaEntity> agendaById(@PathVariable("id")long idAgenda){
		return agendaServ.getAgendaById(idAgenda);
	}
	
	@PostMapping("/agenda/create")
	public AgendaEntity agendaCreate(@RequestBody AgendaEntity agenda){
		return agendaServ.createAgenda(agenda);
	}
	
	@PutMapping("/agenda/update/{id}")
	public AgendaEntity agendaUpdate(@RequestBody AgendaEntity agenda,@PathVariable("id") long idAgenda){
		return agendaServ.updateAgenda(agenda, idAgenda);
	}
	
	@DeleteMapping("/agenda/delete/{id}") 
	public void agendaDelete(@PathVariable("id") long idAgenda) {
		agendaServ.deleteAgenda(idAgenda);
	}
	
}
