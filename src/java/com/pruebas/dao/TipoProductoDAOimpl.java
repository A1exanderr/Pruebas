package com.pruebas.dao;

import com.pruebas.modelo.Tipo_Producto;
import com.pruebas.utiles.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TipoProductoDAOimpl extends ConexionBD implements TipoProductoDAO {

    @Override
    public void insert(Tipo_Producto cargo) throws Exception {
        try{
            this.conectar();
            String sql="insert into tipo_producto (descripcion) values (?)";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, cargo.getDescripcion());
            ps.executeUpdate();
        }
        catch(Exception e)
        {
            throw e;
        }
        finally{
            this.desconectar();
        }
    }

    @Override
    public void update(Tipo_Producto tipo_producto) throws Exception {
        try{
            this.conectar();
            String sql = "UPDATE tipo_producto SET descripcion= ? WHERE id_typo_pro = ? ";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, tipo_producto.getDescripcion());
            ps.setInt(2, tipo_producto.getId_tipo_producto());
            ps.executeUpdate();
                        
        }catch(Exception e){
            throw e;
        }finally{
            this.desconectar();
        }
    }

    @Override
    public void delete(int id_tipo_producto) throws Exception {
        try{
            this.conectar();
            String sql="DELETE FROM tipo_producto WHERE id_typo_pro = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id_tipo_producto);
            ps.executeUpdate();
        }
        catch(Exception e){
            throw e;
        }
        finally{
            this.desconectar();
        }
    }

    @Override
    public Tipo_Producto getById(int id_tipo_producto) throws Exception {
       Tipo_Producto tipo = new Tipo_Producto();
       try{
           this.conectar();
           String sql = "SELECT * FROM tipo_producto WHERE id_typo_pro = ? limit 1";
           PreparedStatement ps = this.conn.prepareStatement(sql);
           ps.setInt(1, id_tipo_producto);
           ResultSet rs = ps.executeQuery();
           if(rs.next())
           {
               tipo.setId_tipo_producto(rs.getInt("id_typo_pro"));
               tipo.setDescripcion(rs.getString("descripcion"));
           }
           
       }catch(Exception e)
       {
           throw e;
       }finally{
           this.desconectar();
       }
       return tipo;
    }

    @Override
    public List<Tipo_Producto> getAll() throws Exception {
        List<Tipo_Producto> lista = null;
        try {
            this.conectar();
            String sql = "SELECT * FROM tipo_producto";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            lista = new ArrayList<Tipo_Producto>();

            while (rs.next()) {
                Tipo_Producto tip = new Tipo_Producto();
                tip.setId_tipo_producto(rs.getInt("id_typo_pro"));
                tip.setDescripcion(rs.getString("descripcion"));
                lista.add(tip);
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
