package domain;

public class Complex {
	
	private double real;
	private double imaginair;
	
	public Complex() {
		real = 0.0;
		imaginair = 0.0;
	}
	
	public Complex(double real) {
		this.real=real;
		this.imaginair = 0.0;
	}
	
	public Complex(double real,double imaginair) {
		this.real=real;
		this.imaginair=imaginair;
	}
	
	public Complex telOp(Complex c2) {
		double tempReal = this.real+c2.real;
		double tempImaginair = this.imaginair + c2.imaginair;
		Complex temp = new Complex(tempReal,tempImaginair);
		return temp;
	}
	
	public Complex trekAf(Complex c2) {
		double tempReal = this.real-c2.real;
		double tempImaginair = this.imaginair - c2.imaginair;
		Complex temp = new Complex(tempReal,tempImaginair);
		return temp;
	}
	
	public String toString() {
		return "("+this.real+";"+this.imaginair+")";
	}
}
