package daos;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EntityManagerSingleton {
	
	private static EntityManager em = null;

	private EntityManagerSingleton() {}
	
	public static EntityManager getEntityManager() {
		if(em==null)
			em =  Persistence.createEntityManagerFactory("demo").createEntityManager();
		return em;
	}
	
}
