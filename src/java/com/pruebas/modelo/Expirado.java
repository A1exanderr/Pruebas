package com.pruebas.modelo;
public class Expirado 
{
    private int id_exp;
    private String nombreproducto;
    private double precio_prod;
    private int cantidad_prod;
    private String fecha_expiracion;

    public int getId_exp() {
        return id_exp;
    }

    public void setId_exp(int id_exp) {
        this.id_exp = id_exp;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public double getPrecio_prod() {
        return precio_prod;
    }

    public void setPrecio_prod(double precio_prod) {
        this.precio_prod = precio_prod;
    }

    public int getCantidad_prod() {
        return cantidad_prod;
    }

    public void setCantidad_prod(int cantidad_prod) {
        this.cantidad_prod = cantidad_prod;
    }

    public String getFecha_expiracion() {
        return fecha_expiracion;
    }

    public void setFecha_expiracion(String fecha_expiracion) {
        this.fecha_expiracion = fecha_expiracion;
    }

    @Override
    public String toString() {
        return "Expirado{" + "id_exp=" + id_exp + ", nombreproducto=" + nombreproducto + ", precio_prod=" + precio_prod + ", cantidad_prod=" + cantidad_prod + ", fecha_expiracion=" + fecha_expiracion + '}';
    }
    
}
