package com.pruebas.controlador;

import com.pruebas.dao.CargoDAO;
import com.pruebas.dao.CargoDAOimpl;
import com.pruebas.modelo.Cargo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ControllerCargo", urlPatterns = {"/ControllerCargo"})
public class ControllerCargo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            CargoDAO dao = new CargoDAOimpl();
            String action =(request.getParameter("action") != null) ? request.getParameter("action") : "view";
            Cargo car = new Cargo();
            int id;
            switch(action)
            {
                case "add":
                    request.setAttribute("usuari", car);
                    request.getRequestDispatcher("formularioUsa.jsp").forward(request, response);
                    break;
                case "view":
                    List<Cargo> lista = dao.getAll();
                    request.setAttribute("carg", lista);///usuario= es una variable que se va a enviar al otro lado del jsp
                    request.getRequestDispatcher("admcargo.jsp").forward(request, response);//Seabrira un archivo jsp
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
