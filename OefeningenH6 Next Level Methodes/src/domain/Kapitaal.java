package domain;

public class Kapitaal {
private double beginBedrag;
private double intrest;

public Kapitaal(double beginBedrag, double intrest) {
	if (beginBedrag<0) 
		throw new IllegalArgumentException("Moet minimaal 0 zijn!");
	else this.beginBedrag=beginBedrag;
	
	if (intrest<0 || intrest>100)
		throw new IllegalArgumentException("intrest moet percentage zijn");
	else this.intrest=intrest;
}

public double berekenKapitaalNaNJaar(int n) {
	if (n==0) return beginBedrag;
	else return (1+(intrest/100))* berekenKapitaalNaNJaar(n-1);
}

}
