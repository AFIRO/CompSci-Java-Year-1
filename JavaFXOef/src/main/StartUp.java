package main;
	
import gui.WelkomScherm;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;



public class StartUp extends Application {

	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		WelkomScherm rootScherm = new WelkomScherm();
		Scene scene = new Scene(rootScherm,500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
