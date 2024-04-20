package com.mitocode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.dao.IPersonaDAO;
import com.mitocode.model.Persona;
import com.mitocode.service.IPersonaService;

@Service
public class PersonaServiceImpl implements IPersonaService{
	/*
	@Autowired
	private IPersonaDAO dao;
	*/
	
	private final IPersonaDAO dao;
	
	@Autowired
	private PersonaServiceImpl (IPersonaDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public void registrar(Persona per) throws Exception {
		dao.registrar(per);		
	}

	@Override
	public void modificar(Persona per) throws Exception {
		dao.modificar(per);
	}

	@Override
	public void eliminar(Persona per) throws Exception {
		dao.eliminar(per);		
	}

	@Override
	public List<Persona> listarTodos() throws Exception {
		return dao.listarTodos();
	}

	@Override
	public Persona listarPorId(int id) throws Exception {
		return dao.listarPorId(id);
	}

}
