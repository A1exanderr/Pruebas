<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <c:if test="${ventas.id_venta == 0}">
                NUEVO
            </c:if>
            <c:if test="${ventas.id_venta != 0}">
                EDITAR
            </c:if>  
                VENTAS REALIZADAS
        </h1>
        <form action="ControllerVentas" method="post">
            <input type="hidden" name="id_venta" value="${ventas.id_venta}" />
            <table>
                <tr>
                    <td>CODIGO PRODUCTO</td>
                    <td>
                        <input type="text" name="codigo_prod" value="${ventas.codigo_prod}" />
                    </td>
                </tr>
                <tr>
                    <td>NOMBRE PROD</td>
                    <td>
                        <input type="text"  name="nombre" value="${ventas.nombre_generico}"/>
                    </td>
                </tr>
                <tr>
                    <td>MARCA</td>
                    <td>
                        <input type="text"  name="marca" value="${ventas.marca}"/>
                    </td>
                </tr>
                <tr>
                    <td>PESO</td>
                    <td>
                        <input type="text"  name="peso" value="${ventas.peso}"/>
                    </td>
                </tr>
                <tr>
                    <td>TIPO</td>
                    <td>
                        <input type="text"  name="tipo" value="${ventas.tipo}"/>
                    </td>
                </tr>
                <tr>
                    <td>CANTIDAD</td>
                    <td>
                        <input type="text"  name="cantidad" value="${ventas.cantidad}"/>
                    </td>
                </tr>
                <tr>
                    <td>PRECIO</td>
                    <td>
                        <input type="text"  name="precio" value="${ventas.precio}"/>
                    </td>
                </tr>
                <tr>
                    <td>FECHA DE VENTA</td>
                    <td>
                        <input type="date"  name="fecha" value="${ventas.vendido}"/>
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
    </body>
</html>
