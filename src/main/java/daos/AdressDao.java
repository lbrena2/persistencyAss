package daos;

import java.util.ArrayList;
import java.util.List;

import entities.Adress;
import entities.User;

public class AdressDao extends AbstractDao<Adress>{
	@Override
	public void save(Adress adress) {
		//Not working, eclipse link manage automaticly this part.
		List<Adress> adresses = this.getAll(Adress.class);
		for (Adress a : adresses) {
			if(a.getStreetAdress().equals(adress.getStreetAdress())) {
				return;
			}
		}
		super.save(adress);
	}
	
	@Override
	public Adress get(Class<Adress> adressClass, int id) {
		return super.get(adressClass, id);
	}
	
	@Override
	public List<Adress> getAll(Class<Adress> target){
		return super.getAll(target);
	}
	
	@Override
	public void delete(Adress adress) {
		super.delete(adress);
	}
	
	@Override
	public void update(Adress adress) {
		super.update(adress);
	}
}
