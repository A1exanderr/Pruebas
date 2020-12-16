<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : admuser
    Created on : 14-12-2020, 05:28:28 AM
    Author     : jin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administracio Usuario</title>
    </head>
    <body>
        <h1>Adminisracion de Usuaio</h1>
        <table border="1">
            <tr>
                <td>Id</td>
                <td>Nombre</td>
                <td>Apellido</td>
                <td>CI</td>
                <td>Usuario</td>
                <td>Password</td>
                <td>Id_Cargo</td>
                <td>Cargo</td>
            </tr>
            <c:forEach var="item" items="${usuario}">
                <tr>
                    <td>${item.id_usuario}</td>
                    <td>${item.nombre}</td>
                    <td>${item.apellidos}</td>
                    <td>${item.ci}</td>
                    <td>${item.usuario}</td>
                    <td>${item.password}</td>
                    <td>${item.id_cargo}</td>
                    <td>${item.cargo}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
