<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de producto</title>
    </head>
    <body>
        <h1>
            <c:if test="${producto.id_prod == 0}">
                NUEVO
            </c:if>
            <c:if test="${producto.id_prod != 0}">
                EDITAR
            </c:if>
                 PRODUCTO
        </h1>
        <form action="ControllerProducto" method="post" >
            <input type="hidden" name="id_prod" value="${producto.id_prod}" />
            <table>
                <tr>
                    <td>Nombre:</td>
                    <td>
                        <input type="text" name="nombre_prod" value="${producto.nombre_prod}"/>
                    </td>
                </tr>
                <tr>
                    <td>Precio:</td>
                    <td>
                        <input type="text" name="precio_prod" value="${producto.precio_prod}"/>
                    </td>
                </tr>
                <tr>
                    <td>Codigo</td>
                    <td>
                        <input type="text" name="codigo_prod" value="${producto.codigo_prod}"/>
                    </td>
                </tr>
                <tr>
                    <td>Marca</td>
                    <td>
                        <input type="text" name="marca_prod" value="${producto.marca_prod}"/>
                    </td>
                </tr>
                <tr>
                    <td>Peso</td>
                    <td>
                        <input type="text" name="peso_prod" value="${producto.peso_prod}"/>
                    </td>
                </tr>
                <tr>
                    <td>Tipo</td>
                    <td>
                        <input type="text" name="tipo_prod" value="${producto.id_typo_pro}"/>
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
