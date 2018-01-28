package atm;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;

public class SapteController {

    Baza baza;

    public void setBaza(Baza baza) {
        this.baza = baza;
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Rectangle welcome;

    @FXML
    void on(ActionEvent event) {
        baza.incarcOpt();
    }

    @FXML
    void fff966(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert welcome != null : "fx:id=\"welcome\" was not injected: check your FXML file 'sapte.fxml'.";

    }
}
