package application;
	
import gui.WelkomScherm;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
	
			WelkomScherm root = new WelkomScherm();
			Scene scene = new Scene(root,300,150);
			
			
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Welkom bij Java FX!");
			primaryStage.show();
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
