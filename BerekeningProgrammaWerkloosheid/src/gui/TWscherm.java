package gui;

import domain.TijdelijkeWerkloosheid;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.effect.Effect;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.text.Font;
import javafx.util.converter.NumberStringConverter;


public class TWscherm extends GridPane implements EventHandler<ActionEvent>{
	

	TijdelijkeWerkloosheid tw;
	
	public TWscherm() {
		buildGui();
	}

	private void buildGui() {
		
		Label titelLabel = new Label("Tijdelijke werkloosheid");
		titelLabel.setFont(Font.font("Tahoma", 15));
		setHalignment(titelLabel, HPos.CENTER);
		Region spaceRegion = new Region();
				
		Label qLabel = new Label("Q  ");
		setHalignment(qLabel,HPos.CENTER);
		TextField qField = new TextField();
		qField.setMaxWidth(60);;
		Label sLabel = new Label("S  ");
		setHalignment(sLabel,HPos.CENTER);
		Label DagBedragLabel = new Label("Dagbedrag  ");
		setHalignment(DagBedragLabel,HPos.CENTER);
		TextField sField = new TextField();
		sField.setMaxWidth(60);
		TextField dagbedragField = new TextField();
		dagbedragField.setMaxWidth(60);
		Label UrenLabel = new Label("Uren");
		setHalignment(UrenLabel,HPos.CENTER);
		TextField UrenField = new TextField();
		UrenField.setMaxWidth(60);
		
		Button prefix2Button = new Button("Prefix 02 of 06");
		Button prefix4Button = new Button("Prefix 04");
		Button prefix57Button = new Button("Prefix 57 of 05");
		Button prefix58Button = new Button("Prefix 58");
		
		Label aantaluitkeringenLabel = new Label("uitkeringen");
		setHalignment(aantaluitkeringenLabel,HPos.CENTER);
		Label aantalhalveuitkeringenLabel = new Label("1/2 uitkeringen");
		setHalignment(aantalhalveuitkeringenLabel,HPos.CENTER);
		Label simulatielabel = new Label("Simulatie");
		setHalignment(simulatielabel,HPos.CENTER);
		TextField aantaluitkeringenTextArea = new TextField();
		aantaluitkeringenTextArea.setMaxWidth(60);
		TextField aantalhalveuitkeringenArea = new TextField();
		aantalhalveuitkeringenArea.setMaxWidth(60);
		TextField simulatieArea = new TextField();
		simulatieArea.setMaxWidth(60);
		
		
		this.add(titelLabel, 0, 0, 3, 1);
		this.add(spaceRegion, 0, 1);
		this.add(qLabel, 0, 2);
		this.add(sLabel, 0, 3);
		this.add(qField, 1, 2);
		this.add(sField, 1, 3);
		this.add(UrenLabel, 0, 4);
		this.add(UrenField, 1, 4);
		this.add(DagBedragLabel, 0, 5);
		this.add(dagbedragField, 1, 5);
		this.add(prefix2Button, 0, 6);
		this.add(prefix4Button, 1, 6);
		this.add(prefix57Button, 0, 7);
		this.add(prefix58Button, 1, 7);
		this.add(aantaluitkeringenLabel, 0, 9);
		this.add(aantaluitkeringenTextArea, 1, 9);
		this.add(aantalhalveuitkeringenLabel, 0, 10);
		this.add(aantalhalveuitkeringenArea, 1, 10);
		this.add(simulatielabel, 0, 11);
		this.add(simulatieArea, 1, 11);
		
		prefix2Button.setOnAction(l -> {
			TijdelijkeWerkloosheid tw = new TijdelijkeWerkloosheid(Double.parseDouble(qField.getText()), Double.parseDouble(sField.getText()), Double.parseDouble(dagbedragField.getText()), 2, Double.parseDouble(UrenField.getText()));
		aantaluitkeringenTextArea.setText(String.format("%.2f",tw.berekenAantalUitkeringen()));
		aantalhalveuitkeringenArea.setText(" ");
		simulatieArea.setText(String.format("%.2f",tw.berekenUitkering()));});
		
		prefix4Button.setOnAction(l -> {
			TijdelijkeWerkloosheid tw = new TijdelijkeWerkloosheid(Double.parseDouble(qField.getText()), Double.parseDouble(sField.getText()), Double.parseDouble(dagbedragField.getText()), 4, Double.parseDouble(UrenField.getText()));
			aantaluitkeringenTextArea.setText(" ");
			aantalhalveuitkeringenArea.setText(String.format("%.2f",tw.berekenAantalUitkeringen()));
			simulatieArea.setText(String.format("%.2f",tw.berekenUitkering()));});
		
		prefix57Button.setOnAction(l-> {
			TijdelijkeWerkloosheid tw = new TijdelijkeWerkloosheid(Double.parseDouble(qField.getText()), Double.parseDouble(sField.getText()), Double.parseDouble(dagbedragField.getText()), 57, Double.parseDouble(UrenField.getText()));
			aantaluitkeringenTextArea.setText(String.format("%.2f",tw.berekenAantalUitkeringen()));
			aantalhalveuitkeringenArea.setText(" ");
			simulatieArea.setText(String.format("%.2f",tw.berekenUitkering()));});
		
		prefix58Button.setOnAction(l-> {
			TijdelijkeWerkloosheid tw = new TijdelijkeWerkloosheid(Double.parseDouble(qField.getText()), Double.parseDouble(sField.getText()), Double.parseDouble(dagbedragField.getText()), 58, Double.parseDouble(UrenField.getText()));
			aantaluitkeringenTextArea.setText(" ");
			aantalhalveuitkeringenArea.setText(String.format("%.2f",tw.berekenAantalUitkeringen()));
			simulatieArea.setText(String.format("%.2f",tw.berekenUitkering()));});
		
		
	}
}
	




