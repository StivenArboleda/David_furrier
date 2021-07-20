package model;

import java.util.ArrayList;

public class Client{
	
	private String name;
	private String lastname;
	private int id;
	private String phone;
	
	//relations
	
	private ArrayList<Product> repair;
	
	//contructor
	
	public Client(String name, String lastname, int id, String phone, ArrayList<Product> repair) {
		this.name = name;
		this.lastname = lastname;
		this.id = id;
		this.phone = phone;
		repair = new ArrayList<Product>();
	}

	public void countRepair(Product p) {
		repair.add(p);
	}
	
	public ArrayList<Product> getRepair() {
		return repair;
	}

	public void setRepair(ArrayList<Product> repair) {
		this.repair = repair;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public int compareById(Client c) {
		int i = 0;
		if (this.id > c.id) {
			i = 1;
		} else if (this.id < c.id) {
			i = -1;
		}
		return i;
	}
	
}
