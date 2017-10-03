package com.test;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.control.ToggleButton;

public class Main extends Application {

    public static void RickRoll_click() { System.out.println("You got Rick Rolled my guy..");}

    //@Override
    public void start(Stage primaryStage) throws Exception {
        Button RickRoll = new Button("Click Here");

        Image image = new Image("RickRolly.png");
        ImageView imageView = new ImageView(image);

        HBox hbox = new HBox(imageView);

        RickRoll.setOnAction(e -> RickRoll_click());

        StackPane myUIFrame = new StackPane();
        myUIFrame.getChildren().add(hbox);
        myUIFrame.getChildren().add(RickRoll);


        Scene scene = new Scene(myUIFrame, 1000, 900);
        primaryStage.setScene(scene);
        primaryStage.setTitle("My First GUI");
        primaryStage.show();
    }


    public static void main(String[] args) { Application.launch(args);}

        }

