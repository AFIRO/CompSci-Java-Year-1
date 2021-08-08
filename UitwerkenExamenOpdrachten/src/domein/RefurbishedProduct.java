package domein;

public class RefurbishedProduct extends Product {
	
	private int extraKorting;

	public RefurbishedProduct(String soort, double adviesprijs, int extraKorting) {
		super(soort, adviesprijs);
		this.setExtraKorting(extraKorting);
	}
	
	public int getExtraKorting() {
		return extraKorting;
	}
	
	public void setExtraKorting(int extraKorting) {
		int checkKorting;
		if (this.getAdviesprijs() >=1000) {checkKorting = 20;}
		if (this.getAdviesprijs() >=500 && this.getAdviesprijs() < 1000) {checkKorting = 10;}
		else {checkKorting = 5;}
		if (checkKorting == extraKorting) {this.extraKorting=extraKorting;}
		else {throw new IllegalArgumentException();}
		}
	public double bepaalKostprijs() {
		if (extraKorting ==20) { return super.getAdviesprijs() * 0.8;}
		if (extraKorting ==10) { return super.getAdviesprijs() * 0.9;}
		else return super.getAdviesprijs() * 0.95;
	
	}
	
	public String toString() {
		return String.format("%s kost in de winkel %d euro in plaats van %d", super.getClass().getSimpleName(), this.bepaalKostprijs(), super.getAdviesprijs());
	}

}
