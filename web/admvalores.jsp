<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Valores</title>
    </head>
    <body>
        <h1>Administracion Valores</h1>
        <a href="ControllerValores?action=add">Nuevo</a>

        <table border="1">
            <tr>
                <th>Id</th>
                <th>Id_Producto</th>
                <th>Cantidad</th>
                <th>Expiracion</th>
                <th>fabricado</th>
                <th>comprado</th>
                <th></th>
                <th></th>
            </tr>
            <c:forEach var="item" items="${valores}">
                <tr>
                    <td>${item.id_valor}</td>
                    <td>${item.id_prod}</td>
                    <td>${item.cantidad}</td>
                    <td>${item.expiracion}</td>
                    <td>${item.fabricado}</td>
                    <td>${item.comprado}</td>
                    <td><a href="ControllerValores?action=edit&id_valor=${item.id_valor}" >Editar</a></td>
                    <td><a href="ControllerValores?action=delete&id_valor=${item.id_valor}" >Eliminar</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
