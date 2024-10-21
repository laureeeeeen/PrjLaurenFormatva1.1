package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Agendamento;
import com.example.demo.entities.Products;
import com.example.demo.repositories.AgendamentoRepository;
import com.example.demo.repositories.ProductRepository;

@Service
public class AgendamentoService {

	@Autowired
	private final AgendamentoRepository agendamentorepository;
	
	@Autowired
	public AgendamentoService(AgendamentoRepository agendamentorepository) {
		this.agendamentorepository = agendamentorepository;
	}
	
	//salvar agendamento de servicos
	public Agendamento saveAgendamento(Agendamento agendamento) {
		return agendamentorepository.save(agendamento);
	}
	
	public Agendamento getAgendamentoById(Long id) {
		return agendamentorepository.findById(id).orElse(null);
	}
	
	public List<Agendamento> getAllAgendamento() {
		return agendamentorepository.findAll();
	}
	
	public void deleteAgendamento(Long id) {
		agendamentorepository.deleteById(id);
	}
	
}
