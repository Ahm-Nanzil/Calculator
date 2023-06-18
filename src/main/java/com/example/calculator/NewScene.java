package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;

public class NewScene {


    public void previousWindow(ActionEvent actionEvent) throws IOException {

            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("calculatorView.fxml")));
            Calculator.primaryStage.setScene(new Scene(root, 320, 240));
            Calculator.primaryStage.show();

    }
}
