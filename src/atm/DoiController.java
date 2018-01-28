package atm;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;

public class DoiController {

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
    void romana(ActionEvent event) {
        // Incarc ecranul trei
        baza.incarcTrei();
    }

    @FXML
    void engl(ActionEvent event) {
        // Incarc ecranul trei
        baza.incarcTrei();
    }

    @FXML
    void fran(ActionEvent event) {
        // Incarc ecranul trei
        baza.incarcTrei();
    }

    @FXML
    void magh(ActionEvent event) {
        // Incarc ecranul trei
        baza.incarcTrei();
    }

    @FXML
    void fff966(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert welcome != null : "fx:id=\"welcome\" was not injected: check your FXML file 'doi.fxml'.";

    }
}
