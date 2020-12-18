package com.pruebas.controlador;

import com.pruebas.dao.ExpiradoDAO;
import com.pruebas.dao.ExpiradoDAOimpl;
import com.pruebas.modelo.Expirado;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ControllerExpirado", urlPatterns = {"/ControllerExpirado"})
public class ControllerExpirado extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            ExpiradoDAO dao = new ExpiradoDAOimpl();
            int id_exp;
            Expirado exp = new Expirado();
            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "view";
            switch (action) {

                case "add":
                    request.setAttribute("expirado", exp);
                    request.getRequestDispatcher("formularioexpirados.jsp").forward(request, response);
                    break;
                case "edit":
                    id_exp = Integer.parseInt(request.getParameter("id_exp"));
                    exp = dao.getById(id_exp);
                    System.out.println(exp);
                    request.setAttribute("expirado", exp);
                    request.getRequestDispatcher("formularioexpirados.jsp").forward(request, response);
                    break;
                case "delete":
                    id_exp = Integer.parseInt(request.getParameter("id_exp"));
                    dao.delete(id_exp);
                    response.sendRedirect(request.getContextPath() + "/ControllerExpirado");
                    break;
                case "view":
                    List<Expirado> lista = dao.getAll();
                    request.setAttribute("expirado", lista);
                    request.getRequestDispatcher("admexpirados.jsp").forward(request, response);
                    break;
                default:
                    break;
            }

        } catch (Exception ex) {
            System.out.println("Error en la pate de servlet Producto Alex" + ex.getMessage());
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id_prod = Integer.parseInt(request.getParameter("id_prod"));
        String nombre_prod = request.getParameter("nombre_prod");
        double precio_prod = Double.parseDouble(request.getParameter("precio_prod"));
        String codigo_prod = request.getParameter("codigo_prod");
        String marca_prod = request.getParameter("marca_prod");
        String peso_prod = request.getParameter("peso_prod");
        int id_type_pro = Integer.parseInt(request.getParameter("tipo_prod"));

        Expirado pro = new Expirado();

        /*pro.setId_prod(id_prod);
        pro.setNombre_prod(nombre_prod);
        pro.setPrecio_prod(precio_prod);
        pro.setCodigo_prod(codigo_prod);
        pro.setMarca_prod(marca_prod);
        pro.setPeso_prod(peso_prod);
        pro.setId_typo_pro(id_type_pro);*/

        if (id_prod == 0) {
            try {
                ExpiradoDAO dao = new ExpiradoDAOimpl();
                dao.insert(pro);
                response.sendRedirect(request.getContextPath() + "/ControllerProducto");
            } catch (Exception ex) {
                System.out.println("Error en serplet de producto" + ex.getMessage());
            }

        } else {
            try {
                ExpiradoDAO dao = new ExpiradoDAOimpl();
                dao.update(pro);
                response.sendRedirect(request.getContextPath() + "/ControllerProducto");

            } catch (Exception ex) {
                System.out.println("Error en el servlt de producto" + ex.getMessage());
            }
        }
    }
}
