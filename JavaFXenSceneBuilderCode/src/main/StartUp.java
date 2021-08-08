package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import domein.DomeinController;
import gui.BeheersKostenScherm;
import gui.BeheersKostenSchermSceneBuilderController;

public class StartUp extends Application
{
    @Override
    public void start(Stage stage)
    {
        DomeinController controller = new DomeinController();
        //BeheersKostenScherm bs = new BeheersKostenScherm(controller);
        BeheersKostenSchermSceneBuilderController bksc = new BeheersKostenSchermSceneBuilderController(controller);
        Scene scene = new Scene(bksc, 500, 300);
        stage.setScene(scene);
        stage.setTitle("Beheerskosten");
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
