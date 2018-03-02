package com.tecsup.lab1.ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;


@WebServlet("/CycleLifeServlet")
public class CycleLifeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CycleLifeServlet() {
        super();
    
    }

	
	public void init(ServletConfig config) throws ServletException {
		
		
		JOptionPane.showMessageDialog(null, "Proceso de inicio");
	}

	
	public void destroy() {
		
		JOptionPane.showMessageDialog(null, "Proceso de DESTROY");
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<html><body>");
		printWriter.println("<h1>Proceso SERVICE</h1>");
		printWriter.println("</body></html>");
		
		
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
