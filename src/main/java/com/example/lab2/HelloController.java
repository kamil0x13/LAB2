package com.example.lab2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class    HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        int x = Integer.parseInt(welcomeText.getText())+1;
        welcomeText.setText(String.valueOf(x));
    }
}