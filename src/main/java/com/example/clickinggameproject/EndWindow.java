package com.example.clickinggameproject;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class EndWindow {


    public static void display() {

        Stage window = new Stage();

        HBox root = new HBox();

        window.initModality(Modality.APPLICATION_MODAL);

        window.setTitle("SharpShooter");


        //Number of clicks on the circle button
        Label circle = new Label();

        circle.setText("Total cicks on circle button: 0");

        //Number of clicks on the square button
        Label square = new Label();

        square.setText("Total clicks on square button: 0");

        root.getChildren().addAll(circle,square);

        root.setSpacing(30);

        Scene scene = new Scene(root, 1000,500);

        window.setScene(scene);

        window.showAndWait();

    }
}
