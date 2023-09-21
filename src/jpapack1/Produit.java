package jpapack1;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)   //id auto inscrument in each table
	private int id;
	private String nom;
	private int prix;
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.PERSIST)
	@JoinColumn(name ="idCat")
	private Categorie categorie;
	
	public Produit( String nom, int prix, Categorie categorie) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.categorie = categorie;
	}
	public Produit() {
		
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

	public int getprix() {
		return prix;
	}

	public void setprix(int prix) {
		this.prix = prix;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	
}
