package atm;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;

public class CinciController {

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
    void osuta(ActionEvent event) {
        baza.incarcSase();
    }

    @FXML
    void douasute(ActionEvent event) {
        baza.incarcSase();
    }

    @FXML
    void patrusute(ActionEvent event) {
        baza.incarcSase();
    }

    @FXML
    void cincisute(ActionEvent event) {
        baza.incarcSase();
    }

    @FXML
    void alta(ActionEvent event) {
        baza.incarcSase();
    }

    @FXML
    void cincizeci(ActionEvent event) {
        baza.incarcSase();
    }

    @FXML
    void douazeci(ActionEvent event) {
        baza.incarcSase();
    }

    @FXML
    void zece(ActionEvent event) {
        baza.incarcSase();
    }

    @FXML
    void fff966(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert welcome != null : "fx:id=\"welcome\" was not injected: check your FXML file 'cinci.fxml'.";

    }
}
