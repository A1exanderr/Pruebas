package com.pruebas.dao;

import com.pruebas.modelo.Ventas;
import com.pruebas.utiles.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VentasDAOimpl extends ConexionBD implements VentasDAO {

    @Override
    public void insert(Ventas ventas) throws Exception {
        try {
            this.conectar();
            String sql = "INSERT INTO ventas(codigo_prod,nombre_generico,marca,peso,tipo,cantidad,precio,vendido)VALUE(?,?,?,?,?,?,?,?);";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ///////////////////////////////////////
            ps.setString(1, ventas.getCodigo_prod());
            ps.setString(2, ventas.getNombre_generico());
            ps.setString(3, ventas.getMarca());
            ps.setString(4, ventas.getPeso());
            ps.setString(5, ventas.getTipo());
            ps.setInt(6, ventas.getCantidad());
            ps.setDouble(7, ventas.getPrecio());
            ps.setString(8, ventas.getVendido());
            ///////////////////////////////////////
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }

    }

    @Override
    public void update(Ventas ventas) throws Exception {
        try {
            this.conectar();

            String sql = "UPDATE ventas SET codigo_prod = ?,nombre_generico = ?,marca = ?,peso = ?,tipo = ?,cantidad = ?,precio = ?,vendido = ? WHERE id_venta = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            /////////////////////////////////////////////
            ps.setString(1, ventas.getCodigo_prod());
            ps.setString(2, ventas.getNombre_generico());
            ps.setString(3, ventas.getMarca());
            ps.setString(4, ventas.getPeso());
            ps.setString(5, ventas.getTipo());
            ps.setInt(6, ventas.getCantidad());
            ps.setDouble(7, ventas.getPrecio());
            ps.setString(8, ventas.getVendido());
            ps.setInt(9, ventas.getId_venta());
            /////////////////////////////////////////
            ps.executeUpdate();

        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void delete(int id_venta) throws Exception {
        try {
            this.conectar();
            String sql = "DELETE FROM ventas WHERE id_venta = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id_venta);
            ps.executeUpdate();

        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }

    }

    @Override
    public Ventas getById(int id_venta) throws Exception {

        Ventas ven = new Ventas();
        try {
            this.conectar();

            String sql = "SELECT * FROM ventas WHERE id_venta = ? limit 1";

            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id_venta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                ven.setId_venta(rs.getInt("id_venta"));
                ven.setCodigo_prod(rs.getString("codigo_prod"));
                ven.setNombre_generico(rs.getString("nombre_generico"));
                ven.setMarca(rs.getString("marca"));
                ven.setPeso(rs.getString("peso"));
                ven.setTipo(rs.getString("tipo"));
                ven.setCantidad(rs.getInt("cantidad"));
                ven.setPrecio(rs.getDouble("precio"));
                ven.setVendido(rs.getString("vendido"));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return ven;
    }

    @Override
    public List<Ventas> getAll() throws Exception {
        List<Ventas> lista = null;
        try {
            this.conectar();
            String sql = "select * from ventas";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            lista = new ArrayList<Ventas>();
            while (rs.next()) {
                Ventas ven = new Ventas();
                //////////
                ven.setId_venta(rs.getInt("id_venta"));
                ven.setCodigo_prod(rs.getString("codigo_prod"));
                ven.setNombre_generico(rs.getString("nombre_generico"));
                ven.setMarca(rs.getString("marca"));
                ven.setPeso(rs.getString("peso"));
                ven.setTipo(rs.getString("tipo"));
                ven.setCantidad(rs.getInt("cantidad"));
                ven.setPrecio(rs.getDouble("precio"));
                ven.setVendido(rs.getString("vendido"));

                //////////////////////
                lista.add(ven);
            }

            rs.close();
            ps.close();

        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return lista;
    }

}
