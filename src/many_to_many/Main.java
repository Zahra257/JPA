package many_to_many;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("gestionPersonneAvecJpa");
		
		EntityManager em= emf.createEntityManager();
		EntityTransaction tr= em.getTransaction();
		tr.begin();

		
		
		Instrument instr = new Instrument("hdhdhdhd");
		List<Instrument> liste = new ArrayList<>();
		liste.add(instr);
		Musicien musicien1 = new Musicien("ismail55", "hafil55", liste);
		em.persist(musicien1);
		 
		 
		
		
		Musicien musicien = new Musicien("ismail777", "hafil777");
		List<Musicien> musc = new ArrayList<>();
		musc.add(musicien);
		Instrument instr2 = new Instrument("c", musc);
		em.persist(instr);
		 
		
	
		em.getTransaction().commit();
		
		em.close();
		
		emf.close();
		

	}

}
