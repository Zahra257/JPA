package manytoOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "etudiant") //table exist 
public class Personne {
	@Id //define the id of the table
	@GeneratedValue(strategy = GenerationType.IDENTITY)   //id auto inscrument in each table
	private int id;
	private String nom;
	private String prenom;
	@Transient //ignore this attribute
	private int age;
	
	public Personne( String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public Personne() {
		
	}

	public Personne(int id, String string, String string2, int j) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
}
