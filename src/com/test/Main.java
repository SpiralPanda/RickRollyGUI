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
import javafx.scene.control.ToggleGroup;


public class Main extends Application {

    static StackPane myUIFrame;
    static HBox rickrollhbox;
    static Stage myPrimaryStage;
    static Button RickRoll;
    static HBox TriggerTrigger;
    static Image imageLeft;
    static Image imageRight;
    static Image imageDown;
    static Image imageUp;
    static Image imageMain;
    static ImageView imageVew;

    public static void RickRoll_click() {
        System.out.println("You got Rick Rolled my guy..");
        imageVew.setImage(imageMain);
    }

    public static void nextpic_click() {
        System.out.println("You got Rick Rolled my guy..");

        imageVew.setImage(imageLeft);

    }

    public static void nextpic2_click() {
        System.out.println("You got Rick Rolled my guy..");
        imageVew.setImage(imageRight);

  }
    public static void nextpic3_click() {
        System.out.println("You got Rick Rolled my guy..");
        imageVew.setImage(imageUp);
    }
    public static void nextpic4_click() {
        System.out.println("You got Rick Rolled my guy..");
        imageVew.setImage(imageDown);
    }
    //@Override
    public void start(Stage primaryStage) throws Exception {
        myPrimaryStage = primaryStage;

        RickRoll = new Button("Click Here");

        imageMain = new Image("RickRolly.png" , 1000, 900,false, true);
        imageLeft = new Image("RickLeft.jpg", 1000, 900, false, true);
        imageRight = new Image("RickRight.png", 1000 , 900, false ,true);
        imageDown = new Image("RickRollDown.png", 1000, 900, false, true);
        imageUp = new Image("RickRollUp.jpg", 1000, 900, false, true);
        imageVew = new ImageView();
        ToggleButton toggleButton1 = new ToggleButton("Left");
        ToggleButton toggleButton2 = new ToggleButton("Right");
        ToggleButton toggleButton3 = new ToggleButton("Up");
        ToggleButton toggleButton4 = new ToggleButton("Down");

        ToggleGroup toggleGroup = new ToggleGroup();

        toggleButton1.setToggleGroup(toggleGroup);
        toggleButton2.setToggleGroup(toggleGroup);
        toggleButton3.setToggleGroup(toggleGroup);
        toggleButton4.setToggleGroup(toggleGroup);

        TriggerTrigger = new HBox(toggleButton1, toggleButton2, toggleButton3, toggleButton4);
        rickrollhbox = new HBox(imageVew);
        //imageDown = new HBox(imageVew);



        RickRoll.setOnAction(e -> RickRoll_click());
        toggleButton1.setOnAction(e->nextpic_click());
        toggleButton2.setOnAction(e->nextpic2_click());
        toggleButton3.setOnAction(e->nextpic3_click());
        toggleButton4.setOnAction(e->nextpic4_click());

        myUIFrame = new StackPane();
        myUIFrame.getChildren().add(rickrollhbox);
        myUIFrame.getChildren().add(TriggerTrigger);
        myUIFrame.getChildren().add(RickRoll);

        Scene scene = new Scene(myUIFrame, 1000, 900);
        primaryStage.setScene(scene);
        primaryStage.setTitle("My First GUI");
        primaryStage.show();
    }

    public static void main(String[] args) { Application.launch(args);}

        }

