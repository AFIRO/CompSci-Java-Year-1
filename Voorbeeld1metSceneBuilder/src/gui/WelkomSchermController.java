package gui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class WelkomSchermController extends Pane {
	
	@FXML
	private Label titel;
	@FXML
	private Button knop;

	// Event Listener on Button[#knop].onAction


	public WelkomSchermController() {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("WelkomScherm.fxml"));
		loader.setController(this);
		loader.setRoot(this);
		
		try {
			loader.load();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@FXML
	public void wijzigTitel(ActionEvent event) {
		titel.setText("Nieuwe titel");
	}

	

}
