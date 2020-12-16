<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <%
            String msg = (String) session.getAttribute("error");
            if(msg !=  null)
            {
                //if en verdadero
        %>
        <p style="color:red">
            <%= msg %>
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
                        <input type="text" name="usuario" required/>
                    </td>
                </tr>
                <tr>
                    <td>Clave:</td>
                    <td>
                        <input type="password" name="password" required/>
                    </td>
                </tr>                
                <tr>
                    <td>
                        <input type="submit" value="Ingresar"/>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
