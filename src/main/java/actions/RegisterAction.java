package actions;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import entities.Adress;
import entities.User;

import com.opensymphony.xwork2.ActionSupport;

import services.AdressService;
import services.UserService;

public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 7299264265184515893L;

	private String mail;
	private String name;
	private String surname;
	private String password;
	private String repeatpassword;
	private String streetAdress;
	private String city;
	private String state;

	@Override
	public String execute() {
		if (password.equals(repeatpassword)) {
			UserService us = new UserService();
			//AdressService as = new AdressService();
			/*List<User> users=us.getAll();
			int f=0;
			for(User user: users) {
				if(user.getMail().equals(mail)) {f=1;break;}
			}
			if(f==1) {return "error";}*/
			User u = new User(name, surname, mail, password, streetAdress, city, state);
			//Adress a = new Adress(streetAdress, city, state);
			//as.save(a);
			us.save(u);
			return "success";
		} else {
			return "error";
		}

	}

	public void setStreetAdress(String streetAdress) {
		this.streetAdress = streetAdress;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRepeatpassword(String repeatpassword) {
		this.repeatpassword = repeatpassword;
	}

}