module FXvoorbeeld1 {
	exports gui;
	exports main;

	requires javafx.base;
	requires javafx.graphics;
	requires javafx.controls;
	requires java.desktop;
	
	opens gui to javafx.graphics;
}