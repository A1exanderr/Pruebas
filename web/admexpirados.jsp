<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
        <title>Expirados</title>
    </head>
    <body>
        <h1>Administracion de Expirados</h1>
        <a href="ControllerExpirado?action=add" >Nuevo</a>
        <table border="1" >
            <tr>
                <th>ID</th>
                <th>NOMBRE PRO.</th>
                <th>PRECIO</th>
                <th>CANTIDAD</th>
                <th>FECHA EXP.</th>
                <th></th>
                <th></th>
            </tr>
            <c:forEach var="item" items="${expirado}">
                <tr>
                    <td>${item.id_exp}</td>
                    <td>${item.nombreproducto}</td>
                    <td>${item.precio_prod}</td>
                    <td>${item.cantidad_prod}</td>
                    <td>${item.fecha_expiracion}</td>
                    <td><a href="ControllerExpirado" >Editar</a></td>
                    <td><a href="ControllerExpirado">Eliminar</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
