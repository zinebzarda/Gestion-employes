package com.employes.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employes.servlet.laGestion;
/**
 * Servlet implementation class editEmploye
 */

@WebServlet("/editEmploye")
public class editEmploye extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editEmploye() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String email = request.getParameter("email");
		int telephone = Integer.parseInt(request.getParameter("telephone"));
		String departement = request.getParameter("departement");
		String poste = request.getParameter("poste");
		
		request.setAttribute("nom", nom);
		request.setAttribute("email", email);
		request.setAttribute("telephone", telephone);
		request.setAttribute("departement", departement);
		request.setAttribute("poste", poste);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/editEmploye.jsp").forward(request, response);
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
		boolean update = gestionEM.updateEmploye(nom, email, telephone, departement, poste);
		
		request.setAttribute("Resultat", update);
		this.getServletContext().getRequestDispatcher("/WEB-INF/editEmploye.jsp").forward(request, response);
	}
}
