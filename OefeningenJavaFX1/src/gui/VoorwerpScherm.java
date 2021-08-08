package gui;

import javax.swing.GroupLayout.Alignment;

import domein.DomeinController;
import domein.VoorwerpSoort;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VoorwerpScherm extends VBox{
	
	private TextArea txaCollectie;
	private DomeinController dc;
	private VoorwerpToevoegScherm toevoeg;
	private Knoppenpaneel knoppen;
	
	public VoorwerpScherm(DomeinController dc) {
		super();
		this.dc = dc;
		this.toevoeg = new VoorwerpToevoegScherm();
		
		buildGui();
	}

	private void buildGui() {
		txaCollectie = new TextArea();
		txaCollectie.setText(dc.toonOverzicht());
		txaCollectie.setDisable(true);
		Knoppenpaneel knoppen = new Knoppenpaneel(this);
		
		this.setSpacing(5);
		
		this.getChildren().addAll(txaCollectie,knoppen);
		
	}
	
	public void voegToe(VoorwerpSoort voorwerpsoort) {
		
		String[] inhoud = voorwerpsoort.getAttribuutNamen();
		
		if (voorwerpsoort == VoorwerpSoort.WAPEN)
			dc.voegWapenToe(inhoud[0], Double.parseDouble(inhoud[1]), Integer.parseInt(inhoud[2]), Integer.parseInt(inhoud[3]), Boolean.parseBoolean(inhoud[4]));
		
		if (voorwerpsoort == voorwerpsoort.SLEUTEL)
			
			dc.voegSleutelToe(inhoud[0], Double.parseDouble(inhoud[1]), Integer.parseInt(inhoud[2]), Integer.parseInt(inhoud[3]));

		
	}
	
	public void zetTerugActief(Stage stage) {
		stage.setScene(this.getScene());
	}

	
	
	

}
