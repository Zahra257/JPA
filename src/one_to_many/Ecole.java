package one_to_many;

import java.util.List;

import javax.persistence.*;

@Entity
public class Ecole {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)   //id auto inscrument in each table

	private int id;
private  String nom ;
@OneToMany(cascade =CascadeType.PERSIST)
//chofi na wach kina mapped by
@JoinTable(name="ecole_personne",
joinColumns = @JoinColumn(name="id_ecole"),
inverseJoinColumns = @JoinColumn(name="id_personne"))
List<Personne> per;
public Ecole(String nom, List<Personne> per) {
	super();
	this.nom = nom;
	this.per = per;
}
public Ecole() {
	super();
}


}
