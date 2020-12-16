package com.pruebas.controlador;

import com.pruebas.dao.UsuarioDAO;
import com.pruebas.dao.UsuarioDAOimpl;
import com.pruebas.modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ControllerUsuario", urlPatterns = {"/ControllerUsuario"})
public class ControllerUsuario extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            UsuarioDAO dao = new UsuarioDAOimpl();
            String action =(request.getParameter("action") != null) ? request.getParameter("action") : "view";
            Usuario usa = new Usuario();
            int id;
            switch(action)
            {
                case "add":
                    request.setAttribute("usuari", usa);
                    request.getRequestDispatcher("formularioUsa.jsp").forward(request, response);
                    break;
                case "view":
                    List<Usuario> lista = dao.getAll();
                    request.setAttribute("usuario", lista);///usuario= es una variable que se va a enviar al otro lado del jsp
                    request.getRequestDispatcher("admuser.jsp").forward(request, response);//Seabrira un archivo jsp
                    break;
                default:
                    
                    break;
                    
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error: 1"+ex.getMessage());
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

}
