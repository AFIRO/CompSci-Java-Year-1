package application;
	
import domein.DomeinController;
import gui.VoorwerpScherm;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		DomeinController dc = new DomeinController();
		
		try {
			VoorwerpScherm root = new VoorwerpScherm(dc);
			Scene scene = new Scene(root,400,250);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
