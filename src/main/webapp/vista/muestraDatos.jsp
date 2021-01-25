<%-- 
    Document   : muestraDatos
    Created on : 25-ene-2021, 19:41:56
    Author     : DAW-B
--%>

<%@page import="modelo.Calculadora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Precio del billete: </h1>
        <% 
        /**
         * Calculadora cal = (Calculadora) request.getAttribute("calculadora");
         * Op1:  cal.getOp1() 
         *Op1:  cal.getOp2()
         *Operacion:  cal.getOperacion()
         *Resultado:  cal.getResultado()
        */
         request.getAttribute("calculadora");
        %>

        El resultado de ${calculadora.op1} ${calculadora.operacion} ${calculadora.op2} es igual a ${calculadora.resultado}<br>
        <a href="index.jsp">Volver al inicio</a>
    </body>
</html>
