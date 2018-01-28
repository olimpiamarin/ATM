package atm;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Baza extends Application {

    Stage fereastra;

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            fereastra = primaryStage;
            fereastra.setTitle("ATM");
            incarcUnu();
            primaryStage.show();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    UnuController ctrUnu;

    public void incarcUnu() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("unu.fxml"));
        AnchorPane container;
        try {
            container = (AnchorPane) loader.load();
            Scene scene = new Scene(container);
            fereastra.setScene(scene);
            fereastra.sizeToScene();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        ctrUnu = loader.getController();
        ctrUnu.setBaza(this);
    }

    DoiController ctrDoi;

    public void incarcDoi() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("doi.fxml"));
        AnchorPane container;
        try {
            container = (AnchorPane) loader.load();
            Scene scene = new Scene(container);
            fereastra.setScene(scene);
            fereastra.sizeToScene();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        ctrDoi = loader.getController();
        ctrDoi.setBaza(this);
    }

    TreiController ctrTrei;

    public void incarcTrei() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("trei.fxml"));
        AnchorPane container;
        try {
            container = (AnchorPane) loader.load();
            Scene scene = new Scene(container);
            fereastra.setScene(scene);
            fereastra.sizeToScene();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        ctrTrei = loader.getController();
        ctrTrei.setBaza(this);
    }
    
    PatruController ctrPatru;
    
    public void incarcPatru() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("patru.fxml"));
        AnchorPane container;
        try {
            container = (AnchorPane) loader.load();
            Scene scene = new Scene(container);
            fereastra.setScene(scene);
            fereastra.sizeToScene();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        ctrPatru = loader.getController();
        ctrPatru.setBaza(this);
    }
    
    CinciController ctrCinci;
    
    public void incarcCinci() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("cinci.fxml"));
        AnchorPane container;
        try {
            container = (AnchorPane) loader.load();
            Scene scene = new Scene(container);
            fereastra.setScene(scene);
            fereastra.sizeToScene();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        ctrCinci = loader.getController();
        ctrCinci.setBaza(this);
    }
    
    SaseController ctrSase;
    
    public void incarcSase() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("sase.fxml"));
        AnchorPane container;
        try {
            container = (AnchorPane) loader.load();
            Scene scene = new Scene(container);
            fereastra.setScene(scene);
            fereastra.sizeToScene();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        ctrSase = loader.getController();
        ctrSase.setBaza(this);
    }
    
    SapteController ctrSapte;
    
    public void incarcSapte() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("sapte.fxml"));
        AnchorPane container;
        try {
            container = (AnchorPane) loader.load();
            Scene scene = new Scene(container);
            fereastra.setScene(scene);
            fereastra.sizeToScene();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        ctrSapte = loader.getController();
        ctrSapte.setBaza(this);
    }
    
    OptController ctrOpt;
    
    public void incarcOpt() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("opt.fxml"));
        AnchorPane container;
        try {
            container = (AnchorPane) loader.load();
            Scene scene = new Scene(container);
            fereastra.setScene(scene);
            fereastra.sizeToScene();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        ctrOpt = loader.getController();
        ctrOpt.setBaza(this);
    }
    
    NouaController ctrNoua;
    
    public void incarcNoua() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("noua.fxml"));
        AnchorPane container;
        try {
            container = (AnchorPane) loader.load();
            Scene scene = new Scene(container);
            fereastra.setScene(scene);
            fereastra.sizeToScene();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        ctrNoua = loader.getController();
        ctrNoua.setBaza(this);
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}
