package domein;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Receipt {
	private List<Product> products;
	private String customer;
	private int score;
	private final LocalDate date;
	
	public Receipt(Collection<Product> products) {
		this.customer = "";
		this.products = (List<Product>) products;
		this.date = LocalDate.now();
		this.score = 0;
	}
	
	public Receipt(Collection<Product> products, String customer) {
		super();
		this.products = new ArrayList<>();
		this.customer = customer;
		this.date = LocalDate.now();
		calculateScore();
	}
	
	public String getCustomer() {
		return customer;
	}
	
	public void addProduct(Product product) {
		this.products.add(product);
	}
	
	
	public int getScore() {
		return score;
	}
	
	private void calculateScore() {
		int interim = 0;
		
		if (customer.contains("Jane Janukova"))
			interim += 10;
		
		if (products.size() > 10 && products.size() <=20)
			interim += 5;
		
		if (products.size() > 20 && products.size() <=30)
			interim += 7;
		
		if (products.size() > 30)
			interim += 9;
		
		for (Product product : products)
			if (product.getName().contains("Smartphone X"))
				interim += 5;
		
		this.score = interim;
		
	}
	
	public LocalDate getDate() {
		return date;
	}

}
