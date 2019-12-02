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

public class MainPageAction extends ActionSupport {

	private static final long serialVersionUID = 7299264265184515893L;

	private String mail;

	@Override
	public String execute() {

		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		mail=(String) session.getAttribute("loginedmail");
	    if (mail!=null) {
			return "success";
		} else {
			return "error";
		}

	}

	public String getMail() {
		return mail;
	}

}