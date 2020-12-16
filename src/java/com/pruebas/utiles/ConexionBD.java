package com.pruebas.utiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD 
{
    static String driver = "com.mysql.jdbc.Driver";
    static String url="jdbc:mysql://localhost:3306/bd_prueba";
    static String usuario="root";
    static String pasword="root";
    
    protected Connection conn = null;

    public ConexionBD() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usuario, pasword);
            if (conn != null) {
                System.out.println("Conexion exitosa " + conn);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error en driver " + e.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error de SQL: " + ex.getMessage());
        }
    }

    public Connection conectar() {
        return conn;
    }

    public void desconectar() {
        System.out.println("Cerando la BD.. " + conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Error de SQL: " + ex.getMessage());
        }
    }
}