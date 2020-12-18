package com.pruebas.dao;

import com.pruebas.modelo.Expirado;
import java.util.List;

public interface ExpiradoDAO 
{
    public void insert(Expirado expirado) throws Exception;
    public void update(Expirado expirado) throws Exception;
    public void delete(int id_exp) throws Exception;
    public Expirado getById(int id_exp) throws Exception;
    public List<Expirado> getAll() throws Exception;
    
}
