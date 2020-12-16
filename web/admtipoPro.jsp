<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administracion_tipo</title>
    </head>
    <body>
        <h1>Tipo de Productos</h1>
        <a href="ControllerTipoProducto?action=add" >Nuevo</a>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>DESCRIPCION</th>
                <th></th>
                <th></th>
            </tr>
            <c:forEach var="item" items="${tipopro}">
                <tr>
                    <td>${item.id_tipo_producto}</td>
                    <td>${item.descripcion}</td>
                    <td><a href="ControllerTipoProducto?action=edit&id=${item.id_tipo_producto}" >Editar</a></td>
                    <td><a href="ControllerTipoProducto?action=delete&id=${item.id_tipo_producto}" >Eliminar</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
