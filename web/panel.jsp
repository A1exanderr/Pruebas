<%
    if(session.getAttribute("login") != "OK"){
        response.sendRedirect("login.jsp");
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Panel</title>
    </head>
    <body>
        <h1>Bienvenido <%= session.getAttribute("usuario") %></h1>
        <p>
            Aqui estaran los modulos para la gestion del sitio
        </p>
        <nav>
            <ul>
                <li>
                    <a href="ControllerUsuario">Administracion de usuario</a>
                </li>
                <li>
                    <a href="ControllerCargo">Administracion de Cargos</a>
                </li>
                <li>
                    <a href="ControllerTipoProducto">Administracion de tipo de productos</a>
                </li>
                <li>
                    <a href="ControllerProducto" >Administrador de Productos</a>
                </li>
                <li>
                    <a href="ControllerValores" >Administrador de valores</a>
                </li>
                <li>
                    <a href="ControllerVentas">Administrar ventas</a>
                </li>
                <li>
                    <a href="ControllerExpirado">Administracion de expirados</a>
                </li>
            </ul>
        </nav>
        <div>
            <a href="ListaProductos">Lista de Producto</a>
            <a href="PerfildeProductos">Perfil de Productos</a>
            <a href="Inventario">Inventario</a>
            <a href="Venta">Ventas</a>
        </div>
        <a href="LoginSession">Salir</a>
    </body>
</html>
