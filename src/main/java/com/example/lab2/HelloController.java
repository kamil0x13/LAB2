package com.example.lab2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class    HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Wciścnięt przycisk");
    }
}