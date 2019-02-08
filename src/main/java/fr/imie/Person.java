package fr.imie;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

	@Id @GeneratedValue
	private Integer id;

	private String prenom;

	private String nom;

	private String email;

	public Person() {
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public Person(String prenom, String nom, String email) {
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
