package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HotelFacility {
	@Id
	private int id;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
