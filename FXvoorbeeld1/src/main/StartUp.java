package main;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import gui.WelkomScherm;


public class StartUp extends Application implements EventHandler<ActionEvent> {
	
	Stage window;

	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) {
		
		window = primaryStage;
		window.setTitle("Scene shift programma");
		
		Pane layout1 = new Pane();
		VBox layout2 = new VBox();
		
		Button button1 = new Button("Click here for scene 2");
		Button button2 = new Button("Scene 2 sucks, back to scene 1");
		
		ImageView bugImageView = new ImageView(new Image(getClass().getResourceAsStream("/images/bug.png")));
		
		layout1.getChildren().add(button1);
		layout2.getChildren().addAll(button2, bugImageView);
		
	
		
		Scene scene1 = new Scene(layout1,200,300);
		Scene scene2 = new Scene(layout2, 500,500);
		
		button1.setOnAction(l -> window.setScene(scene2));
		button2.setOnAction(l -> window.setScene(scene1));
		
		window.setScene(scene1);
		window.show();
		
		
		
		
	}
	

}
