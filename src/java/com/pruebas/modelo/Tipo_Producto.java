package com.pruebas.modelo;
public class Tipo_Producto 
{
    private int id_tipo_producto;
    private String descripcion;

    public int getId_tipo_producto() {
        return id_tipo_producto;
    }

    public void setId_tipo_producto(int id_tipo_producto) {
        this.id_tipo_producto = id_tipo_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Tipo_Producto{" + "id_tipo_producto=" + id_tipo_producto + ", descripcion=" + descripcion + '}';
    }
    
    
    
}
