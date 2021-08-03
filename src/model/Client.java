package model;

import java.util.ArrayList;

public class Client{
	
	private String name;
	private String lastname;
	private String phone;
	
	//relations
	
	private ArrayList<Product> repairs;
	
	//contructor
	
	public Client(String name, String lastname, String phone) {
		this.name = name;
		this.lastname = lastname;
		this.phone = phone;
		repairs = new ArrayList<Product>();
	}

	public void countRepair(Product p) {
		repairs.add(p);
	}
	
	public ArrayList<Product> getRepair() {
		return repairs;
	}

	public void setRepair(ArrayList<Product> repairs) {
		this.repairs = repairs;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void addProduct(Product p) {
		repairs.add(p);
	}
	
}
