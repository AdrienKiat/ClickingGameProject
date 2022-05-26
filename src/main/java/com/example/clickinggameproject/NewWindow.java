package com.example.clickinggameproject;

//Imports
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import org.kordamp.bootstrapfx.BootstrapFX;

public class NewWindow {


    private static double r = 50;

    static int count1 = 0;

    static int count2 = 0;

    public static void display() {

        //VBox and Stage Title
        Stage window = new Stage();

        VBox root = new VBox();

        window.initModality(Modality.APPLICATION_MODAL);

        window.setTitle("Shxpes-Clixker");

        //Round Button
        Button roundbutton = new Button("Circle");

        roundbutton.setShape(new Circle(r));

        roundbutton.setMinSize(2*r, 2*r);

        roundbutton.setMaxSize(2*r, 2*r);

        //BootstrapFX
        roundbutton.getStyleClass().setAll("btn", "btn-lg", "btn-danger");

        //Count the number of clicks on the circle button
        Label circle = new Label();

        roundbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                count1++;
                circle.setText(Integer.toString(count1));
            }
        });


        //Square Button
        Button squarebutton = new Button("Square");

        squarebutton.setMinSize(100,100);

        squarebutton.setMaxSize(100,100);

        //BootstrapFX
        squarebutton.getStyleClass().setAll("btn", "btn-lg", "btn-danger");

        //Count the number of clicks on the square button
        Label square = new Label();

        squarebutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                count2++;
                square.setText(Integer.toString(count2));

            }
        });


        //Label and button
        Button Nextbutton = new Button("View Score");

        //BootstrapFX
        Nextbutton.getStyleClass().setAll("btn", "btn-lg", "btn-danger");

        //Action when the button is clicked (Open the last window)
        Nextbutton.setOnAction(e-> EndWindow.display());

        Label message = new Label("Click the button to see your results");

        //Displaying on the window
        root.getChildren().addAll(squarebutton,roundbutton,message,Nextbutton);

        root.setAlignment(Pos.CENTER);

        root.setSpacing(30);

        Scene scene = new Scene(root, 1000,500);

        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());

        window.setScene(scene);

        window.showAndWait();
    }


}