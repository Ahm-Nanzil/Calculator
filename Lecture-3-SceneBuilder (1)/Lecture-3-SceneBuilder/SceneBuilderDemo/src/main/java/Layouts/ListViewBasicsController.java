package Layouts;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ListViewBasicsController implements Initializable {

    @FXML
    private Label playerLabel;

    String currentPlayerLabel;



    @FXML
    private ToggleGroup G1;

    @FXML
    private ToggleGroup G2;

    @FXML
    private MenuItem newMenu;

    @FXML
    private ListView<String> playerListView;

    ArrayList<String> listOfPlayers = new ArrayList<>(){
        {
            add("Billy");
            add("Jim");
            add("Kim");
        }
    };

    @FXML
    void createNewMenu(ActionEvent event) {
        System.out.println("You clicked here!");
        this.playerListView.getItems().add("New Stuff!!");
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        // adding all players to the list initially
        playerListView.getItems().addAll(listOfPlayers);

        playerListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                currentPlayerLabel = playerListView.getSelectionModel().getSelectedItem();
                playerLabel.setText(currentPlayerLabel);
            }
        });


    }
}
