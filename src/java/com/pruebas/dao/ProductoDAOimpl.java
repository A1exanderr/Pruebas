package com.pruebas.dao;

import com.pruebas.modelo.Producto;
import com.pruebas.utiles.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAOimpl extends ConexionBD implements ProductoDAO {

    @Override
    public void insert(Producto producto) throws Exception {
        try {
            this.conectar();
            String sql = "insert into producto (nombre_prod,precio_prod,codigo_prod,marca_prod,peso_prod,id_typo_pro)values(?,?,?,?,?,?)";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, producto.getNombre_prod());
            ps.setDouble(2, producto.getPrecio_prod());
            ps.setString(3, producto.getCodigo_prod());
            ps.setString(4, producto.getMarca_prod());
            ps.setString(5, producto.getPeso_prod());
            ps.setInt(6, producto.getId_typo_pro());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void update(Producto producto) throws Exception {
        try {
            this.conectar();
            
            String sql = "UPDATE producto SET nombre_prod = ?,precio_prod = ?,codigo_prod = ?,marca_prod = ?,peso_prod = ?,id_typo_pro = ? WHERE id_prod = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, producto.getNombre_prod());
            ps.setDouble(2, producto.getPrecio_prod());
            ps.setString(3, producto.getCodigo_prod());
            ps.setString(4, producto.getMarca_prod());
            ps.setString(5, producto.getPeso_prod());
            ps.setInt(6, producto.getId_typo_pro());
            ps.setInt(7, producto.getId_prod());
            System.out.println("LALALA ALEX");
            ps.executeUpdate();

        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void delete(int id_prod) throws Exception {
        try {
            this.conectar();
            String sql = "DELETE FROM producto WHERE id_prod = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id_prod);
            ps.executeUpdate();

        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public Producto getById(int id_prod) throws Exception {

        Producto pro = new Producto();
        try {
            this.conectar();

            String sql = "SELECT * FROM producto WHERE id_prod = ? limit 1";

            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id_prod);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pro.setId_prod(rs.getInt("id_prod"));
                pro.setNombre_prod(rs.getString("nombre_prod"));
                pro.setPrecio_prod(rs.getDouble("precio_prod"));
                pro.setCodigo_prod(rs.getString("codigo_prod"));
                pro.setMarca_prod(rs.getString("marca_prod"));
                pro.setPeso_prod(rs.getString("peso_prod"));
                pro.setId_typo_pro(rs.getInt("id_typo_pro"));
                
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return pro;
    }

    @Override
    public List<Producto> getAll() throws Exception {
        List<Producto> lista = null;
        try {
            this.conectar();
            String sql = "SELECT * FROM producto JOIN tipo_producto ON producto.id_typo_pro=tipo_producto.id_typo_pro";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            lista = new ArrayList<Producto>();
            while (rs.next()) {
                Producto pro = new Producto();
                pro.setId_prod(rs.getInt("id_prod"));
                pro.setNombre_prod(rs.getString("nombre_prod"));
                pro.setPrecio_prod(rs.getDouble("precio_prod"));
                pro.setCodigo_prod(rs.getString("codigo_prod"));
                pro.setMarca_prod(rs.getString("marca_prod"));
                pro.setPeso_prod(rs.getString("peso_prod"));
                pro.setId_typo_pro(rs.getInt("id_typo_pro"));
                pro.setDescripcion(rs.getString("descripcion"));
                lista.add(pro);
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
