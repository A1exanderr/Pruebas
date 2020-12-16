<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrador de cargos</title>
    </head>
    <body>
        <h1>CARGOS</h1>
        <table border="1">
            <tr>
                <th>id</th>
                <th>Cargo</th>
            </tr>
            <c:forEach var="item" items="${carg}">
                <tr>
                    <td>${item.id_cargo}</td>
                    <td>${item.cargo}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
