package com.pruebas.modelo;
public class Ventas {
    
    private int id_venta;
    private String codigo_prod;
    private String nombre_generico;
    private String marca;
    private String peso;
    private String tipo;
    private int cantidad;
    private double precio;
    private String vendido;

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getCodigo_prod() {
        return codigo_prod;
    }

    public void setCodigo_prod(String codigo_prod) {
        this.codigo_prod = codigo_prod;
    }

    public String getNombre_generico() {
        return nombre_generico;
    }

    public void setNombre_generico(String nombre_generico) {
        this.nombre_generico = nombre_generico;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getVendido() {
        return vendido;
    }

    public void setVendido(String vendido) {
        this.vendido = vendido;
    }

    @Override
    public String toString() {
        return "Ventas{" + "id_venta=" + id_venta + ", codigo_prod=" + codigo_prod + ", nombre_generico=" + nombre_generico + ", marca=" + marca + ", peso=" + peso + ", tipo=" + tipo + ", cantidad=" + cantidad + ", precio=" + precio + ", vendido=" + vendido + '}';
    }
    
    
}
