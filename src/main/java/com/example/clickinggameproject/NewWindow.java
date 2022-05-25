package com.example.clickinggameproject;

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

public class NewWindow {


    private static double r = 50;

    static int count1 = 0;

    static int count2 = 0;

    public static void display() {

        Stage window = new Stage();

        VBox root = new VBox();

        window.initModality(Modality.APPLICATION_MODAL);

        window.setTitle("Shxpes-Clixker");

        //Round Button
        Button roundbutton = new Button("Circle");

        roundbutton.setShape(new Circle(r));

        roundbutton.setMinSize(2*r, 2*r);

        roundbutton.setMaxSize(2*r, 2*r);

        //Number of clicks on the circle button
        Label circle = new Label();

        circle.setText("Clicks on circle: 0");

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

        //Number of clicks on the square button
        Label square = new Label();

        square.setText("Clicks on square: 0");

        squarebutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                count2++;
                square.setText(Integer.toString(count2));
            }
        });


        //Label and button for next window
        Button Nextbutton = new Button("View Score");

        //Action when the button is clicked
        Nextbutton.setOnAction(e-> EndWindow.display());

        Label message = new Label("Click the button to see your results");

        root.getChildren().addAll(squarebutton,square,roundbutton,circle,message,Nextbutton);

        root.setAlignment(Pos.CENTER);

        root.setSpacing(30);

        Scene scene = new Scene(root, 1000,500);

        window.setScene(scene);

        window.showAndWait();
    }


}