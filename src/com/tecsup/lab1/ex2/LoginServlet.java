package com.tecsup.lab1.ex2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String C_USER="jose";
	private String C_PASSWORD="guerra";
	
	
    public LoginServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String usuario = request.getParameter("usuario");
		String clave = request.getParameter("clave");
	
		
		if(usuario.equals(C_USER)&& clave.equals(C_PASSWORD)) {
			request.getRequestDispatcher("/menu.jsp");
		}else {
			request.getRequestDispatcher("/error.jsp");
		}
		
		
		PrintWriter printWriter = response.getWriter();
		
		recibirDatos(usuario, clave, printWriter, "GET");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String usuario = request.getParameter("usuario");
		String clave = request.getParameter("clave");
				
		
		if(usuario.equals(C_USER)&& clave.equals(C_PASSWORD)) {
		
			
			request.setAttribute("params", "A buena hora! logeo Exitoso!");
			request.getRequestDispatcher("/menu.jsp").forward(request, response);;
		}else {
			request.setAttribute("params", "O no! Algo salio mal!");
			request.getRequestDispatcher("/error.jsp").forward(request, response);;
		}
		
		//PrintWriter printWriter = response.getWriter();
		//recibirDatos(usuario, clave, printWriter, "POST");
	}
	
	private void recibirDatos(String usuario, String clave, PrintWriter printwriter, String metodo) {
		
		PrintWriter salida = printwriter;
		salida.println("<html>");
		salida.println("<head>");
		salida.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">");
		salida.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>");
		salida.println("</head>");
		salida.println("<body>");
		salida.println("<div class=\"jumbotron text-center\">");
		salida.println("<h2>Respuesta desde el servelt</h2>");
		salida.println("<b>Metodos de envio al formulario</b> " + metodo);
		salida.println("<h1>Usuario: " + usuario + "</h1>");
		salida.println("<h1>Clave " + clave + "</h1>");
		salida.println("</div>");
		
		salida.println("</body></html>");
		
	}
	
	
	

}
