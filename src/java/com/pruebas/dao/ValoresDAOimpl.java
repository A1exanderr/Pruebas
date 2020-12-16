package com.pruebas.dao;

import com.pruebas.modelo.Valores;
import com.pruebas.utiles.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ValoresDAOimpl extends ConexionBD implements ValoresDAO {

    @Override
    public void insert(Valores valores) throws Exception {
        try {
            this.conectar();
            String sql = "INSERT INTO valores (id_prod,cantidad,expiracion,fabricado,comprado) VALUES (?,?,?,?,?)";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ///////////////
            ps.setInt(1, valores.getId_prod());
            ps.setInt(2, valores.getCantidad());
            ps.setString(3, valores.getExpiracion());
            ps.setString(4, valores.getFabricado());
            ps.setString(5, valores.getComprado());
            ///////////////
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void update(Valores valores) throws Exception {
        try {
            this.conectar();
            String sql = "UPDATE valores SET id_prod = ?,cantidad = ?,expiracion = ?,fabricado = ?,comprado = ? WHERE id_valor = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            /////////////////////////////////
            ps.setInt(1, valores.getId_prod());
            ps.setInt(2, valores.getCantidad());
            ps.setString(3, valores.getExpiracion());
            ps.setString(4, valores.getFabricado());
            ps.setString(5, valores.getComprado());
            ps.setInt(6, valores.getId_valor());
            ////////////////////////////////////
            ps.executeUpdate();

        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void delete(int id_volor) throws Exception {
        try {
            this.conectar();
            String sql = "DELETE FROM valores WHERE id_valor = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id_volor);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public Valores getById(int id_valor) throws Exception {
        Valores val = new Valores();
        try {
            this.conectar();
            String sql = "SELECT * FROM valores WHERE id_valor = ? limit 1";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id_valor);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                val.setId_valor(rs.getInt("id_valor"));
                val.setId_prod(rs.getInt("id_prod"));
                val.setCantidad(rs.getInt("cantidad"));
                val.setExpiracion(rs.getString("expiracion"));
                val.setFabricado(rs.getString("fabricado"));
                val.setComprado(rs.getString("comprado"));
            }

        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return val;
    }

    @Override
    public List<Valores> getAll() throws Exception {

        List<Valores> lista = null;
        try {
            this.conectar();
            String sql = "SELECT valores.id_valor, valores.id_prod, producto.codigo_prod,producto.nombre_prod,tipo_producto.descripcion,valores.fabricado,valores.comprado,producto.precio_prod,valores.cantidad,valores.expiracion  FROM valores JOIN producto ON valores.id_prod=producto.id_prod JOIN tipo_producto ON producto.id_typo_pro=tipo_producto.id_typo_pro;";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            lista = new ArrayList<Valores>();

            while (rs.next()) {
                Valores val = new Valores();
                /////////////////////////
                /*val.setId_valor(rs.getInt("id_valor"));
                val.setId_prod(rs.getInt("id_prod"));
                val.setCantidad(rs.getInt("cantidad"));
                val.setExpiracion(rs.getString("expiracion"));
                val.setFabricado(rs.getString("fabricado"));
                val.setComprado(rs.getString("comprado"));
                val.setCodigo_prod(rs.getString("precio_prod"));*/
                val.setId_valor(rs.getInt("id_valor"));
                val.setId_prod(rs.getInt("id_prod"));
                val.setCodigo_prod(rs.getString("codigo_prod"));
                val.setNombre_prod(rs.getString("nombre_prod"));
                val.setDescripcion(rs.getString("descripcion"));
                val.setFabricado(rs.getString("fabricado"));
                val.setComprado(rs.getString("comprado"));
                val.setPrecio_prod(rs.getDouble("precio_prod"));
                val.setCantidad(rs.getInt("cantidad"));
                val.setExpiracion(rs.getString("expiracion"));
                //////////////////
                lista.add(val);
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
