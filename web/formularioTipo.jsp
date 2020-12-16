<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>formularioTipo</title>
    </head>
    <body>
        <h1>
            <c:if test="${tipopro.id_tipo_producto == 0}">
                Nuevo
            </c:if>
            <c:if test="${tipopro.id_tipo_producto != 0}">
                Editar
            </c:if>
                formulario Tipo Productos
        </h1>
        <form action="ControllerTipoProducto" method="post">
            <table>
                <input type="hidden" name="id_tipo_producto" value="${tipopro.id_tipo_producto}" />
                <tr>
                    <td>
                        <label>TIPO DE PRODUCTO</label>
                    </td>
                    <td>
                        <input type="text" name="descripcion" placeholder="Escriba que clase de pruductos es:...." value="${tipopro.descripcion}" />
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
