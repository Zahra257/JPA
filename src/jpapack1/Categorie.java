package jpapack1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)   //id auto inscrument in each table
	
private int idcat;
private String nomcat;
@OneToMany(mappedBy = "categorie")
List<Produit>produits;

public Categorie() {

}
public Categorie(String nomcat) {
	this.nomcat = nomcat;
}
public int getIdcat() {
	return idcat;
}
public void setIdcat(int idcat) {
	this.idcat = idcat;
}
public String getNomcat() {
	return nomcat;
}
public void setNomcat(String nomcat) {
	this.nomcat = nomcat;
}

}
