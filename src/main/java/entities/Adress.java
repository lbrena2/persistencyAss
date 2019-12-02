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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Adress")
public class Adress implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="streetAdress")
	private String streetAdress;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	
	public Adress() {
		super();
	}
	
	public Adress(String streetAdress, String city, String state) {
		this.streetAdress = streetAdress;
		this.city = city;
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public String getStreetAdress() {
		return streetAdress;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Adress [id=" + id + ", streetAdress=" + streetAdress + ", city=" + city + ", state=" + state + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + id;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((streetAdress == null) ? 0 : streetAdress.hashCode());
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
		Adress other = (Adress) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (streetAdress == null) {
			if (other.streetAdress != null)
				return false;
		} else if (!streetAdress.equals(other.streetAdress))
			return false;
		return true;
	}
	
	
}