package com.pruebas.controlador;

import com.pruebas.dao.ProductoDAO;
import com.pruebas.dao.ProductoDAOimpl;
import com.pruebas.modelo.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ControllerProducto", urlPatterns = {"/ControllerProducto"})
public class ControllerProducto extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            ProductoDAO dao = new ProductoDAOimpl();
            int id_prod;
            Producto pro = new Producto();
            String action = (request.getParameter("action") != null) ? request.getParameter("action") : "view";
            switch (action) {

                case "add":
                    request.setAttribute("producto", pro);
                    request.getRequestDispatcher("formularioproducto.jsp").forward(request, response);
                    break;
                case "edit":
                    id_prod = Integer.parseInt(request.getParameter("id_prod"));
                    pro = dao.getById(id_prod);
                    System.out.println(pro);
                    request.setAttribute("producto", pro);
                    request.getRequestDispatcher("formularioproducto.jsp").forward(request, response);
                    break;
                case "delete":
                    id_prod = Integer.parseInt(request.getParameter("id_prod"));
                    dao.delete(id_prod);
                    response.sendRedirect(request.getContextPath()+"/ControllerProducto");
                    break;
                case "view":
                    List<Producto> lista = dao.getAll();
                    request.setAttribute("producto", lista);
                    request.getRequestDispatcher("admproducto.jsp").forward(request, response);
                    break;
                default:
                    break;
            }

        } catch (Exception ex) {
            System.out.println("Error en la pate de servlet Producto Alex"+ex.getMessage());
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
        
        Producto pro = new Producto();
        
        pro.setId_prod(id_prod);
        pro.setNombre_prod(nombre_prod);
        pro.setPrecio_prod(precio_prod);
        pro.setCodigo_prod(codigo_prod);
        pro.setMarca_prod(marca_prod);
        pro.setPeso_prod(peso_prod);
        pro.setId_typo_pro(id_type_pro);
       
        if (id_prod == 0) {
            try{
                ProductoDAO dao = new ProductoDAOimpl();
                dao.insert(pro);
                response.sendRedirect(request.getContextPath()+"/ControllerProducto");
            }catch(Exception ex)
            {
                System.out.println("Error en serplet de producto"+ex.getMessage());
            }
            
            
        }
        else
        {
            try{
                ProductoDAO dao = new ProductoDAOimpl();
                dao.update(pro);
                response.sendRedirect(request.getContextPath()+"/ControllerProducto");
                
            }catch(Exception ex)
            {
                System.out.println("Error en el servlt de producto" + ex.getMessage());
            }
        }
    }
}
