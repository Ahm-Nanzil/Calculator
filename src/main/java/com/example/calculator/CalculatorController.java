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
    private Button octal;
    @FXML
    private Button hexadecimal;

    @FXML
    private TextField inputNumber;

    @FXML
    private Text message;

    @FXML
    void convertB(ActionEvent event) {

        String binaryNumber = Integer.toBinaryString(Integer.parseInt(inputNumber.getText()));
        message.setText(binaryNumber);
    }
    @FXML
    void convertH(ActionEvent event) {
        String hexNumber = Integer.toHexString(Integer.parseInt(inputNumber.getText()));
        message.setText(hexNumber);
    }

    @FXML
    void convertO(ActionEvent event) {
        String octalNumber = Integer.toOctalString(Integer.parseInt(inputNumber.getText()));
        message.setText(octalNumber);
    }
}