package gui;

import java.util.Arrays;

import domein.DomeinController;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class BeheersKostenScherm extends VBox {
	private DomeinController dc;
	private TextField txtkost;
	private TextArea txtInfo;

	public BeheersKostenScherm(DomeinController dc) {
		super();
		this.dc = dc;
		buildGui();
	}

	private void buildGui() {
		ComboBox<String> CboTitels = new ComboBox<>();
		Label lbluitleg = new Label("Uitleg: ");
		txtInfo = new TextArea();
		Label lblbeheerskosten = new Label("Beheerskosten");
		txtkost = new TextField();
		
		CboTitels.setItems(FXCollections.observableList(Arrays.asList(dc.geefTitelsBeheersKosten())));	
		CboTitels.setPromptText("Maak hier uw keuze");
		txtInfo.setPromptText("De info verschijnt hier nadat u uw keuze heeft gemaakt.");
		txtkost.setPromptText("De kost verschijnt hier nadat u uw keuze heeft gemaakt.");
		txtInfo.selectedTextProperty();
		CboTitels.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				
				update(CboTitels.getSelectionModel().getSelectedIndex());
			}
		});
		
		this.getChildren().addAll(CboTitels,lbluitleg,txtInfo,lblbeheerskosten,txtkost);
		
		
	}
	
	public void update(int index) {
		txtInfo.setText(dc.geefDetailsBeheerskost(index));
		txtkost.setText(String.format("De kost is €%.2f",dc.geefBeheerskostWaarde(index)));
		
	}
	
	
	
	
	

}
