<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario Expirados</title>
    </head>
    <body>
        <h1><c:if test="${expirado.id_exp == 0}">
                Nuevo
            </c:if>
            <c:if test="${expirado.id_exp != 0}">
                Editar
            </c:if>
                farmaco expirado
        </h1>
        <div>
            <form>
                <input type="hidden" name="id_exp" value="${expirado.id_exp}" />
                <table>
                    <tr>
                        <td>Nombre_Pro.</td>
                        <td>
                            <input type="text" name="nombre_prod" value="${expirado.nombreproducto}" />
                        </td>
                    </tr>
                    <tr>
                        <td>Precio</td>
                        <td>
                            <input type="text" name="precio_prod" value="${expirado.precio_prod}" />
                        </td>
                    </tr>
                    <tr>
                        <td>Cantidad</td>
                        <td>
                            <input type="text" name="cantidad_prod" value="${expirado.cantidad_prod}" />
                        </td>
                    </tr>
                    <tr>
                        <td>Vencimiento</td>
                        <td>
                            <input type="date" name="fecha_ven" value="${expirado.fecha_expiracion}" />
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
        </div>
    </body>
</html>
