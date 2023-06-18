package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class CalculatorController {
    @FXML
    private Button binary;

    @FXML
    private TextField inputNumber;

    @FXML
    private Text message;

    @FXML
    void convertB(ActionEvent event) {

        String binaryNumber = Integer.toBinaryString(Integer.parseInt(inputNumber.getText()));
        message.setText(binaryNumber);
    }
}