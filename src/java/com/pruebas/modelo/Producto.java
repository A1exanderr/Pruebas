package com.pruebas.modelo;
public class Producto extends Tipo_Producto
{
    private int id_prod; 
    private String nombre_prod;
    private double precio_prod;
    private String codigo_prod;
    private String marca_prod;
    private String peso_prod;
    private int id_typo_pro;

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    public String getNombre_prod() {
        return nombre_prod;
    }

    public void setNombre_prod(String nombre_prod) {
        this.nombre_prod = nombre_prod;
    }

    public double getPrecio_prod() {
        return precio_prod;
    }

    public void setPrecio_prod(double precio_prod) {
        this.precio_prod = precio_prod;
    }

    public String getCodigo_prod() {
        return codigo_prod;
    }

    public void setCodigo_prod(String codigo_prod) {
        this.codigo_prod = codigo_prod;
    }

    public String getMarca_prod() {
        return marca_prod;
    }

    public void setMarca_prod(String marca_prod) {
        this.marca_prod = marca_prod;
    }

    public String getPeso_prod() {
        return peso_prod;
    }

    public void setPeso_prod(String peso_prod) {
        this.peso_prod = peso_prod;
    }

    public int getId_typo_pro() {
        return id_typo_pro;
    }

    public void setId_typo_pro(int id_typo_pro) {
        this.id_typo_pro = id_typo_pro;
    }

    @Override
    public String toString() {
        return "Producto{" + "id_prod=" + id_prod + ", nombre_prod=" + nombre_prod + ", precio_prod=" + precio_prod + ", codigo_prod=" + codigo_prod + ", marca_prod=" + marca_prod + ", peso_prod=" + peso_prod + ", id_typo_pro=" + id_typo_pro + '}';
    }
    
    
}
