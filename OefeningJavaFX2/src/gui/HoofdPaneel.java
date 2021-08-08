package gui;

import domein.DomeinController;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class HoofdPaneel extends BorderPane
{
    private final DomeinController controller;
    ListView<String> lvInfo;
    

    public HoofdPaneel(DomeinController controller)
    {
        this.controller = controller;
        buildGui();
    }
    
    private void buildGui()
    {

        DetailPaneel dp = new DetailPaneel(controller);
        OverzichtPaneel op = new OverzichtPaneel(controller, dp);
        this.setLeft(op);
        this.setRight(dp);
        
        
        
        
    }
}
