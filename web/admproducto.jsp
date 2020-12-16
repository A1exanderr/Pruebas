<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administracion de productos</title>
    </head>
    <body>
        <h1>Administracion de productos</h1>
        <a href="ControllerProducto?action=add">Nuevo</a>
        <table border="1">
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Precio</th>
                <th>Codigo</th>
                <th>Marca</th>
                <th>Peso</th>
                <th>Id_typo_pro</th>
                <th>Descripcion</th>
                <th></th>
                <th></th>
            </tr>
            <c:forEach var="item" items="${producto}">
                <tr>
                    <td>${item.id_prod}</td>
                    <td>${item.nombre_prod}</td>
                    <td>${item.precio_prod}</td>
                    <td>${item.codigo_prod}</td>
                    <td>${item.marca_prod}</td>
                    <td>${item.peso_prod}</td>
                    <td>${item.id_typo_pro}</td>
                    <td>${item.descripcion}</td>
                    <td><a href="ControllerProducto?action=edit&id_prod=${item.id_prod}" >Editar</a></td>
                    <td><a href="ControllerProducto?action=delete&id_prod=${item.id_prod}" >Eliminar</a></td>
                </tr>
            </c:forEach>

        </table>
    </body>
</html>
