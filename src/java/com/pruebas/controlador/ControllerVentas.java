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

@WebServlet(name = "ControllerVentas", urlPatterns = {"/ControllerVentas"})
public class ControllerVentas extends HttpServlet {

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
                    request.setAttribute("ventas", ven);
                    request.getRequestDispatcher("formularioventas.jsp").forward(request, response);
                    break;
                case "edit":
                    id_venta = Integer.parseInt(request.getParameter("id_venta"));
                    ven = dao.getById(id_venta);
                    System.out.println(ven);
                    request.setAttribute("ventas", ven);
                    request.getRequestDispatcher("formularioventas.jsp").forward(request, response);
                    break;
                case "delete":
                    id_venta = Integer.parseInt(request.getParameter("id_venta"));
                    dao.delete(id_venta);
                    response.sendRedirect(request.getContextPath() + "/ControllerVentas");
                    break;
                case "view":
                    List<Ventas> lista = dao.getAll();
                    request.setAttribute("ventas", lista);
                    request.getRequestDispatcher("admventas.jsp").forward(request, response);
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
        int id_venta = Integer.parseInt(request.getParameter("id_venta"));
        String codigo_prod = request.getParameter("codigo_prod");
        String nombre_generico = request.getParameter("nombre");
        String marca = request.getParameter("marca");
        String peso = request.getParameter("peso");
        String tipo = request.getParameter("tipo");
        int cantidad = Integer.parseInt(request.getParameter("cantidad"));
        double precio = Double.parseDouble(request.getParameter("precio"));
        String vendido = request.getParameter("fecha");

        Ventas ven = new Ventas();
        
        ven.setId_venta(id_venta);
        ven.setCodigo_prod(codigo_prod);
        ven.setNombre_generico(nombre_generico);
        ven.setMarca(marca);
        ven.setPeso(peso);
        ven.setTipo(tipo);
        ven.setCantidad(cantidad);
        ven.setPrecio(precio);
        ven.setVendido(vendido);
        
        if (id_venta == 0) {
            try {
                VentasDAO dao = new VentasDAOimpl();
                dao.insert(ven);
                response.sendRedirect(request.getContextPath() + "/ControllerVentas");
            } catch (Exception ex) {
                System.out.println("Error en serplet de ventas" + ex.getMessage());
            }

        } else {
            try {
                VentasDAO dao = new VentasDAOimpl();
                dao.update(ven);
                response.sendRedirect(request.getContextPath() + "/ControllerVentas");

            } catch (Exception ex) {
                System.out.println("Error en el servlt de ventas" + ex.getMessage());
            }
        }
    }

}
