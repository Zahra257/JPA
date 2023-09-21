package one_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Personne p1 =new Personne("nom1","pre1");
		Personne p2 =new Personne("nom2","pre1");
		Personne p3 =new Personne("nom3","pre1");
		
		
		List<Personne>arr = new ArrayList<>();
		arr.add(p1);
		arr.add(p2);
		arr.add(p3);
		
		
		
		Ecole c1 = new Ecole("ecole1", arr);
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionPersonneAvecJpa");
		 
		 EntityManager em = emf.createEntityManager();//sessionfactory
		 em.getTransaction().begin();// seesion
		
		 
		// em.persist(c1);
		 
		 Ecole ecole =em.find(Ecole.class , 1);
		
		 System.out.println(ecole.getClass());
		 
		 
		 
		 
		 em.getTransaction().commit();
		 em.close();
		 emf.close();
	}

}
