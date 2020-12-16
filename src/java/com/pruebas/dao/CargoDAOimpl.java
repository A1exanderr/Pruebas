package com.pruebas.dao;

import com.pruebas.modelo.Cargo;
import com.pruebas.utiles.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CargoDAOimpl extends ConexionBD implements CargoDAO 
{

    @Override
    public void insert(Cargo cargo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Cargo cargo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id_cargo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cargo getById(int id_cargo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cargo> getAll() throws Exception {
        List<Cargo> lista = null;
        try{
            this.conectar();
            String sql="select * from cargo";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            lista = new ArrayList<Cargo>();
            while(rs.next())
            {
                Cargo car = new Cargo();
                car.setId_cargo(rs.getInt("id_cargo"));
                car.setCargo(rs.getString("cargo"));
                
                lista.add(car);
            }
            rs.close();
            ps.close();
        }
        catch(Exception e)
        {
            throw e;
        }
        finally{
            this.desconectar();
        }
        return lista;
    }
    
}
