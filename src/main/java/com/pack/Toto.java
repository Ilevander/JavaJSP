package com.pack;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/jspCall")
public class Toto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Toto() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*String message = "Coders Evanderhood";
		request.setAttribute("var", message); */
		request.setAttribute("heure", "jour");
        
		this.getServletContext().getRequestDispatcher("/WEB-INF/HiServlet.jsp").forward(request, response);
         
       
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
