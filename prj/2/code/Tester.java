import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Tester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstName;
		String lastName;
		String name;
		String email;
		InsertPerson person = new InsertPerson();
		InsertAppointment appointment = new InsertAppointment();
		PersonInfo myPerson = new PersonInfo();
		String extraInfo;
		
		System.out.println("WELCOME TO EMILY'S SALON!");
		System.out.println();
		System.out.println("Are you a new customer? (yes or no)" 
				+ "\nIf you are the manager type \"manager\"");
		String response = input.next();
		if(response.equalsIgnoreCase("yes")) {
			System.out.println("What is your name (first and last)");
			name = input.next();
			name += input.nextLine();
			myPerson.setName(name);
			
			System.out.println("What is your email address?");
			email = input.next();
			myPerson.setEmail(email);
			
			//call class InsertPerson
			//person.insertIntoPerson("John Smith", "john@gmail.com");
			person.insertIntoPerson(name, email);			
		 
			System.out.println("What day would you like to make your appointment? (MM-dd-yyyy)");
			String date = input.next();
			SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
			Date date2 = null;
			try {
			    date2 = dateFormat.parse(date);
			} catch (ParseException e) {  
			    e.printStackTrace();
			}
			myPerson.setDate(date2);
			
			System.out.println("What time would you like your appointment to be? (HH MM)");
			int hours = input.nextInt();
			int min = input.nextInt();
			date2.setHours(hours);
			date2.setMinutes(min);
			
			System.out.println("Please enter any extra comments or info about your appointment");
			extraInfo = input.next();
			extraInfo += input.nextLine();
			
			//call class InsertAppointment
			appointment.insertAppointment(email, date2, extraInfo);
			
			System.out.println("Thank you " + myPerson.getName() + 
					" your appointment has been booked! We will see you on " + myPerson.getDate());
		}
		
		//for an existing customer
		else if(response.equalsIgnoreCase("no")) {
			System.out.println("What is your email address");
			email = input.next();
			myPerson.setEmail(email);
			
			System.out.println("What would you like to do?\nEnter 1 to schedule a new appointment\n"
					+ "Enter 2 to view/edit/delete any upcoming appointments\n"
					+ "Enter 3 to edit/delete your profile.");
			int whatToDo = input.nextInt();
			
			//schedule a new appointment
			if(whatToDo == 1) {	
				System.out.println("What day would you like to make your appointment? (MM-dd-yyyy)");
				String date = input.next();
				SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
				Date date2 = null;
				try {
				    date2 = dateFormat.parse(date);
				} catch (ParseException e) {  
				    e.printStackTrace();
				}
				myPerson.setDate(date2);
				
				System.out.println("What time would you like your appointment to be? (HH MM)");
				int hours = input.nextInt();
				int min = input.nextInt();
				date2.setHours(hours);
				date2.setMinutes(min);
				
				System.out.println("Please enter any extra comments or info about your appointment");
				extraInfo = input.nextLine();
				
				//call class InsertAppointment
				appointment.insertAppointment(email, date2, extraInfo);
				
				System.out.println("Thank you " + myPerson.getName() + " your appointment has been booked! We will see you on " + 
						myPerson.getDate());
			}
			//edit/delete an appointment
			else if(whatToDo == 2) {
				SelectPerson selectPerson = new SelectPerson();
				selectPerson.selectPersonInfo(email);
				
				SelectAppointment selectAppointment = new SelectAppointment();
				selectAppointment.selectAppointment(email);
				
				System.out.println("Enter 1 if you would like to edit this appointment\n"
						+ "Enter 2 if you would like to delete this appointment\n"
						+ "Enter 3 if you are done.");
				int changeAppointment = input.nextInt();
				
				//edit appointment
				if(changeAppointment == 1) {
					System.out.println("What day would you like to make your appointment? (MM-dd-yyyy)");
					String date = input.next();
					SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
					Date date2 = null;
					try {
					    date2 = dateFormat.parse(date);
					} catch (ParseException e) {  
					    e.printStackTrace();
					}
					myPerson.setDate(date2);
					
					System.out.println("What time would you like your appointment to be? (HH MM)");
					int hours = input.nextInt();
					int min = input.nextInt();
					date2.setHours(hours);
					date2.setMinutes(min);
					
					System.out.println("Please enter any extra comments or info about your appointment");
					extraInfo = input.next();
					extraInfo += input.nextLine();
					
					//call class UpdateAppointment
					UpdateAppointment updateAppointment= new UpdateAppointment();
					updateAppointment.updateAppointment(email, date2, extraInfo);
					
					System.out.println("Thank you! Your appointment has been changed! We will see you on " + 
							myPerson.getDate());
				}
				
				//delete appointment
				else if(changeAppointment == 2) {
					DeleteAppointment delete = new DeleteAppointment();
					delete.deleteAppointment(email);
					System.out.println("Your appointment has been deleted.");
				}
			}
			
			//edit profile
			else if(whatToDo == 3) {
				System.out.println("Enter 1 to edit your profile\n"
						+ "Enter 2 to delete your profile");
				int edit_delete = input.nextInt();
				
				//edit profile
				if(edit_delete == 1) {
					System.out.println("Enter your name.");
					name = input.next();
					name += input.nextLine();
					
					UpdatePerson updatePerson = new UpdatePerson();
					updatePerson.updatePersonInfo(name, email);
					
					System.out.println("Thank you " + name + " your profile has been updated.");
				}
				
				//delete profile
				else if(edit_delete == 2) {
					DeletePerson deletePerson = new DeletePerson();
					deletePerson.deletePersonInfo(email);
					System.out.println("Your profile has been deleted.");
				}
				
			}
			
		}
		else if(response.equalsIgnoreCase("manager")){
			System.out.println();
			ListAll list = new ListAll();
			list.listAll();
		}
	}
}
