package com.pruebas.dao;

import com.pruebas.modelo.Usuario;
import com.pruebas.utiles.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOimpl extends ConexionBD implements UsuarioDAO {

    @Override
    public void insert(Usuario usuario) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Usuario usuario) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario getByid(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> getAll() throws Exception {
        List<Usuario> lista = null;
        try {
            this.conectar();
            String sql = "SELECT * FROM usuario JOIN cargo ON usuario.id_cargo=cargo.id_cargo;";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            lista = new ArrayList<Usuario>();
            while (rs.next()) {
                Usuario usa = new Usuario();
                usa.setId_usuario(rs.getInt("id_usuario"));
                usa.setNombre(rs.getString("nombre"));
                usa.setApellidos(rs.getString("apellidos"));
                usa.setCi(rs.getInt("ci"));
                usa.setUsuario(rs.getString("usuario"));
                usa.setPassword(rs.getString("password"));
                usa.setId_cargo(rs.getInt("id_cargo"));
                usa.setCargo(rs.getString("cargo"));

                lista.add(usa);
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
