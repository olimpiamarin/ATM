package atm;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;

public class UnuController {

    Baza baza;

    public void setBaza(Baza baza) {
        this.baza = baza;
    }
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView im1;

    @FXML
    private Rectangle welcome;

    @FXML
    void fff966(ActionEvent event) {

    }

    @FXML
    void f80905(ActionEvent event) {

    }

    @FXML
    void intra(MouseEvent event) {
        // Incarc ecranul doi
        baza.incarcDoi();
    }

    @FXML
    void initialize() {
        assert im1 != null : "fx:id=\"im1\" was not injected: check your FXML file 'unu.fxml'.";
        assert welcome != null : "fx:id=\"welcome\" was not injected: check your FXML file 'unu.fxml'.";

    }
}
