package gui;

import javax.swing.GroupLayout.Alignment;

import domein.VoorwerpSoort;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class Knoppenpaneel extends HBox{
	

	public Knoppenpaneel(VoorwerpScherm parent) {
		super();
		buildGui();
	}

	private void buildGui() {
		Button btnWapen = new Button("Wapen toevoegen");
		Button btnSleutel = new Button("Sleutel toevoegen");
		
		this.setSpacing(5);
		this.setAlignment(Pos.CENTER);
		
		this.getChildren().addAll(btnWapen,btnSleutel);
		
		
	}
	


	

}
