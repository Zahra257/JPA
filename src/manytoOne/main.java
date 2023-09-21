package manytoOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Personne p = new Personne("nn", "kk", 30);
		
		
		Categorie c = new Categorie("cat1");
		Produit p = new Produit("p1",10,c);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionPersonneAvecJpa");
		 
		 EntityManager em = emf.createEntityManager();//sessionfactory
		 em.getTransaction().begin();// seesion
		
		 
		 
			/*
			 * Personne p1 = em.find(Personne.class , 1); p1.getNom();
			 */
			//update
			//Personne p2 = em.find(Personne.class , 1);
			//p2.setPrenom("gggggg");
			//em.merge(p2);
			//delete
			//Personne p3 = em.find(Personne.class , 2);
			//em.remove(p3);
		 
			
		//	em.persist(c); //ajouter
		//you can use just this ligne and will insert in db	em.persist(p); //ajouter
		Produit p44=em.find(Produit.class,1);
		System.out.println(p44.getNom());
		 
		 em.getTransaction().commit();

		 em.close();
		 emf.close();
	
	}

}
