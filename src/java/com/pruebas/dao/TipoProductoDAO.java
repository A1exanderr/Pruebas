package com.pruebas.dao;

import com.pruebas.modelo.Tipo_Producto;
import java.util.List;

public interface TipoProductoDAO 
{
    public void insert(Tipo_Producto cargo) throws Exception;
    public void update(Tipo_Producto tipo_producto) throws Exception;
    public void delete(int id_tipo_producto) throws Exception;
    public Tipo_Producto getById(int id_tipo_producto) throws Exception;
    public List<Tipo_Producto> getAll() throws Exception;
}
