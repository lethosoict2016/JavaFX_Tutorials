package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;

public class Controller {
    @FXML
    private Label myMessage;
    public void generateRandom(ActionEvent event){
        Random rand = new Random();
        int myRand = rand.nextInt(50) + 1;
        myMessage.setText(Integer.toString(myRand));
       // System.out.println(Integer.toString(myRand));
    }

    public void exitA(ActionEvent event){
        System.exit(0);
    }

}
