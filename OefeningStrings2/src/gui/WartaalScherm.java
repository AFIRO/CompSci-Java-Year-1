package gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import domein.MijnString;
import javafx.scene.layout.VBox;

public class WartaalScherm extends VBox
{
    private MijnString mijnString; 
    private Label lblMessage,lblInvoer, lbleersteletter, lbltweedeletter;
    private TextField txfInvoer,txf1steletter, txfWartaal, txf2deletter;
    private Button btnWartaal;
     
     public WartaalScherm()
     {
        this.setAlignment(Pos.CENTER_LEFT);       
        this.setSpacing(10);
        this.setPadding(new Insets(25, 25, 25, 25));
        
        lblInvoer = new Label("GEEF INVOERSTRING: ");
        txfInvoer = new TextField();
        lbleersteletter = new Label("1ste LETTER");
        txf1steletter = new TextField();
        lbltweedeletter = new Label("2de LETTER");
        txf2deletter  = new TextField();
        btnWartaal = new Button("MAAK WARTAAL");
        txfWartaal = new TextField();
        
        this.getChildren().addAll(lblInvoer, txfInvoer,lbleersteletter,txf1steletter,lbltweedeletter, txf2deletter, btnWartaal,txfWartaal);
        
        lblMessage = new Label("Gelieve eerst een zin in te voeren");
        lblMessage.setVisible(false);
        this.getChildren().add(lblMessage);
        
        
        
        btnWartaal.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent evt)
            {
                lblMessage.setVisible(false);

                try
                { MijnString mijnString = new MijnString(txfInvoer.getText());
                	String output = String.valueOf(mijnString.maakWartaal(txf1steletter.getText().charAt(0), txf2deletter.getText().charAt(0)));
                  txfWartaal.setText(output);
                   
                }
                catch (NullPointerException | IllegalArgumentException | StringIndexOutOfBoundsException e )
                {
                    lblMessage.setVisible(true);
                    reset();
                }
                catch (Exception e)
                {
                   e.printStackTrace();
                }

            }
        });
  }
     
    private void reset()
    {
        txfInvoer.setText("");
        txf1steletter.setText("");
        txf2deletter.setText("");
    }     
}
