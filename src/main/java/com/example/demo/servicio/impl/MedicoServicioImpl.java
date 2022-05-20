package com.example.demo.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Medico;
import com.example.demo.repo.IGenericRepo;
import com.example.demo.repo.IMedicoRepo;
import com.example.demo.service.IMedicoServicio;
@Service
public class MedicoServicioImpl extends CRUDImpl<Medico, Integer> implements IMedicoServicio{
	
	@Autowired
	private IMedicoRepo repo;

	@Override
	protected IGenericRepo<Medico, Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}

	

}
