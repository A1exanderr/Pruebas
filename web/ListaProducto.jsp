<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administracion de productos</title>
    </head>
    <body>
        <h1>Lista de Producto</h1>
        <a href="ControllerProducto?action=add">Agregar producto</a>
        <table border="1">
            <tr>
                <th>Codigo</th>
                <th>Nombre</th>               
                <th>Fabricante</th>
                <th>Peso</th>
                <th>Tipo</th>
                <th>Precio</th> 
                <th>Acciones</th>
               
            </tr>
            <c:forEach var="item" items="${producto}">
                <tr>
                    <td>${item.codigo_prod}</td>
                    <td>${item.nombre_prod}</td>
                    <td>${item.marca_prod}</td>
                    <td>${item.peso_prod} grm.</td>
                    <td>${item.descripcion}</td>
                    <td>${item.precio_prod} (Bs.)</td>
                    <td><a href="ControllerProducto?action=edit&id_prod=${item.id_prod}" >Editar</a></td>
                </tr>
            </c:forEach>

        </table>
        <a href="panel.jsp">Volver</a>
    </body>
</html>
