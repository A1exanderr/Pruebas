<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ventas</title>
    </head>
    <body>
        <h1>TODA LAS VENTAS</h1>
        <a href="ControllerVentas?action=add" >Nuevo</a>
        <table border="1">
            <tr>
                <th>ID_VENTA</th>
                <th>CODIGO PRODUCTO</th>
                <th>NOMBRE PROD.</th>
                <th>MARCA</th>
                <th>PESO</th>
                <th>TIPO</th>
                <th>CANTIDAD</th>
                <th>PRECIO</th>
                <th>VENDIDO</th>
                <th></th>
                <th></th>
            </tr>
            <c:forEach var="item" items="${ventas}">
                <tr>
                    <td>${item.id_venta}</td>
                    <td>${item.codigo_prod}</td>
                    <td>${item.nombre_generico}</td>
                    <td>${item.marca}</td>
                    <td>${item.peso}</td>
                    <td>${item.tipo}</td>
                    <td>${item.cantidad}</td>
                    <td>${item.precio}</td>
                    <td>${item.vendido}</td>
                    <td><a href="ControllerVentas?action=edit&id_venta=${item.id_venta}" >Editar</a></td>
                    <td><a href="ControllerVentas?action=delete&id_venta=${item.id_venta}" >Eliminar</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
