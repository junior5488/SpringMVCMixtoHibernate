package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Telefono;

public interface ITelefonoService {
    void registrar(Telefono tlf) throws Exception;    
    void modificar(Telefono tlf) throws Exception;
    void eliminar(Telefono tlf) throws Exception;
    List<Telefono> listarTodos() throws Exception;
    Telefono listarPorId(int id) throws Exception;
}
