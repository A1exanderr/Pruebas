package com.pruebas.controlador;

import com.pruebas.dao.ValoresDAO;
import com.pruebas.dao.ValoresDAOimpl;
import com.pruebas.modelo.Valores;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PerfildeProductos", urlPatterns = {"/PerfildeProductos"})
public class PerfildeProductos extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            ValoresDAO dao = new ValoresDAOimpl();
            int id_valor;
            Valores pro = new Valores();
            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "view";
            switch (action) {

                case "add":
                    request.setAttribute("valores", pro);
                    request.getRequestDispatcher("formulariovalores.jsp").forward(request, response);
                    break;
                case "delete":
                    id_valor = Integer.parseInt(request.getParameter("id_valor"));
                    dao.delete(id_valor);
                    response.sendRedirect(request.getContextPath() + "/PerfildeProductos");
                    break;
                case "view":
                    List<Valores> lista = dao.getAll();
                    request.setAttribute("valores", lista);
                    request.getRequestDispatcher("PerfilProducto.jsp").forward(request, response);
                    break;
                default:
                    break;
            }

        } catch (Exception ex) {
            System.out.println("Error en la pate de servlet Valores" + ex.getMessage());
        }

    }

}
