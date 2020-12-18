package com.pruebas.dao;

import com.pruebas.modelo.Expirado;
import com.pruebas.utiles.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ExpiradoDAOimpl extends ConexionBD implements ExpiradoDAO {

    @Override
    public void insert(Expirado expirado) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Expirado expirado) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id_exp) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expirado getById(int id_exp) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Expirado> getAll() throws Exception {
        List<Expirado> lista = null;
        try {
            this.conectar();
            String sql="select * from expirados";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            lista = new ArrayList<Expirado>();
            while(rs.next())
            {
                Expirado exp = new Expirado();
                exp.setId_exp(rs.getInt("id_exp"));
                exp.setNombreproducto(rs.getString("nombreproducto"));
                exp.setPrecio_prod(rs.getDouble("precio_prod"));
                exp.setCantidad_prod(rs.getInt("cantidad_prod"));
                exp.setFecha_expiracion(rs.getString("fecha_expiracion"));
                
                lista.add(exp);
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
