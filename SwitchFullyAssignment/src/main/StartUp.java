package main;

import domein.DomeinController;

public class StartUp {

	public static void main(String[] args) {
		DomeinController dc = new DomeinController();
		
		System.out.println(dc.generateDailyReport());
		System.out.println(dc.generateMonthlyReport());

	}

}
