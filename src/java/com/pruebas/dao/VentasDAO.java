package com.pruebas.dao;

import com.pruebas.modelo.Ventas;
import java.util.List;

public interface VentasDAO {

    public void insert(Ventas ventas) throws Exception;

    public void update(Ventas ventas) throws Exception;

    public void delete(int id_venta) throws Exception;

    public Ventas getById(int id_venta) throws Exception;

    public List<Ventas> getAll() throws Exception;

}
