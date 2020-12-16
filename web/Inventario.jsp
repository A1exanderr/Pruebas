<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inventario</title>
    </head>
    <body>
        <h1>Inventario</h1>
        <a href="">Imprimir lista de inventario</a>
        <table border="1">
            <tr>
               
                <th>Nomnre</th>
                <th>Precio</th>
                <th>Cantidad</th>
                
            </tr>
            <c:forEach var="item" items="${valores}">
                <tr>
                    <td>${item.nombre_prod}</td>
                    <td>${item.precio_prod} Bs.</td>
                    <td>${item.cantidad}</td>
                </tr>
            </c:forEach>
        </table>
        <a href="panel.jsp">Volver</a>
    </body>
</html>
