package com.example.clickinggameproject;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class EndWindow {


    public static void display() {

        Stage window = new Stage();

        VBox root = new VBox();

        window.initModality(Modality.APPLICATION_MODAL);

        window.setTitle("Shxpes-Clixker");

        //Number of clicks on the circle button
        Label circle = new Label();

        circle.setText("Total clicks on circle the button: ");

        //Number of clicks on the square button
        Label square = new Label();

        square.setText("Total clicks on square the button: ");

        root.getChildren().addAll(circle, square);

        root.setSpacing(30);

        Scene scene = new Scene(root, 1000, 500);

        window.setScene(scene);

        window.showAndWait();

    }

}
