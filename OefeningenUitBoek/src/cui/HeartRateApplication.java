package cui;

import java.util.Scanner;

public class HeartRateApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your first name? ");
		String firstName = scanner.next();
		
		System.out.println("What is your last name? ");
		String lastName = scanner.next();
		
		System.out.println("What is your day of birth? ");
		int dayOfBirth = scanner.nextInt();
		
		System.out.println("What is your month of birth? ");
		int monthOfBirth = scanner.nextInt();
		
		System.out.println("What is your year of birth? ");
		int yearOfBirth = scanner.nextInt();
		scanner.close();
		
		HeartRate hr = new HeartRate(firstName, lastName, dayOfBirth, monthOfBirth, yearOfBirth);
		hr.giveOverview();



	}

}
