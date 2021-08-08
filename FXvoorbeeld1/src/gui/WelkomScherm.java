package gui;

import javafx.scene.image.Image;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.lang.invoke.LambdaConversionException;

import javafx.event.ActionEvent;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import javafx.scene.control.Label;


public class WelkomScherm extends Pane implements EventHandler<ActionEvent>
{
	Button naarScene2;

	
    public WelkomScherm()
    {
 
        Label lblWelkom = new Label("Welkom bij JavaFX !");

    
        ImageView ivImage = new ImageView(
                   new Image(getClass().getResourceAsStream("/images/bug.png"))
        );

        
        naarScene2 = new Button("naar scene 2");
        
        lblWelkom.setLayoutX(200);
        lblWelkom.setLayoutY(10);
        
        ivImage.setLayoutX(50);
        ivImage.setLayoutY(50);
        
        naarScene2.setLayoutX(100);
        naarScene2.setLayoutY(100);
        naarScene2.setOnAction(Lambda -> primaryStage.setScene(scene2));
        
   
        
    
        this.getChildren().addAll(lblWelkom, ivImage,naarScene2);

    }




		
	
}