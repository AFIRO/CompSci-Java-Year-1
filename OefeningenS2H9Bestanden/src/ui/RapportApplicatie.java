package ui;

import domein.DomeinController;
import domein.Order;
import java.util.Formatter;

import java.util.Scanner;

public class RapportApplicatie
{

 

    public static void main(String args[])
    {
    	DomeinController dc = new DomeinController();
    	System.out.println(dc.toonLijst());
    	dc.pasKortingToe();
    	dc.schrijfLijst();
    	System.out.println(dc.toonLijst());
        
    }    

  
}
