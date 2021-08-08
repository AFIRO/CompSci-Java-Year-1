package domein;



import java.util.Scanner;

import Exceptions.NegativeNumberException;

public class ConsoleApplicatie {
	
	public ConsoleApplicatie() {
		boolean repeatflag  = true;
		do {
			try {
				System.out.println("Geef positief geheel getal: ");
				Scanner s = new Scanner(System.in);
				String input = s.next();
				System.out.println(new MijnGetal(Integer.valueOf(input).intValue()).geefVierkantswortel());
				repeatflag = false;
			} catch (NumberFormatException e) {
				System.out.println("Geheel getal loser");
			} catch (NegativeNumberException exception) {
				System.out.println("Getal moet positief zijn");
			}
		} while (repeatflag);
	
		
		
	}

}
