package cui;
import java.util.Scanner;
import java.security.SecureRandom;

public class OefeningZoekVerwijderArray {

	public static void main(String[] args) {
	    SecureRandom r = new SecureRandom();
		int[] array = new int[10];
		for (int i=0; i<array.length;i++) {
			array[i]= 0 + r.nextInt(20);
			System.out.printf("%d ",array[i]);}
		Scanner S = new Scanner(System.in);
		System.out.printf("\nGeef te verwijderen getal: ");
		int teZoekenGetal = S.nextInt();
		verwijder(teZoekenGetal,array);
		
		for (int i=0; i<array.length;i++) {
			System.out.printf("%d ",array[i]);}
		
 		
}
	

	
private static void verwijder(int teZoekenGetal, int[] array) {
	int counter=0;    
		for (int i = 0; i <array.length-1;i++) {
			while (array[i]==teZoekenGetal) {
				array[i]=array[i+1];
				array[i+1]=teZoekenGetal;}
			}
		}}
			     
			
    
	//for (int x= array.length-counter; x<array.length;x++) {
	//	 array[x] = 0;}
	 //   	}
	    
	



	




	
	
	

