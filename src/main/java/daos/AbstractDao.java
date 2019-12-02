
package daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import entities.User;

public abstract class AbstractDao<T> implements Dao<T>{
	
	public void save(T t) {
		getEntityManager().persist(t);
		
	}
	
	public T get(Class<T> target, int id) {
		T t = getEntityManager().find(target, id);
		return t;
	}
	
	public List<T> getBy(Class<T> target, String field, String value) {
		List<T>  t =  getEntityManager().createQuery("SELECT u FROM " + target.getSimpleName() + " u JOIN Adress a  WHERE u." + field +" = '" + value + "'", target).getResultList();;
		ArrayList<T> l = new ArrayList<T>(t);
		return l;
	}
	
	//FROM Author a JOIN BookAuthor ba on a.id = ba.authorid

	public List<T> getAll(Class<T> target){
		List<T> t = getEntityManager().createQuery("SELECT u FROM " + target.getSimpleName() + " u", target).getResultList();
		// Cast vector -> array 
		ArrayList<T> l = new ArrayList<T>(t);
		return l;
	}
	
	public void delete(T t) {
		getEntityManager().remove(t);
	}
	
	public void update(T t) {
		getEntityManager().merge(t);
	}
    public void beginTransaction() {
    	getEntityManager().getTransaction().begin();
    }

    public void commitTransaction() {
    	getEntityManager().flush();
    	getEntityManager().getTransaction().commit();
    }	
    
    public EntityManager getEntityManager() {
    	return EntityManagerSingleton.getEntityManager();
    }
    
    public void rollbackTransaction() {
    	getEntityManager().getTransaction().rollback();
    }


}
