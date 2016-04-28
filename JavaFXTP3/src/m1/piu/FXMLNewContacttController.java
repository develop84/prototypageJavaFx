/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author cyril
 */
public class FXMLNewContacttController implements Initializable {

    @FXML
    Pane borderNC;

    @FXML
       ComboBox typeContact;
    
    int memType;

    FXMLLoader fl;

    @FXML
    FXMLShowAdressTabController fc;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fl = new FXMLLoader();
        ObservableList<String> list = FXCollections.observableArrayList("Private", "Professional", "Student");
        typeContact.setItems(list);

    }

    public void pressAddress(ActionEvent event) throws IOException {
        //borderNC.getControler();
                borderNC.getChildren().clear();

        borderNC.getChildren().add(FXMLLoader.load(getClass().getResource("FXMLShowAdressTab.fxml")));

        try {
            fl.load(getClass().getResource("FXMLShowAdressTab.fxml").openStream());
        } catch (IOException e) {
        }// TODO
        fc = (FXMLShowAdressTabController) fl.getController();


                fc.setData(typeContact.getValue().toString());
            
        

    }

    public void pressPhone(ActionEvent event) throws IOException {
        borderNC.getChildren().clear();
        borderNC.getChildren().add(FXMLLoader.load(getClass().getResource("FXMLPhoneSecond.fxml")));
    }

    public void pressIdentity(ActionEvent event) throws IOException {
        borderNC.getChildren().clear();
        borderNC.getChildren().add(FXMLLoader.load(getClass().getResource("FXMLIdentityContact.fxml")));
    }

}
