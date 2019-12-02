package daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import entities.User;

import java.util.*;
import java.util.function.Consumer;


public class UserDao extends AbstractDao<User>{	
	
	@Override
	public void save(User user) {
		super.save(user);
	}
	
	@Override
	public User get(Class<User> userClass, int id) {
		return super.get(userClass, id);
	}
	
	@Override
	public List<User> getAll(Class<User> target){
		return super.getAll(target);
	}
	
	@Override
	public void delete(User user) {	
		super.delete(user);
	}
	
	@Override
	public void update(User user) {
		super.update(user);
	}

	@Override 
	public List<User> getBy(Class<User> target, String field, String value ){
		return super.getBy(target, field, value);
	}
	
}
