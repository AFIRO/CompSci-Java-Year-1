module FXRodeDraadDeel1Startversie {
	exports persistentie;
	exports application;
	exports gui;
	exports main;
	exports domein;

	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens gui;
}