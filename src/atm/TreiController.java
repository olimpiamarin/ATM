package atm;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;

public class TreiController {

    Baza baza;

    public void setBaza(Baza baza) {
        this.baza = baza;
    }
    
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField pin;

    @FXML
    private Rectangle welcome;

    @FXML
    void ok(ActionEvent event) {
        baza.incarcPatru();
    }

    @FXML
    void corectare(ActionEvent event) {
        baza.incarcUnu();
    }

    @FXML
    void anulare(ActionEvent event) {
          baza.incarcUnu();
    }

    @FXML
    void fff966(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert pin != null : "fx:id=\"pin\" was not injected: check your FXML file 'trei.fxml'.";
        assert welcome != null : "fx:id=\"welcome\" was not injected: check your FXML file 'trei.fxml'.";

    }
}
