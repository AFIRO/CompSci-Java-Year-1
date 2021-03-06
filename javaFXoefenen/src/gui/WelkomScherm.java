package gui;



import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class WelkomScherm extends GridPane implements EventHandler<ActionEvent> { 
	
	TextField usernameField;
	
	public WelkomScherm() {
		Label lblWelkom = new Label("Welkom");
		lblWelkom.setFont(Font.font("Tahoma", FontWeight.NORMAL,20));
		this.add(lblWelkom, 0, 0, 2, 1);
		
		Label lblUsername = new Label("Username: ");
		this.add(lblUsername, 0, 1);
		
		usernameField = new TextField();
		this.add(usernameField, 1, 1);
		
		Label passwwordLabel = new Label("Password: ");
		this.add(passwwordLabel, 0, 2);
		
		PasswordField passField = new PasswordField();
		this.add(passField, 1, 2);
		
		Tooltip passwordTooltip = new Tooltip("Wachtwoord moet minstens 8 characters bevatten.");
		passField.setTooltip(passwordTooltip);
		
		Button loginButton = new Button("Login");
		this.add(loginButton, 0, 3);
		
		Button cancelButton = new Button("Cancel");
		setHalignment(cancelButton, HPos.LEFT);
		this.add(cancelButton, 1, 3);
		
		
		Hyperlink vergetenHyperlink = new Hyperlink("Wachtwoord vergeten?");
		this.add(vergetenHyperlink, 0, 4);
		
		Label	aanpasbaarlabel = new Label();
		this.add(aanpasbaarlabel, 0, 5, 2, 1);
		setHalignment(aanpasbaarlabel, HPos.CENTER);
		
		cancelButton.setOnAction(l -> aanpasbaarlabel.setText("Cancel is ingedrukt"));
		loginButton.setOnAction(this::buttonPushed);
		vergetenHyperlink.setOnAction(l -> aanpasbaarlabel.setText("Hyperlink is ingedrukt"));
		;
		
	}
	
	private void buttonPushed(ActionEvent evt) {
		VolgendScherm vs = new VolgendScherm(usernameField.getText(), this);
		Scene scene = new Scene(vs, 200,50);
		Stage stage = (Stage) this.getScene().getWindow();
		stage.setScene(scene);
	}
	

}
