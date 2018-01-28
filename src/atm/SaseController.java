package atm;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;

public class SaseController {

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
    void da(ActionEvent event) {
        baza.incarcSapte();
    }

    @FXML
    void nu(ActionEvent event) {
        baza.incarcSapte();
    }

    @FXML
    void fff966(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert welcome != null : "fx:id=\"welcome\" was not injected: check your FXML file 'sase.fxml'.";

    }
}
