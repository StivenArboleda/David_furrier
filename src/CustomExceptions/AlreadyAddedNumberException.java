package CustomExceptions;

@SuppressWarnings("serial")
public class AlreadyAddedNumberException extends Exception {
	
	private String number;
	private String name;
	private String lastName;

	public String getNUmber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public AlreadyAddedNumberException(String number, String name, String lastName) {
		super("El número de teléfono " + number + " ya se encuentra asociado con la persona " + name +" " + lastName + ".");
		setNumber(number);
		setLastName(lastName);
		setName(name);
	}


}