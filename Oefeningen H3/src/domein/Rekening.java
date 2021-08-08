package domein;

public class Rekening {
	private long nummer;
	private double saldo;
	private String houder;
	
	public boolean stortOp(double bedrag) {
		if (bedrag>=0) {this.saldo=saldo+bedrag;
		return true;}
		else return false;
	}

	
	public boolean haalAf(double bedrag) {
		if (bedrag > saldo) {return false;}
		else {saldo = saldo-bedrag; return true;}
	}
	
	public Rekening() {
		this.nummer=000000000000000000;
		this.houder=null;
		this.saldo=0;
	}
	
	public Rekening(long nummer) {
		this.nummer=nummer;
		this.houder=null;
		this.saldo=0.00;
	}
	
	public Rekening(long nummer, String houder) {
		this.nummer=nummer;
		this.houder=houder;
		this.saldo=0.00;
	}
	
	public String getHouder() {
		return houder;
	}
	public double getSaldo() {
		return saldo;
	}
}
