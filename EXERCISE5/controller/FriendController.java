package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class FriendController {

    @FXML
    Button btn1, btn2, btn3, btn4, btn5, btn6;

    Paulo paulo = new Paulo();
    Louis louis = new Louis();
    Shalimar shalimar = new Shalimar();
    Sheen sheen = new Sheen();
    Leanna leanna = new Leanna();
    Kit kit = new Kit();


    public void initialize() {

        paulo.setAge("19");
        paulo.setZodiac("Aries");

        louis.setAge("19");
        louis.setZodiac("Virgo");

        shalimar.setAge("19");
        shalimar.setZodiac("Capricorn");

        sheen.setAge("19");
        sheen.setZodiac("Leo");

        leanna.setAge("19");
        leanna.setZodiac("Aries");

        kit.setAge("19");
        kit.setZodiac("Scorpio");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Louis is " + louis.getAge() + " years old and a " + louis.getZodiac());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Paulo is " + paulo.getAge() + " years old and a " + paulo.getZodiac());
        }

        if (sourceButton == btn3) {
            alert.setContentText("Shalimar is " + shalimar.getAge() + " years old and a " + shalimar.getZodiac());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Sheen is " + sheen.getAge() + " years old and a " + sheen.getZodiac());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Leanna is " + leanna.getAge() + " years old and a " + leanna.getZodiac());
        }

        if (sourceButton == btn6) {
            alert.setContentText("Kit is " + kit.getAge() + " years old and a " + kit.getZodiac());
        }

        alert.showAndWait();

    }
}