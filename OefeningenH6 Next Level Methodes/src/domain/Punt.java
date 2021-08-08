package domain;

public class Punt {
	private int xCoord,yCoord;
	
	public Punt(int xCoord, int yCoord) {
		this.setxCoord(xCoord);
		this.setyCoord(yCoord);
	}
	
	public Punt() {
	   this.setxCoord(1);
	   this.setyCoord(1);
	}

	
	
	public int getxCoord() {
		return xCoord;
	}
	
	public int getyCoord() {
		return yCoord;
	}
	
	private void setyCoord(int yCoord) {
		this.controleerCoord('y', yCoord);
		this.yCoord = yCoord;
	}
	
	private void setxCoord(int xCoord) {
		this.controleerCoord('x', xCoord);
		this.xCoord = xCoord;
	}
	
	
	
	private void controleerCoord(char xOfy, int coord) {
		String error = String.format("De ingegeven coordinaat %c moet hoger zijn dan 0.", xOfy);
		if (coord<=0) {throw new IllegalArgumentException(error);}
		
	}
	
	public String toString() {
		return String.format("(%d,%d)", this.getxCoord(), this.getyCoord());
	}
 	
}
