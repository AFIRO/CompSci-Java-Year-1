package StartUp;

import domein.DomeinController;
import ui.CryptografieApplicatie;

public class main {

	public static void main(String[] args) {
		new CryptografieApplicatie(new DomeinController()).start();

	}

}
