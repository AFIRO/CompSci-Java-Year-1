package gui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.Arrays;

import domein.DomeinController;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;

import javafx.scene.control.ComboBox;

import javafx.scene.control.TextArea;

public class BeheersKostenSchermSceneBuilderController extends VBox {
	@FXML
	private ComboBox<String> cbotitels;
	@FXML
	private TextArea txaInfo;
	@FXML
	private TextField txfKosten;
	
	private DomeinController dc;
	
	public BeheersKostenSchermSceneBuilderController(DomeinController dc) {
		this.dc = dc;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("BeheersKostenSchermSceneBuilder.fxml"));
		loader.setController(this);
		loader.setRoot(this);
		
		try {
			loader.load();
		} catch (IOException e) {
			throw new RuntimeException(e);
			
		}
		cbotitels.setItems(FXCollections.observableList(Arrays.asList(dc.geefTitelsBeheersKosten())));
		
	}
	
	


	// Event Listener on ComboBox[#cbotitels].onAction
	@FXML
	public  void infoUpdate(ActionEvent event) {
		
		txaInfo.setText(dc.geefDetailsBeheerskost(cbotitels.getSelectionModel().getSelectedIndex()));
		txfKosten.setText(String.format("De Kost is €%.2f.", dc.geefBeheerskostWaarde(cbotitels.getSelectionModel().getSelectedIndex())));
	}
}
