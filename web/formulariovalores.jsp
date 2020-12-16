<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario Valores</title>
    </head>
    <body>
        <h1>
            <c:if test="${valores.id_valor == 0}">
                NUEVO
            </c:if>
            <c:if test="${valores.id_valor != 0}">
                EDITAR
            </c:if>
            REGISTRO
        </h1>
        <form action="ControllerValores" method="post" >
            <input type="hidden" name="id_valor" value="${valores.id_valor}" />
            <table>
                <tr>
                    <td>Id producto</td>
                    <td>
                        <input type="text" name="id_prod" value="${valores.id_prod}" />
                    </td>
                </tr>
                <tr>
                    <td>Cantidad</td>
                    <td>
                        <input type="text" name="cantidad" value="${valores.cantidad}" />
                    </td>
                </tr>
                <tr>
                    <td>Fecha de expiracion</td>
                    <td>
                        <input type="date" name="expiracion" value="${valores.expiracion}" />
                    </td>
                </tr>
                <tr>
                    <td>Fecha de fabricacion</td>
                    <td>
                        <input type="date" name="fabricado" value="${valores.fabricado}" />
                    </td>
                </tr>
                <tr>
                    <td>Fecha de compra</td>
                    <td>
                        <input type="date" name="comprado" value="${valores.comprado}" />
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input type="submit" value="Registrar" />
                    </td>
                </tr>
            </table>
        </form>
        <a href="panel.jsp">Volver</a>
    </body>
</html>
