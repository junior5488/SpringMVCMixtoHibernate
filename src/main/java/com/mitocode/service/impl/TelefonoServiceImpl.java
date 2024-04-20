package com.mitocode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.dao.ITelefonoDAO;
import com.mitocode.model.Telefono;
import com.mitocode.service.ITelefonoService;

@Service
public class TelefonoServiceImpl implements ITelefonoService{

	@Autowired
	private ITelefonoDAO dao;
	
	@Override
	public void registrar(Telefono tlf) throws Exception {
		dao.registrar(tlf);
	}

	@Override
	public void modificar(Telefono tlf) throws Exception {
		dao.modificar(tlf);
	}

	@Override
	public void eliminar(Telefono tlf) throws Exception {
		dao.eliminar(tlf);
	}

	@Override
	public List<Telefono> listarTodos() throws Exception {
		return dao.listarTodos();
	}

	@Override
	public Telefono listarPorId(int id) throws Exception {
		return dao.listarPorId(id);
	}

}
