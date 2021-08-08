package persistance;

import java.util.ArrayList;
import java.util.List;

import domein.Customer;
import domein.Product;
import domein.Receipt;

public class CustomerMapper {
	private List<Customer> list;
	
	
	public CustomerMapper() {
		List<Customer> list = new ArrayList<>();
		
		
	}
	
	
	public List<Customer> getCustomers() {
		return list;
	}

}
