package E2_W1_U1;

import java.util.Random;

public class Client {
	private int clientID;
	private Random rand = new Random();
	private int upperBound = 50;
	private String[] name_Surname;
	private String clientEmail;
	private String signInDate;

	public Client() {
		clientID = rand.nextInt(upperBound);
		name_Surname = setName_Surname();
		clientEmail = setEmail();
		signInDate = setSignIn();
	}
	
	public Client(String name, String surname, String email, String date) {
		clientID = rand.nextInt(upperBound);
		name_Surname = setName_Surname(name, surname);
		clientEmail = email;
		signInDate = date;
	}
	
	private String[] setName_Surname() {
		name_Surname = new String[2];
		System.out.println("Insert your name:");
		name_Surname[0] = myMainEx.myScan.nextLine();
		System.out.println("Insert your surname:");
		name_Surname[1] = myMainEx.myScan.nextLine();
		return name_Surname;
	}
	
	private String[] setName_Surname(String n, String s) {
		name_Surname = new String[2];
		name_Surname[0] = n;
		name_Surname[1] = s;
		return name_Surname;
	}
	
	private String setEmail() {
		System.out.println("Insert email:");
		return myMainEx.myScan.nextLine();
	}
	
	private String setSignIn() {
		System.out.println("Insert date as dd/mm/yy:");
		return myMainEx.myScan.nextLine();
	}
	
	public static void printClientData(Client c) {
		System.out.print("Client Data: ");
		System.out.print("clientID: " + c.clientID + ", ");
		System.out.print("Name: " + c.name_Surname[0] + ", ");
		System.out.print("Surname: " + c.name_Surname[1] + ", ");
		System.out.print("Email: " + c.clientEmail +", ");
		System.out.println("SignIn date: " + c.signInDate);
	}
}
