package gui;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.stage.Stage;


public class VolgendScherm extends HBox {
	
	private String loginnaam;
	private WelkomScherm welkomScherm;
	
	public  VolgendScherm(String username, WelkomScherm welkomScherm) {
		
		this.loginnaam = username;
		this.welkomScherm = welkomScherm;
		buildGui();
		
	}
	
	
	
	public void buildGui() {
	
	Label welkomstLabel = new Label("Welkom " + loginnaam);
	Button terugButton = new Button("Terug");
	Region springRegion = new Region();
	HBox.setHgrow(springRegion, Priority.ALWAYS);
	this.getChildren().addAll(welkomstLabel, springRegion,terugButton);
	
	terugButton.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent arg0) {
			Stage stage = (Stage)(getScene().getWindow());
			stage.setScene(welkomScherm.getScene());
			
		}
	});
	
	}

}
