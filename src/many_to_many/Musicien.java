package many_to_many;

import java.util.List;

import javax.persistence.*;


@Entity
public class Musicien {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	
	@ManyToMany//(cascade = CascadeType.ALL)
	@JoinTable(name = "musicien_instrument", 
	  joinColumns = @JoinColumn(name = "musicien_id"), 
	  inverseJoinColumns = @JoinColumn(name = "instrument_id"))
	List<Instrument> instruments;

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

	public List<Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(List<Instrument> instruments) {
		this.instruments = instruments;
	}

	public Musicien(String nom, String prenom){
		super();
		this.nom = nom;
		this.prenom = prenom;
		
	}
	

	public Musicien(String nom, String prenom, List<Instrument> instruments) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.instruments = instruments;
	}

	public Musicien() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


}