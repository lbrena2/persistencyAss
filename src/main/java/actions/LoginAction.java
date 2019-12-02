package actions;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import entities.User;

import com.opensymphony.xwork2.ActionSupport;

import services.UserService;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 7299264265184515893L;

	private String mail;
	private String password;

	@Override
	public String execute() {

		HttpServletRequest request = ServletActionContext.getRequest();

		UserService us = new UserService();
		List<User> userList = us.getAll();
		ArrayList<String> mailList = new ArrayList<String>();
		for (User tempUser : userList) {
			mailList.add(tempUser.getMail());
		}
		if (mailList.indexOf(mail) != -1) {

			String pswd = userList.get(mailList.indexOf(mail)).getPassword();
			if (password.equals(pswd)) {
				HttpSession session = request.getSession();
				session.setAttribute("loginedmail", mail);
				session.setAttribute("loginedid", Integer.toString(userList.get(mailList.indexOf(mail)).getId()));
				return "success";
			} else {
				return "error";
			}

		} else {
			return "error";
		}
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}