package com.employes.servlet;

public class Employee {
	private String  nom;
	private String email;
	private int telephone;
	private String departement;
	
	
	public Employee(String nom, String email, int telephone, String departement, String poste) {
		this.nom = nom;
		this.email = email;
		this.telephone = telephone;
		this.departement = departement;
		this.poste = poste;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	private String poste;
}