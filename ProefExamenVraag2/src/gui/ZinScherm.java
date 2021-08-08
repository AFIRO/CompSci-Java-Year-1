package gui;

import java.util.List;
import java.util.stream.Collectors;

import domein.EenvoudigeZin;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ZinScherm extends VBox implements EventHandler<ActionEvent>{
	private EenvoudigeZin ez;
	
	public ZinScherm() {
		buildGui();
	}

	private void buildGui() {
		Label lblGeefZin = new Label("Geef een zin:");
		TextField txfGeefZin = new TextField();
		Label lblGeefLetters = new Label("Geef het aantal letters:");
		TextField txfGeefLetters = new TextField();
		Button btnZoekWoorden = new Button("Zoek woorden");
		Label lblGevonden = new Label("De gevonden woorden zijn:");
		TextArea txaGevonden = new TextArea();
		Label lblError = new Label();
		lblError.setVisible(false);
		
		this.getChildren().addAll(lblGeefZin,txfGeefZin,lblGeefLetters,txfGeefLetters,btnZoekWoorden,lblGevonden,txaGevonden,lblError);
		
		btnZoekWoorden.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				try {
					ez = new EenvoudigeZin(txfGeefZin.getText());
					List<String> output = ez.geefWoordenMetAantalLetters(Integer.parseInt(txfGeefLetters.getText()));
					txaGevonden.setText(output.stream().sorted().map((e)-> String.format("%s%n", e)).collect(Collectors.joining("")));
				} catch (IllegalArgumentException e) {
				lblError.setText(e.getLocalizedMessage());
				lblError.setVisible(true);
				txfGeefZin.setText("");
				txfGeefLetters.setText("");
				txfGeefZin.requestFocus();
				}
				
			}
		});

}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
