package services;

import java.util.List;

import daos.AdressDao;
import entities.Adress;
import entities.User;

public class AdressService {
	AdressDao adressDao;
	
	public AdressService() {
		adressDao = new AdressDao();
	}

	public void save(Adress adress) {
		adressDao.beginTransaction();
		adressDao.save(adress);
		adressDao.commitTransaction();

	}

	public Adress get(int id) {
		adressDao.beginTransaction();
		Adress a = adressDao.get(Adress.class, id);
		adressDao.commitTransaction();
		return a;
	}


	public void delete(Adress adress) {
        adressDao.beginTransaction();
        adressDao.delete(adress);
        adressDao.commitTransaction();

	}

	public void update(Adress adress) {
		adressDao.beginTransaction();
		adressDao.update(adress);
		adressDao.commitTransaction();
	}

}
