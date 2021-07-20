package model;

public class Product {
	
	private String name;
	private String description;
	private double pays;
	private double remainingBalance;
	private int consecutive;
	private boolean delivered;
	//dates
	private String first; //arrival date 
	private String second; //delivery date

	public Product(String name, double pays, double remainingBalance, String description, String first, String second, int consecutive) {
		this.name = name;
		this.pays = pays;
		this.remainingBalance = remainingBalance;
		this.description = description;
		this.first = first;
		this.second = second;
		this.consecutive = consecutive;
	}
	
	

	public int getConsecutive() {
		return consecutive;
	}

	public void setConsecutive(int consecutive) {
		this.consecutive = consecutive;
	}

	public boolean isDelivered() {
		return delivered;
	}

	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPays() {
		return pays;
	}

	public void setPays(double pays) {
		this.pays = pays;
	}

	public double getRemainingBalance() {
		return remainingBalance;
	}

	public void setRemainingBalance(double remainingBalance) {
		this.remainingBalance = remainingBalance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
}
