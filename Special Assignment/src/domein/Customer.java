package domein;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Receipt> receipts;
	
	
	public Customer(String name) {
		this.name = name;
		this.receipts = new ArrayList<>();
	}
	
	public Customer(String name, List<Receipt> receipts) {
		super();
		this.name = name;
		this.receipts = receipts;
	}
	
	public String getName() {
		return name;
	}
	
	public void addReceipt(Receipt receipt) {
		if (receipt.getCustomer().equals(this.name))
			receipts.add(receipt);
	}
	
	
	public int calculateDailyScore(LocalDate today) {
		
		int score = 0;
		
		for (Receipt receipt : receipts)
			if (receipt.getDate().equals(today))
				score += receipt.getScore();
		return score;
	}
	
	public int calculateMonthlyScore(Month month) {
		int score = 0;
		
		for (Receipt receipt : receipts)
			if (receipt.getDate().getMonth().equals(month))
				score += receipt.getScore();
		
		return score;
		
	}

}
