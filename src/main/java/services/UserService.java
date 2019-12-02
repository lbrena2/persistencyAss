package services;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import daos.UserDao;
import entities.User;

public class UserService {
	UserDao userdao;

	public UserService() {
		userdao = new UserDao();
	}

	public void save(User user) {
		userdao.beginTransaction();
		userdao.save(user);
		userdao.commitTransaction();

	}

	public User get(int id) {
		userdao.beginTransaction();
		User u = userdao.get(User.class, id);
		userdao.commitTransaction();
		return u;
	}

	public List<User> getAll() {
		userdao.beginTransaction();
		List<User> u = userdao.getAll(User.class);
		userdao.commitTransaction();
		return u;
	}
	
	public List<User> getBy(Class<User> target, String field, String value) {
		userdao.beginTransaction();
		List<User> u = userdao.getBy(target, field, value);
		userdao.commitTransaction();
		return u;
	}
	


	public void delete(User user) {
		userdao.beginTransaction();
		userdao.delete(user);
		userdao.commitTransaction();
	}

	public void update(User user) {
		userdao.beginTransaction();
		userdao.update(user);
		userdao.commitTransaction();
	}

}