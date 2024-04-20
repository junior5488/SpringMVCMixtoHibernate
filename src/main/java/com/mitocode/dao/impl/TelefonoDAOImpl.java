package com.mitocode.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mitocode.dao.AbstractDAO;
import com.mitocode.dao.ITelefonoDAO;
import com.mitocode.model.Telefono;

@Repository
@Transactional
public class TelefonoDAOImpl extends AbstractDAO implements ITelefonoDAO{

	@Override
	public void registrar(Telefono tlf) throws Exception {
		persist(tlf);
	}

	@Override
	public void modificar(Telefono tlf) throws Exception {
		update(tlf);
	}

	@Override
	public void eliminar(Telefono tlf) throws Exception {
		delete(tlf);
	}

	@Override
	public List<Telefono> listarTodos() throws Exception {
		Criteria criteria = getSession().createCriteria(Telefono.class);
		return (List<Telefono>)criteria.list();
	}

	@Override
	public Telefono listarPorId(int id) throws Exception {
		List<Telefono> lista;
		String hql = "FROM telefono WHERE id = :id";
		
		Query query = getSession().createQuery(hql);
		query.setParameter("id", id);
		
		lista = query.list();
		Telefono tlf = lista !=null && !lista.isEmpty() ? lista.get(0) : new Telefono();
		
		return tlf;
	}

}
