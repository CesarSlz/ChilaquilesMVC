package com.barbaro.chilaquilandia.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.barbaro.chilaquilandia.modelos.OrdenChilaquil;

@WebServlet(name = "Pedido", urlPatterns = {"/pedido"})
public class PedidoServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		
		// MVC - Cargando una vista 
		RequestDispatcher dispatcher = req.getRequestDispatcher("pedido.html");
		
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		generarOrden(req, resp);
	}
	
	private void generarOrden(HttpServletRequest req,
			HttpServletResponse resp) throws IOException, ServletException {
		
		// Recuperar valores de peticion del cliente
		// Esto despues se va a modelar solo (Encapsular la informacion en un modelo)
		String tamaño = req.getParameter("rbTamanyo");
		String salsa = req.getParameter("opSalsa");
		String consistencia = req.getParameter("rbConsis");
		String toppingCrema = req.getParameter("cbCrema");
		String toppingQueso = req.getParameter("cbQueso");
		String toppingQuesoG = req.getParameter("cbQuesoG");
		String toppingCebolla = req.getParameter("cbCebolla");
		String toppingJitomate = req.getParameter("cbJitomate");
		String toppingLechuga = req.getParameter("cbLechuga");
		String extraPollo = req.getParameter("cbPollo");
		String extraChorizo = req.getParameter("cbChori");
		String extraFrijoles = req.getParameter("cbFrijoles");
		String extraNopales = req.getParameter("cbNopales");
		String huevo = req.getParameter("rbHuevo");
		String bebida = req.getParameter("opBebida");
		String tamañoBeb = req.getParameter("rbTamanyoB");
		
		RequestDispatcher dispatcher = null;
	
		// Crear Modelo
		// El modelo es un objeto que te permite encapsular la informacion para tener mas control
		OrdenChilaquil orden = new OrdenChilaquil();
		
		// Guardar informacion en el modelo
		orden.setTamaño(tamaño);
		orden.setSalsa(salsa);
		orden.setConsistencia(consistencia);
		
		List<String> toppings = new ArrayList<>();
		// Validar que el valor no sea nulo
		if(toppingQueso != null && toppingQueso.equals("on")) {
			toppings.add("Queso");
		}
		if(toppingQuesoG != null && toppingQuesoG.equals("on")) {
			toppings.add("Queso gratinado");
		}
		if(toppingCrema != null && toppingCrema.equals("on")) {
			toppings.add("Crema");
		}
		if(toppingCebolla != null && toppingCebolla.equals("on")) {
			toppings.add("Cebolla");
		}
		if(toppingJitomate != null && toppingJitomate.equals("on")) {
			toppings.add("Jitomate");
		}
		if(toppingLechuga != null && toppingLechuga.equals("on")) {
			toppings.add("Lechuga");
		}
		
		orden.setToppings(toppings);
		
		List<String> extras = new ArrayList<>();
		if(extraPollo != null && extraPollo.equals("on")) {
			extras.add("Pollo");
		}
		if(extraChorizo != null && extraChorizo.equals("on")) {
			extras.add("Chorizo");
		}
		if(extraFrijoles != null && extraFrijoles.equals("on")) {
			extras.add("Frijoles");
		}
		if(extraNopales != null && extraNopales.equals("on")) {
			extras.add("Nopales");
		}
		
		orden.setExtras(extras);
		orden.setTipoHuevo(huevo);
		orden.setBebida(bebida);
		orden.setTamañoBebida(tamañoBeb);
		
		// Establecer un modelo para la vista
		req.setAttribute("orden", orden);
		
		// Navegar entre JSP y Servlet pero tambien carga HTML
		dispatcher = req.getRequestDispatcher("orden_generada.jsp");
		
		dispatcher.include(req, resp);
	}
}
