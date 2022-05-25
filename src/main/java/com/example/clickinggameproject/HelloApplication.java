package com.example.clickinggameproject;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import org.kordamp.bootstrapfx.BootstrapFX;
import org.kordamp.bootstrapfx.scene.layout.Panel;

public class HelloApplication extends Application {

    Label label;
    Stage window;
    Button button;

    public static void main(String[] args) {
        //Launch the application
        launch();
    }

    @Override
    public void start(Stage primaryStage) {

        //Set stage title
        primaryStage.setTitle(" My Clicking Game");

        //Create Label and Button
        Panel messageLanel = new Panel("Shxpes-Clixker");

        messageLanel.getStyleClass().add("panel-danger");

        label = new Label("Click the button to start the game.");

        label.getStyleClass().add("lbl-danger");

        button = new Button("Here!");

        button.getStyleClass().setAll("btn", "btn-lg", "btn-danger");

        //Action happening when a button is clicked(Open a new window)
        button.setOnAction(e -> NewWindow.display());

        //Create VBox
        StackPane layout = new StackPane();

        layout.getChildren().add(button);

        VBox vbox = new VBox(messageLanel,label, button, layout);

        vbox.setAlignment(Pos.CENTER);

        //Set Margins
        vbox.setMargin(label, new Insets(100,50 , 20, 50));

        Scene scene =  new Scene(vbox, 1000, 500);

        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());

        primaryStage.setScene(scene);

        primaryStage.show();

    }

}