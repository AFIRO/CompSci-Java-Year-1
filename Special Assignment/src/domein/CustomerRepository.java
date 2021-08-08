package domein;

import java.util.List;

import persistance.CustomerMapper;



public class CustomerRepository {
	private List<Customer> customers;
	private CustomerMapper cm;
	
	public CustomerRepository() {
		cm = new CustomerMapper();
		customers = cm.getCustomers();
	}
	
	
	public List<Customer> getCustomers() {
		return customers;
		
	}
	
	

}
