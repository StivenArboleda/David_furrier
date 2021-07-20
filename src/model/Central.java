package model;

import java.util.ArrayList;


public class Central {
	
	//relations
	
	private ArrayList<Client> clients;
	
	public void countClients(Client c) {
		clients.add(c);
	}
	
	public Client search(ArrayList<Client> c, int id) {
		
		boolean found = false;
		
		for(int i = 0; i < c.size() && !found; i++) {
			if(c.get(i).getId() == id) {
				return c.get(i);
			}
		}
		return null;
	}
	
	public double total(Product p) {
		return p.getPays() + p.getRemainingBalance();
	}
	
	public int repairWeek(String d1, String d2, String dateLocal) {

		int count = -1;

		if(dateLocal.compareTo(d2) > 0 && dateLocal.compareTo(d1) < 0) {
			count = 0; 
			for(int i = 0; i < clients.size(); i++) {
				if(clients.get(i) != null) {
					count += clients.get(i).getRepair().size();
				}
			}
		}
		return count;
	}
	
	public double weeklyEarnings(String d1, String d2, String dateLocal) {
		
		double count = -1;

		if(dateLocal.compareTo(d2) > 0 && dateLocal.compareTo(d1) < 0) {
			count = 0;
			for(int i = 0; i < clients.size(); i++) {
				if(clients.get(i).getRepair() != null) {
					count += total(clients.get(i).getRepair().get(i));
				}
			}
		}
		return count;
	}
	
}
