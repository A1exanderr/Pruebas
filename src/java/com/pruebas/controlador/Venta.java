package com.pruebas.controlador;

import com.pruebas.dao.VentasDAO;
import com.pruebas.dao.VentasDAOimpl;
import com.pruebas.modelo.Ventas;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Venta", urlPatterns = {"/Venta"})
public class Venta extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            VentasDAO dao = new VentasDAOimpl();
            int id_venta;
            Ventas ven = new Ventas();
            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "view";
            switch (action) {

                case "add":
                    break;
                case "view":
                    List<Ventas> lista = dao.getAll();
                    request.setAttribute("ventas", lista);
                    request.getRequestDispatcher("venta.jsp").forward(request, response);
                    break;
                default:
                    break;
            }

        } catch (Exception ex) {
            System.out.println("Error en la pate de servlet venta get" + ex.getMessage());
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
