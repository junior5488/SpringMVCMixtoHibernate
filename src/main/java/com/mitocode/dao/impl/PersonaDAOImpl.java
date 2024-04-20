package com.mitocode.dao.impl;

import java.util.ArrayList;
import java.util.List;

//import org.hibernate.Criteria;
import org.hibernate.Query; //getSession es el sessionFactory de Hibernate
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mitocode.dao.AbstractDAO;
import com.mitocode.dao.IPersonaDAO;
import com.mitocode.model.Persona;

@Repository
@Transactional
public class PersonaDAOImpl extends AbstractDAO implements IPersonaDAO{

	@Override
	public void registrar(Persona per) throws Exception {
		persist(per);		 
	}

	@Override
	public void modificar(Persona per) throws Exception {
		update(per);
		
	}

	@Override
	public void eliminar(Persona per) throws Exception {
		delete(per);
		
	}

	@Override
	public List<Persona> listarTodos() throws Exception {
		//Critera
//		Criteria criteria = getSession().createCriteria(Persona.class);		
//		return (List<Persona>)criteria.list(); //Casting : convertir una variable de un tipo a otro tipo
		
		//HQL
		List<Persona> lista;
		String hql = "FROM Persona"; //se puede usar Select si voy a mostrar algunos campos
		Query query = getSession().createQuery(hql);
		
		lista = query.list();
		
		return lista != null && !lista.isEmpty() ? lista : new ArrayList<Persona>();
	}

	@Override
	public Persona listarPorId(int id) throws Exception {
		//HQL - Hibernate Query Language
		List<Persona> lista;
		String hql = "FROM Persona Where id = :id";
		
		Query query = getSession().createQuery(hql);
		query.setParameter("id", id);
		
		lista = query.list();
	
		Persona per = lista != null && !lista.isEmpty() ? lista.get(0) : new Persona();				
		return per;
	}

}