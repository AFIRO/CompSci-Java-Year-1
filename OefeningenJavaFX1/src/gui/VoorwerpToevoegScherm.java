package gui;

import domein.DomeinController;
import domein.VoorwerpSoort;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class VoorwerpToevoegScherm extends GridPane {
	private Button btnOK,btnCancel;
	TextField[] txtAttributen;
	DomeinController dc;
	VoorwerpSoort voorwerpSoort;
	public VoorwerpToevoegScherm(DomeinController dc, VoorwerpSoort voorwerpSoort, VoorwerpScherm parent) {
		super();
		this.dc = dc;
		this.voorwerpSoort = voorwerpSoort;
		buildGui();
	}
	private void buildGui() {
		if (voorwerpSoort == voorwerpSoort.WAPEN)
			
			
			

		
	}
	
	
	
	
}
