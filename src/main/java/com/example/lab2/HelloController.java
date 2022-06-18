package com.example.lab2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class    HelloController implements Initializable {

    @FXML
    private TextField promienTextField;
    @FXML
    private TextField wysokoscTextField;
    @FXML
    private TextField gruboscTextField;

    @FXML
    private ChoiceBox<String> rodzajBlachyChoiceBox;
    @FXML
    private Label ciezarLabel;
    @FXML
    private Label kosztLabel;

    private String[] rodzajeBlach = {"blacha stalowa", "blacha stalowa nierdzewna"};

    @FXML
    protected void onObliczButtonClick() {
        float r = Float.parseFloat(promienTextField.getText());
        float h = Float.parseFloat(wysokoscTextField.getText());
        float g = (Float.parseFloat(gruboscTextField.getText())/1000);
        float objetosc = (float) ((2*3.14*r*h + 2*3.14*r*r*h)*g);
        if (rodzajBlachyChoiceBox.getValue() == "blacha stalowa"){
            ciezarLabel.setText(objetosc*7900 + "");
            kosztLabel.setText(objetosc*7900*2 + "");
        }else if(rodzajBlachyChoiceBox.getValue() == "blacha stalowa nierdzewna"){
            ciezarLabel.setText(objetosc*7900 + "");
            kosztLabel.setText(objetosc*7900*3.5 + "");
        }else {
            ciezarLabel.setText("coś jest nie tak!");
            kosztLabel.setText("coś jest nie tak!");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        rodzajBlachyChoiceBox.getItems().addAll(rodzajeBlach);
    }

}