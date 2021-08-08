package gui;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;


public class WelkomScherm extends Pane {
	
	public WelkomScherm() {
		
		buildGui();
	}
	
	private void buildGui() {
		Label wlkLabel = new Label("Welkom bij Java FX !");
		ImageView wlkImageView = new ImageView(new Image(getClass().getResourceAsStream("/images/bug.png")));
		
		wlkLabel.setLayoutX(200);
		wlkLabel.setLayoutY(10);
		
		wlkImageView.setLayoutX(50);
		wlkImageView.setLayoutY(50);
		
		this.getChildren().addAll(wlkLabel,wlkImageView);
		
	}

	
	
	
	
	
	
	
			

}
