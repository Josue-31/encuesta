<%@page import="com.emergentes.Encuesta"%>
<%
//recuperamos el objeto ciempre especificar el tipo de dato con
//(Encuesta)request ahi dspues de =

    Encuesta encu = (Encuesta) request.getAttribute("encu");
    //primera forma
    //String lenguajes[] = encu.getLenguajes();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Gracias por llenar la encuesta</h1>
        <p>Los datos recividos son:</p>
        <p>Nombre : <%= encu.getNombre()%> los lenguajes de su preferencia son: </p>

        <ul>
            <%
                //priemra forma
                //if (lenguajes != null) {
                
                if (encu.getLenguajes() != null) {
                //item recoge los valores del arreglo
                //por eo solo se imprime irem
                    for (String item : encu.getLenguajes()) {

            %>
            <li><%= item%></li>
                <%                    }
                    }
                %>
        </ul>
        <br>
        <a href="index.jsp">volver</a>

    </body>
</html>
