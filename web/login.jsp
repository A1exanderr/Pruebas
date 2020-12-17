<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <meta name="description" content="Responsive, Farmacia, Inventario, Administracion">
        <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1">
        <link rel="stylesheet" href="assets/css/site.min.css">
        <link rel="stylesheet" href="css/estilos.css">
    </head>
    <body class="layout-column bg-dark">
        <center id="login">
            <br>
            <div>
                <h1 class="sombra" id="loginletras" >LOGIN</h1>
                <%
                    String msg = (String) session.getAttribute("error");
                    if (msg != null) {
                        //if en verdadero
                %>
                <p style="color:red">
                    <%= msg%>
                </p>
                <%
                        //if en verdaderp
                        session.invalidate();
                    }
                %>

                <form action="LoginSession" method="post">
                    <table>
                        <tr>
                            <td>Usuario:</td>
                            <td>
                                <input type="text" name="usuario" placeholder="Usuario" autofocus="autofocus" autocomplete="off" required/>
                            </td>
                        </tr>
                        <tr>
                            <td>Clave:</td>
                            <td>
                                <input type="password" name="password" required/>
                            </td>
                        </tr>                
                        <tr>
                            <td></td>
                            <td>
                                <input type="submit" value="Ingresar" class="btn btn-primary mb-4"/>
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
            <a href="index.jsp" id="salir">Salir</a>
        </center>
    </body>
</html>
