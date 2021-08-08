package domein;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DomeinController {
	private CustomerRepository cr;
	
	public DomeinController() {
		this.cr = new CustomerRepository();
	}
	
	public String generateDailyReport() {
		
		String output = String.format("Customer-of-the-Day Report | Date of generation: %d-%d-%d%n", LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear());
		output += String.format("%s%20s%n", "Customer", "Score");
		
		List<Customer> list = new ArrayList<>();
		
		Comparator<Customer> cc = new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {

				return -1 * Integer.valueOf(o1.calculateDailyScore(LocalDate.now())).compareTo(o2.calculateDailyScore(LocalDate.now())); } };
		
		
		output +=cr.getCustomers().stream().filter(e-> e.calculateDailyScore(LocalDate.now()) > 0).
											sorted(cc).
											map(e-> String.format("%s%20d%n", e.getName(), e.calculateDailyScore(LocalDate.now()))).
											collect(Collectors.joining(""));
	
		
		return output;
		
	}
	
	public String generateMonthlyReport() {
		
		String output = String.format("Customer-of-the-Month Report | Date of generation: %d-%d-%d%n", LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear());
		output += String.format("%s%20s%n", "Customer", "Score");
		
		List<Customer> list = new ArrayList<>();
		
		
		list = cr.getCustomers().stream().filter(e-> e.calculateMonthlyScore(LocalDate.now().getMonth()) > 0).collect(Collectors.toList());
		
		Collections.sort(list, new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {

				return -1 * Integer.valueOf(o1.calculateMonthlyScore(LocalDate.now().getMonth())).compareTo(o2.calculateMonthlyScore(LocalDate.now().getMonth()));
			}
		});
		
		output += list.stream().map(e-> String.format("%s%20d%n", e.getName(), e.calculateMonthlyScore(LocalDate.now().getMonth()))).collect(Collectors.joining(""));
		
		return output;
		
	}

}
