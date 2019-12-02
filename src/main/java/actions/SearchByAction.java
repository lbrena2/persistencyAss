package actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import entities.User;
import services.UserService;

public class SearchByAction extends ActionSupport{
	private static final long serialVersionUID = 7299264265184515893L;
	private String nameValue, addressValue, bestFriendValue;
	
	@Override
	public String execute() {

		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		this.nameValue = request.getParameter("searchByName");
		this.addressValue = request.getParameter("searchByAddress");
		this.bestFriendValue = request.getParameter("searchByBestFriend");
		if(this.nameValue != null) {
			UserService userService = new UserService();
			List<User> u = userService.getBy(User.class, "name", nameValue);
			if(u != null) {
				session.setAttribute("foundUser", u.get(0));
				System.out.print(u.get(0).toString());
				return "success";
			}
			else 
				return "error";
		}
		if(this.addressValue != null) {
			UserService userService = new UserService();
			List<User> u = userService.getBy(User.class, "adress", addressValue);
			if(u != null) {
				session.setAttribute("foundUser", u.get(0));
				System.out.print(u.get(0).toString());
				return "success";
			}	
			else 
				return "error";
		}
		if(this.bestFriendValue != null) {
			UserService userService = new UserService();
			List<User> u = userService.getBy(User.class, "name", bestFriendValue);
			if(u != null) {
				session.setAttribute("foundUser", u.get(0));
				System.out.print(u.get(0).toString());
				return "success";
			}	
			else 
				return "error";
		}
		return "error";

	}

	public void setNameValue(String nameValue) {
		this.nameValue = nameValue;
	}

	public void setAddressValue(String addressValue) {
		this.addressValue = addressValue;
	}

	public void setBestFriendValue(String bestFriendValue) {
		this.bestFriendValue = bestFriendValue;
	}
}
