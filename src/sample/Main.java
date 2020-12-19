package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.awt.*;
import java.beans.EventHandler;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Button btn = new Button("Click me");
        Button exit = new Button("Exit");
        btn.setOnAction(e -> System.out.println("Hello JavaFX 15"));
        exit.setOnAction(e-> System.exit(0));

        VBox root = new VBox();
        root.getChildren().addAll(btn, exit);
        Scene scene = new Scene(root,600,500);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
