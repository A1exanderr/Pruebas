package com.pruebas.dao;

import com.pruebas.modelo.Cargo;
import java.util.List;

public interface CargoDAO 
{
    public void insert(Cargo cargo) throws Exception;
    public void update(Cargo cargo) throws Exception;
    public void delete(int id_cargo) throws Exception;
    public Cargo getById(int id_cargo) throws Exception;
    public List<Cargo> getAll() throws Exception;
    
}
