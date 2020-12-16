<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Valores</title>
    </head>
    <body>
        <h1>Perfil de Productos</h1>
        <a href="ControllerValores?action=add">Nuevo</a>

        <table border="1">
            <tr>
                <th>Codigo</th>
                <th>Nomnre</th>
                <th>Tipo</th>
                <th>Frabricado</th>
                <th>Comprado</th>
                <th>Precio</th>
                <th>Cantidad</th>
                <th>Vence</th>
                <th>Acciones</th>
            </tr>
            <c:forEach var="item" items="${valores}">
                <tr>
                    <td>${item.codigo_prod}</td>
                    <td>${item.nombre_prod}</td>
                    <td>${item.descripcion}</td>
                    <td>${item.fabricado}</td>
                    <td>${item.comprado}</td>
                    <td>${item.precio_prod} Bs.</td>
                    <td>${item.cantidad}</td>
                    <td>${item.expiracion}</td>
                    <td><a href="PerfildeProductos?action=delete&id_valor=${item.id_valor}" >Eliminar</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
