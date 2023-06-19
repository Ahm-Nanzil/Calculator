package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

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
        String binaryNumber = null;
        try {
             binaryNumber = Integer.toBinaryString(Integer.parseInt(inputNumber.getText()));
             message.setText(binaryNumber);
        }
        catch (NumberFormatException e) {
            try {
                double doubleValue = Double.parseDouble((inputNumber.getText()));
                message.setText("No Input Given");
            } catch (NumberFormatException ex) {
                message.setText("Not a Number!");
            }
        }

    }
    @FXML
    void convertH(ActionEvent event) {
        String hexNumber = null;
        try {
            hexNumber = Integer.toHexString(Integer.parseInt(inputNumber.getText()));
            message.setText(hexNumber);
        }
        catch (NumberFormatException e) {
            try {
                double doubleValue = Double.parseDouble((inputNumber.getText()));
                message.setText("No Input Given");
            } catch (NumberFormatException ex) {
                message.setText("Not a Number!");
            }
        }
    }

    @FXML
    void convertO(ActionEvent event) {
        String octalNumber = null;
        try {
            octalNumber = Integer.toOctalString(Integer.parseInt(inputNumber.getText()));
            message.setText(octalNumber);
        }
        catch (NumberFormatException e) {
            try {
                double doubleValue = Double.parseDouble((inputNumber.getText()));
                message.setText("No Input Given");
            } catch (NumberFormatException ex) {
                message.setText("Not a Number!");
            }
        }
    }


    @FXML
    void nextWindow(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("newScene.fxml")));
        Calculator.primaryStage.setScene(new Scene(root, 320, 240));
        Calculator.primaryStage.show();
    }
    @FXML
    void clearText(ActionEvent event) {
        inputNumber.clear();
        message.setText("No Input");
    }
    @FXML
    void closeWindow(ActionEvent event) {
        Calculator.primaryStage.close();
    }
}