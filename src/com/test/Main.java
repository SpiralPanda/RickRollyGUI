package com.test;

import javafx.application.Application;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.stage.Stage

public class Main extends Application {

    public static void Main (String[] args) { System.out.println("You got Rick Rolled my guy..");

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button RickRoll = new Button ("Rick Roll?");

        RickRoll.setOnAction(e->RickRoll_click());

        StackPane myUIFrame = new StackPane();
        myUIFrame.getChildren().add(RickRoll);

        Scene scene = new Scene(myUIFrame, 400,400);





        }
}
