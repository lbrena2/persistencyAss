package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import entities.User;
import services.UserService;

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

public class AddBestFriendAction extends ActionSupport{
	private static final long serialVersionUID = 7299264265184515893L;
	@Override
	public String execute() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String friendName = request.getParameter("friendToAdd");
		HttpSession session = request.getSession();
		if (friendName != null) {
			UserService userService = new UserService();
			User loggedUser = userService.get(Integer.parseInt((String) session.getAttribute("loginedid")));
			List<User> friendUser = userService.getBy(User.class, "name", friendName);
				if(friendUser.isEmpty()) {
					return "error";
				}
			loggedUser.setBestFriend(friendUser.get(0));
			userService.update(loggedUser);
			return "success";
		} else {
			return "error";
		}

	}

}
