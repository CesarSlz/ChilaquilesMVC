<%@page import="com.barbaro.chilaquilandia.modelos.OrdenChilaquil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Orden Generada</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>

	<div class="justify-content-center bg-light">
		<div class="text-center">
			<h2>Orden Lista</h2>
			<h4>Tus chilaquiles tienen: </h4>
			<%
				OrdenChilaquil orden = (OrdenChilaquil) request.getAttribute("orden");
				out.println("<p><b>Tamaño: </b>" + orden.getTamaño() + "</p>");
				out.println("<p><b>Salsa: </b>" + orden.getSalsa() + "</p>");
				out.println("<p><b>Consistencia: </b>" + orden.getConsistencia() + "</p>");
				
				out.println("<p><b>Toppings</b></p>");
				for(int i = 0; i <orden.getToppings().size(); i++){
					out.println("<p>" + orden.getToppings().get(i) + "</p>");
				}
				
				out.println("<p><b>Extras</b></p>");
				for(int i = 0; i <orden.getExtras().size(); i++){
					out.println("<p>" + orden.getExtras().get(i) + "</p>");
				}
				
				out.println("<p><b>Huevo: </b>" + orden.getTipoHuevo() + "</p>");
				out.println("<p><b>Bebida: </b>" + orden.getBebida() + "</p>");
				out.println("<p><b>Tamaño bebida: </b>" + orden.getTamañoBebida() + "</p>");
			%>
		</div>
	</div>
</body>
</html>