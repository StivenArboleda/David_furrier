package model;

import java.util.ArrayList;

import CustomExceptions.AlreadyAddedNumberException;


public class Central {
	
	//relations
	
	private ArrayList<Client> clients;
	
	
	public void addClients(String name, String lastName, String number) throws AlreadyAddedNumberException{
		findClient(number);
		Client c = new Client (name, lastName, number);
		clients.add(c);
	}
	
	private void findClient(String number) throws AlreadyAddedNumberException{
		boolean found = false; 
		for (int i = 0; i < clients.size() && !found; i++) {
			if(clients.get(i).getPhone() == number) {
				found = true;
				throw new AlreadyAddedNumberException(number, clients.get(i).getName(), clients.get(i).getLastname());
			}
		}
	}
	public Client search(String number) {
		
		boolean found = false;
		
		for(int i = 0; i < clients.size() && !found; i++) {
			if(clients.get(i).getPhone().equals(number)) {
				return clients.get(i);
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
