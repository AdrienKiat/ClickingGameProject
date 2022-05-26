package com.example.clickinggameproject;

//Imports
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;
import static com.example.clickinggameproject.NewWindow.count1;
import static com.example.clickinggameproject.NewWindow.count2;

public class EndWindow {


    public static void display() {

        //VBox and Stage Title
        Stage window = new Stage();

        VBox root = new VBox();

        window.initModality(Modality.APPLICATION_MODAL);

        window.setTitle("Shxpes-Clixker");

        //Number of clicks on the circle button
        Label circle = new Label();

        circle.setText("Total clicks on the circle button:  "+ count1);

        //Number of clicks on the square button
        Label square = new Label();

        square.setText("Total clicks on the square button:  "+ count2);

        //Restart Button
        Button restart = new Button("Restart");

        //Action when the button is clicked (Reset the previous window)
        restart.setOnAction(e-> NewWindow.display());

        //BootstrapFX
        restart.getStyleClass().setAll("btn", "btn-lg", "btn-danger");

        //Displaying on the screen
        root.getChildren().addAll(square,circle,restart);

        root.setSpacing(30);

        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 1000, 500);

        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());

        window.setScene(scene);

        window.showAndWait();

    }

}
