package SceneBuilderBasics;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class WelcomeController {

    @FXML
    private Text txt_uid;

    public void setTxt_uid(String text) {
        this.txt_uid.setText(text);
    }
}
