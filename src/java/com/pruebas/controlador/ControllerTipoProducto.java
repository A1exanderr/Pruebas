package com.pruebas.controlador;

import com.pruebas.dao.TipoProductoDAO;
import com.pruebas.dao.TipoProductoDAOimpl;
import com.pruebas.modelo.Tipo_Producto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ControllerTipoProducto", urlPatterns = {"/ControllerTipoProducto"})
public class ControllerTipoProducto extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            TipoProductoDAO dao = new TipoProductoDAOimpl();
            String action =(request.getParameter("action") != null) ? request.getParameter("action") : "view";
            Tipo_Producto car = new Tipo_Producto();
            int id;
            switch(action)
            {
                case "add":
                    request.setAttribute("tipopro", car);
                    request.getRequestDispatcher("formularioTipo.jsp").forward(request, response);
                    break;
                case "edit":
                    id = Integer.parseInt(request.getParameter("id"));
                    car = dao.getById(id);
                    System.out.println(car);
                    request.setAttribute("tipopro", car);
                    request.getRequestDispatcher("formularioTipo.jsp").forward(request, response);
                    
                    break;
                case "delete":
                    id = Integer.parseInt(request.getParameter("id"));
                    dao.delete(id);
                    response.sendRedirect(request.getContextPath()+"/ControllerTipoProducto");
                    break;
                case "view":
                    List<Tipo_Producto> lista = dao.getAll();
                    request.setAttribute("tipopro", lista);///usuario= es una variable que se va a enviar al otro lado del jsp
                    request.getRequestDispatcher("admtipoPro.jsp").forward(request, response);//Seabrira un archivo jsp
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
        int id_tipo = Integer.parseInt(request.getParameter("id_tipo_producto"));
        String descripcion = request.getParameter("descripcion");
        
        Tipo_Producto tip = new Tipo_Producto();
        
        tip.setId_tipo_producto(id_tipo);
        tip.setDescripcion(descripcion);
        
        if (id_tipo == 0) {
            try{
                    TipoProductoDAO dao = new TipoProductoDAOimpl();
                    dao.insert(tip);
                    response.sendRedirect(request.getContextPath()+"/ControllerTipoProducto");
            }
            catch(Exception e)
            {
                System.out.println("Error en el registro de forulario Tipo " +e.getMessage());
            }
            
        }
        else{
            try{
                TipoProductoDAO dao = new TipoProductoDAOimpl();
                dao.update(tip);
                response.sendRedirect(request.getContextPath()+"/ControllerTipoProducto");
            }catch(Exception ex){
                System.out.println("Error en Uptade de tipo pro "+ ex.getMessage());
            }
            
        }
    }

}
