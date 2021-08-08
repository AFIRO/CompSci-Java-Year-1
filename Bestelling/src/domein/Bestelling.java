package domein;

import exceptions.TeGroteBestellingException;

public class Bestelling {
	private int printers, laptops, scanners;

	public Bestelling(int printers, int laptops, int scanners) {
		try {
			if (printers + laptops + scanners > 8)
				throw new TeGroteBestellingException("Een bestelling mag maar maximaal 8 producten bevatten");
			if (printers + laptops + scanners == 0)
				throw new IllegalArgumentException("Een bestelling mag niet leeg zijn");
			setPrinters(printers);
			setLaptops(laptops);
			setScanners(scanners);
			
		} catch (TeGroteBestellingException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	public int getPrinters() {
		return printers;
	}

	public int getLaptops() {
		return laptops;
	}

	public int getScanners() {
		return scanners;
	}

	private void setPrinters(int printers) {
		try {
			if (printers > 4)
				throw new TeGroteBestellingException("Maximaal 4 printers!");
			
			this.printers = printers;
		} catch (TeGroteBestellingException e) {
			System.out.println(e.getMessage());
		}
	}

	private void setLaptops(int laptops) {
		try {
			if (laptops>2)
				throw new TeGroteBestellingException("Maximaal 2 printers!");
			
			this.laptops = laptops;
		} catch (TeGroteBestellingException e) {
			System.out.println(e.getMessage());
		}
	}

	private void setScanners(int scanners) {
		try {
			if (scanners >3)
				throw new TeGroteBestellingException("Maximaal 3 scanners!");
			this.scanners = scanners;
		} catch (TeGroteBestellingException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Override
	public String toString() {
		return String.format("Bestelling met %d producten: %d printers, %d laptops en %d scanners", printers+laptops+scanners, printers, laptops, scanners);
	}

}
