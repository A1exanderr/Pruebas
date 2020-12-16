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

@WebServlet(name = "ControllerValores", urlPatterns = {"/ControllerValores"})
public class ControllerValores extends HttpServlet {

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
                case "edit":
                    id_valor = Integer.parseInt(request.getParameter("id_valor"));
                    pro = dao.getById(id_valor);
                    System.out.println(pro);
                    request.setAttribute("valores", pro);
                    request.getRequestDispatcher("formulariovalores.jsp").forward(request, response);
                    break;
                case "delete":
                    id_valor = Integer.parseInt(request.getParameter("id_valor"));
                    dao.delete(id_valor);
                    response.sendRedirect(request.getContextPath() + "/ControllerValores");
                    break;
                case "view":
                    List<Valores> lista = dao.getAll();
                    request.setAttribute("valores", lista);
                    request.getRequestDispatcher("admvalores.jsp").forward(request, response);
                    break;
                default:
                    break;
            }

        } catch (Exception ex) {
            System.out.println("Error en la pate de servlet Valores" + ex.getMessage());
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id_valor = Integer.parseInt(request.getParameter("id_valor"));
        int id_prod = Integer.parseInt(request.getParameter("id_prod"));
        int cantidad = Integer.parseInt(request.getParameter("cantidad"));
        String expiracion = request.getParameter("expiracion");
        String fabricado = request.getParameter("fabricado");
        String comprado = request.getParameter("comprado");

        Valores val = new Valores();
        
        val.setId_valor(id_valor);
        val.setId_prod(id_prod);
        val.setCantidad(cantidad);
        val.setExpiracion(expiracion);
        val.setFabricado(fabricado);
        val.setComprado(comprado);
        
        if (id_valor == 0) {
            try {
                ValoresDAO dao = new ValoresDAOimpl();
                dao.insert(val);
                response.sendRedirect(request.getContextPath() + "/ControllerValores");
            } catch (Exception ex) {
                System.out.println("Error en serplet de valores" + ex.getMessage());
            }

        } else {
            try {
                ValoresDAO dao = new ValoresDAOimpl();
                dao.update(val);
                response.sendRedirect(request.getContextPath() + "/ControllerValores");

            } catch (Exception ex) {
                System.out.println("Error en el servlt de valores" + ex.getMessage());
            }
        }
    }

}
