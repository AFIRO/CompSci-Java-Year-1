package main;

import domein.DomeinController;
import ui.BeheersKostenApplicatie;
import ui.RekeningApplicatie;

public class StartUp
{

    public static void main(String[] args)
    {
        new BeheersKostenApplicatie(new DomeinController());
        
    }
}
