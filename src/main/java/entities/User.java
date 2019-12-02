package entities;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User implements Serializable {
	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="surname")
	private String surname;
	@Column(name="mail", unique = true)
	private String mail;
	@Column(name="password")
	private String password;
	@JoinColumn(name="bestFriend")
	@OneToOne()
	private User bestFriend;
	@JoinColumn(name="adress")
	@ManyToOne(optional=false, cascade = CascadeType.PERSIST)
	private Adress adress;
	
	/*@JoinTable(name = "friend_of", schema = "maven", joinColumns = {
			 @JoinColumn(name = "friend1", nullable = false)},inverseJoinColumns = {
			 @JoinColumn(name = "friend2", nullable = false)})
	@ManyToMany(cascade = CascadeType.PERSIST)
	private Set<User> myFriends;
	
	
	@JoinTable(name = "User_group", schema = "maven", joinColumns = {
			 @JoinColumn(name = "user_id", nullable = false)}, inverseJoinColumns = {
			 @JoinColumn(name = "group_id", nullable = false)})
	@ManyToMany(cascade = CascadeType.PERSIST)
	private Set<Group> joinedGroups;
	
	
	 @OneToMany(
		        mappedBy = "author",
		        cascade = CascadeType.ALL,
		        orphanRemoval = true
		    )
		   
	private Set<Status> status;*/
	
	
	public User(){
		super();
	}
	
	public User(String name, String surname, String mail, String password, String streetAdress, String city, String state) {
		this.name = name;
		this.surname = surname;
		this.mail = mail;
		this.password = password;
		this.adress = new Adress(streetAdress, city, state);
		this.bestFriend = null;
		//this.myFriends = new HashSet<User>();
		//this.joinedGroups = new HashSet<Group>();
		//this.status = new HashSet<Status>();
	}	
	
	public User getBestFriend() {
		return bestFriend;
	}

	public void setBestFriend(User bestFriend) {
		this.bestFriend = bestFriend;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", surname=" + surname + ", mail=" + mail + ", password="
				+ password + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + ((bestFriend == null) ? 0 : bestFriend.hashCode());
		result = prime * result + id;
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (bestFriend == null) {
			if (other.bestFriend != null)
				return false;
		} else if (!bestFriend.equals(other.bestFriend))
			return false;
		if (id != other.id)
			return false;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}


	

	/*public Set<User> getMyFriends() {
		return myFriends;
	}

	public void setMyFriends(Set<User> myFriends) {
		this.myFriends = myFriends;
	}

	public Set<Group> getJoinedGroups() {
		return joinedGroups;
	}

	public void setJoinedGroups(Set<Group> joinedGroups) {
		this.joinedGroups = joinedGroups;
	}

	public Set<Status> getStatus() {
		return status;
	}

	public void setStatus(Set<Status> status) {
		this.status = status;
	}
	
	
	public void addFriend(User u1) {
		myFriends.add(u1);
		u1.getMyFriends().add(this);

	}
	
	public void deleteFriend(User u1) {
		myFriends.remove(u1);
		u1.getMyFriends().remove(this);
	}
	
	public void addGroup(Group g1) {
		joinedGroups.add(g1);
	}
	
	public void addStatus(Status s1) {
		status.add(s1);
		s1.setAuthor(this);
	}*/
}
