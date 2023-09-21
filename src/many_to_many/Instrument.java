package many_to_many;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Instrument {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nom;
	
	@ManyToMany(mappedBy = "instruments",cascade = CascadeType.ALL)
	List<Musicien> musiciens;

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

	public List<Musicien> getMusiciens() {
		return musiciens;
	}

	public void setMusiciens(List<Musicien> musiciens) {
		this.musiciens = musiciens;
	}
	

	public Instrument(String nom) {
		super();
		this.nom = nom;
	}

	public Instrument(String nom,List<Musicien> musiciens) {
		super();
		this.nom = nom;
		this.musiciens = musiciens;
	}

	public Instrument() {
		super();
		// TODO Auto-generated constructor stub
	}




	
	

}