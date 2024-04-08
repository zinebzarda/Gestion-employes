package com.employes.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addEmployes")
public class addEmployes extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public addEmployes() {
    	   super();
           // TODO Auto-generated constructor stub
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		this.getServletContext().getRequestDispatcher("/WEB-INF/addEmployee.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String nom = request.getParameter("nom");
		String email = request.getParameter("email");
		int telephone = Integer.parseInt(request.getParameter("telephone"));
		String departement = request.getParameter("departement");
		String poste = request.getParameter("poste");
		
		laGestion gestionEM = new laGestion();
		boolean add = gestionEM.addEmployes(nom, email, telephone, departement, poste);
		
		request.setAttribute("Resultat", add);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/addEmployee.jsp").forward(request, response);
	
	}

}
