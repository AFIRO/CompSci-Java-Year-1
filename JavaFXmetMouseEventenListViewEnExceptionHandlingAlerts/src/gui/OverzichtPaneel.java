package gui;

import java.util.Arrays;

import domein.DomeinController;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;

public class OverzichtPaneel extends VBox {
	private DomeinController dc;
	private ListView<String> lvInfo;
	private DetailPaneel dp;
	
	public OverzichtPaneel(DomeinController dc, DetailPaneel dp) {
		this.dc = dc;
		this.dp = dp;
		buildGui();
	}

	private void buildGui() {
		
		Label lblOverzicht = new Label("Overzicht: ");
		lvInfo = new ListView<>();
		lvInfo.setEditable(false);
		lblOverzicht.setTextAlignment(TextAlignment.CENTER);
		lblOverzicht.setAlignment(Pos.CENTER);
		
		this.getChildren().addAll(lblOverzicht,lvInfo);
		
		lvInfo.setItems(FXCollections.observableList(Arrays.asList(dc.geefAlleRekeningen())));
	
		
		lvInfo.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				dp.setIndexVanDeRekening(lvInfo.getSelectionModel().getSelectedIndex());
				dp.update();
				
			}
		});
		
	
	
		
		
		
		
	}

}
