package actions;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import entities.User;

import com.opensymphony.xwork2.ActionSupport;

import services.UserService;

public class DeleteUserAction extends ActionSupport {

	private static final long serialVersionUID = 7299264265184515893L;

	private String mail;
	private String userid;

	@Override
	public String execute() {

		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		mail = (String) session.getAttribute("loginedmail");
		if (mail != null) {
			UserService userService = new UserService();
			User loggedUser = userService.get(Integer.parseInt((String) session.getAttribute("loginedid")));
			userService.delete(loggedUser);
			return "success";
		} else {
			return "error";
		}

	}

	public String getMail() {
		return mail;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}