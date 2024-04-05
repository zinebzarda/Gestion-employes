package com.employes.servlet;

import java.io.IOException;
import java.lang.reflect.Array;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class listEmployee
 */
@WebServlet("/listEmployee")
public class listEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  this.getServletContext().getRequestDispatcher("/WEB-INF/afficher.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		  String id =request.getParameter("id");
		  if(Array.stream().anyMatch(emp -> emp.getId().equals(id))) {
		   request.setAttribute("isAbleToAdd",".");
		   request.setAttribute("emps",Array);
		   this.getServletContext().getRequestDispatcher("/WEB-INF/afficher.jsp").forward(request, response);
		   
		  }else { 
		  String name = request.getParameter("name");
		  String email = request.getParameter("email");
		  String phone = request.getParameter("phone");
		  String departement = request.getParameter("departement");
		  String post = request.getParameter("post");
		  
		  Array.add(new Employee(id,name, email , phone, departement, post));
		  request.setAttribute("emps",Array);
		 
		  this.getServletContext().getRequestDispatcher("/WEB-INF/afficher.jsp").forward(request, response);
		  }
		 }
		 
		 

		  protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		        String id = request.getParameter("id");

		        Array.removeIf(emp -> emp.getId().equals(id));
		        request.setAttribute("emps", Array);
		        this.getServletContext().getRequestDispatcher("/WEB-INF/afficher.jsp").forward(request, response);
	}

}
