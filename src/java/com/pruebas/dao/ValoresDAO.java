package com.pruebas.dao;

import com.pruebas.modelo.Valores;
import java.util.List;

public interface ValoresDAO {

    public void insert(Valores valores) throws Exception;

    public void update(Valores valores) throws Exception;

    public void delete(int id_volor) throws Exception;

    public Valores getById(int id_valor) throws Exception;

    public List<Valores> getAll() throws Exception;

}
