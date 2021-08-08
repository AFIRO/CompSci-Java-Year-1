package persistentie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.List;
import java.util.Scanner;

import domein.Order;

public class OrderMapper {
	private Scanner input;
	private Formatter output;
	String Writepath = "src\\resources\\korting.txt";
	String Readpath = "src\\resources\\orders.txt";
	
	public void openWrite() {
		try {
			output = new Formatter(Files.newOutputStream(Paths.get(Writepath)));
		} catch (IOException e) {
			System.err.println("Onvoldoende schrijfrechten");
			System.exit(1);
		} catch (FormatterClosedException e) {
			System.err.println("Formatter closed");
			System.exit(1);
		} catch (InvalidPathException e) {
			System.err.println("path closed");
			System.exit(1);
		}
		
		
		
	}
	
	public void openRead() {
	
			try {
				input = new Scanner(Files.newInputStream(Paths.get(Readpath)));
			} catch (IOException e) {
				System.err.println("Onvoldoende schrijfrechten");
				System.exit(1);
			} catch (IllegalStateException e) {
				System.err.println("Scanner closed");
				System.exit(1);
			} catch (InvalidPathException e) {
				System.err.println("path closed");
				System.exit(1);
			}
		
	}
	
	public void closeReadWrite() {
		if (input != null) {
			input.close();
			
		}
		
		if (output != null) {
			output.close();
			
		}
		
	
	}
	
	public List<Order> readOrders() {
		List<Order> list = new ArrayList<>();
		
		while (input.hasNext()) {
			list.add(new Order(input.next(), input.next(), input.nextInt(), input.nextDouble()));
			
		}
		
		return list;
		
	}
	
	public void writeList(List<Order> list) {
		
		for (Order order : list)
			output.format("%s %s %s %s%n", order.getNaam(), order.getProduct(), order.getAantal(), order.getPrijs());
		
		
	}

}
