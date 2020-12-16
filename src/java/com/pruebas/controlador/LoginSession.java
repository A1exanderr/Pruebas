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
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginSession", urlPatterns = {"/LoginSession"})
public class LoginSession extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession ses = request.getSession();
        String login = (String) ses.getAttribute("login");
        if (login.equals("OK")) {
            ses.invalidate();
            response.sendRedirect("index.jsp");
        } else {
            response.sendRedirect("login.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession ses = request.getSession();
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        //--------------------------
        UsuarioDAO dao = new UsuarioDAOimpl();
        Usuario usa = new Usuario();
        try {
            List<Usuario> lista = dao.getAll();
            //System.out.println(lista);
            int i = 0;
            if (lista.size() > 0) {
                while (i < lista.size()) {
                    if ((lista.get(i).getUsuario().equals(usuario)) && (lista.get(i).getPassword().equals(password))) {
                        //System.out.println("ENCONTRADO LO QUE BUSCAMOS");
                        ses.setAttribute("login", "OK");
                        ses.setAttribute("usuario", usuario);
                        //DESEAMOS INGRESAR AL PANEL
                        response.sendRedirect("panel.jsp");
                    } else {
                        i++;
                       // System.out.println("----" + i);
                    }
                }
            }
            ses.setAttribute("error", "Usuarion sin autorizacion");
            response.sendRedirect("login.jsp");
        } catch (Exception e) {
            System.out.println("Error: 1 login" + e.getMessage());
        }
        /*System.out.println("IMPRIMIR " + usa.getUsuario());
        //------------------------
        if ((usuario.equals("admin")) && (password.equals("1234"))) {
            ses.setAttribute("login", "OK");
            ses.setAttribute("usuario", usuario);
            //DESEAMOS INGRESAR AL PANEL
            response.sendRedirect("panel.jsp");
        } else {
            ses.setAttribute("error", "Usuarion sin autorizacion");
            response.sendRedirect("login.jsp");
        }
         */
    }

}
