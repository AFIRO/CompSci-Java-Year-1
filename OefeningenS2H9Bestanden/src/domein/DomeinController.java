package domein;

import java.util.List;
import java.util.stream.Collectors;


public class DomeinController {
	private OrderRepository or;
	private List<Order> orderlijst;

	public DomeinController() {
		super();
		this.or = new OrderRepository();
		orderlijst = or.getLijst();
		
	}
	
	public String toonLijst() {
		String output = "Klant Product Aantal Prijs\n";
		
		for (Order order: orderlijst)
			
			output += String.format("%s %s %d %.2f%n", order.getNaam(), order.getProduct(), order.getAantal(), order.getPrijs());
		
		return output;
		
	}
	
	public void pasKortingToe() {
		orderlijst = orderlijst.stream().filter((e)-> e.getAantal()>10).collect(Collectors.toList());
		orderlijst.stream().forEach((e)-> e.setPrijs(0.95*e.getPrijs()));
		
		
		
	}
	
	public void schrijfLijst() {
		or.writeList(orderlijst);
		
	}
	

}
