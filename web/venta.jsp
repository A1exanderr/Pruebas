<%
    if(session.getAttribute("login") != "OK"){
        response.sendRedirect("login.jsp");
    }
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ventas</title>
    </head>
    <body>
        <a href="" >Implimir Ventas </a>
        <form action="" method="post" >
            <input type="search" />
        </form>
        <h1>VENTAS</h1>
        <table border="1">
            <tr>
                <th>CODIGO PRODUCTO</th>
                <th>NOMBRE PROD.</th>
                <th>FRABRICANTE</th>
                <th>PESO</th>
                <th>TIPO</th>
                <th>CANTIDAD</th>
                <th>PRECIO(Bs.)</th>
                <th>SUB. TOTAL</th>
            </tr>
            <c:set var="suma" value="${0}"></c:set>
            <c:forEach var="item" items="${ventas}">
                <tr>
                    <c:set var="total" value="${0}"></c:set>
                    <td>${item.codigo_prod}</td>
                    <td>${item.nombre_generico}</td>
                    <td>${item.marca}</td>
                    <td>${item.peso}</td>
                    <td>${item.tipo}</td>
                    <td>${item.cantidad}</td>
                    <td>${item.precio}</td>
                    <c:set var="total" value="${item.cantidad * item.precio}"></c:set>
                    <td>${total}</td>
                    <c:set var="suma" value="${suma + total}"></c:set>
                </tr>
            </c:forEach>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td>TOTAL:</td>
                    <td>${suma}</td>
                    
                </tr>
        </table>
    </body>
</html>
