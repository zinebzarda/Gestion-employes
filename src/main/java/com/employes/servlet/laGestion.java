package com.employes.servlet;

import java.util.ArrayList;


public class laGestion {
	public ArrayList<Employee> listeEmployes = new ArrayList<>();

	

	public boolean addEmployes(String nom,String email,int telephone,String departement,String poste) {
		   Employee employe = new Employee(nom,email,telephone,departement,poste);
		   listeEmployes.add(employe);
		   return true;
	   }
	   
	   public boolean deleteEmploye(String nom){
		   for (Employee employe : listeEmployes) {
	           if (employe.getNom() == nom){
	               listeEmployes.remove(employe);
	               return true;
	           }
	       }
		   return false;
	   }
	   
	   public boolean updateEmploye(String nom,String email,int telephone,String departement,String poste){
		   for (Employee employe : listeEmployes) {
	           if (employe.getNom() == nom){
	               employe.setNom(nom);
	               employe.setEmail(email);
	               employe.setTelephone(telephone);;
	               employe.setDepartement(departement);
	               employe.setPoste(poste);
	               return true;
	           }
	       }
		   return false;
	   }



}
