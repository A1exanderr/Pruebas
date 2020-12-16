package com.pruebas.modelo;
public class Valores extends Producto
{
    private int id_valor;
    private int id_prod;
    private int cantidad;
    private String expiracion;
    private String fabricado;
    private String comprado;

    public int getId_valor() {
        return id_valor;
    }

    public void setId_valor(int id_valor) {
        this.id_valor = id_valor;
    }

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getExpiracion() {
        return expiracion;
    }

    public void setExpiracion(String expiracion) {
        this.expiracion = expiracion;
    }

    public String getFabricado() {
        return fabricado;
    }

    public void setFabricado(String fabricado) {
        this.fabricado = fabricado;
    }

    public String getComprado() {
        return comprado;
    }

    public void setComprado(String comprado) {
        this.comprado = comprado;
    }

    @Override
    public String toString() {
        return "Valores{" + "id_valor=" + id_valor + ", id_prod=" + id_prod + ", cantidad=" + cantidad + ", expiracion=" + expiracion + ", fabricado=" + fabricado + ", comprado=" + comprado + '}';
    }
    
    
}
