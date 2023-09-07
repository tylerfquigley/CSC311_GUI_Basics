package com.example.csc311_gui_basics;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("you clicked me");
    }
    @FXML
    protected void onHelloButtonClick2() {
        welcomeText.setText("why did you click me");
    }
}