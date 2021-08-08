package cui;

import java.util.Scanner;

import domain.ArrayBewerking;

public class OefeningArrayBewerking {
	
	public static void main(String[] args) {
		
	int[] rij1 = {2,7,1,9,4};
	int[] rij2 = new int[rij1.length];
	double[] rij3 = new double[rij1.length];
	invoerRij(rij2);
	ArrayBewerking ab = new ArrayBewerking();
	rij3=ab.deel(rij1, rij2);
	System.out.printf("Rij1=%s\n", ab.toonRij(rij1) );
	System.out.printf("Rij2=%s\n", ab.toonRij(rij2) );
	System.out.printf("Rij3=%s\n", ab.toonRij(rij3) );
	ab.schuifOp(rij3, 1);
	System.out.printf("Rij3 na verschuiving=%s\n", ab.toonRij(rij3) );
}

public static void invoerRij(int[]rij) {
	Scanner s = new Scanner(System.in);
	int input;
	for (int i=0; i<rij.length;i++) {
		do {System.out.printf("Geef een strikt positief getal nr %d in ",i+1);
		input = s.nextInt();}
		while (input <=0);
		rij[i] = input;
	}
}

}