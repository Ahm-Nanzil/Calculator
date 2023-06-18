package SceneBuilderBasics;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    // cannot create constructor here - compile error here
//    LoginController(){
//
//    }



    @FXML
    private Button btn_submit;

    @FXML
    private TextField txt_userID;

    @FXML
    private Text text_curr_date;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    void onClickSubmit(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Welcome.fxml")));
//        Login.primaryStage.setScene(new Scene(root, 600, 600)); // hacky way
//        Login.primaryStage.show();

        // better way to get the stage from the controller class
        //(Node) (event.getSource()) // cast the whole thing to a node first
        Stage loginStage = (Stage) ((Node) (event.getSource())).getScene().getWindow(); // then cast to stage to get the window
        loginStage.setScene(new Scene(root, 600, 600));

//        FXMLScene scene = FXMLScene.load("Welcome.fxml");
//
//        Parent root =  scene.root;
//        WelcomeController welcomeController = (WelcomeController) scene.controller;
//
//        welcomeController.setTxt_uid(txt_userID.getText());
//
//        Login.primaryStage.setScene(new Scene(root, 600, 600));


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        text_curr_date.setText("This is cool");
    }
}
