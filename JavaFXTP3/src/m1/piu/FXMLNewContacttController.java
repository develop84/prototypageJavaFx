/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;



/**
 * FXML Controller class
 *
 * @author cyril
 */
public class FXMLNewContacttController implements Initializable {
@FXML
Pane borderNC;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void pressAddress(ActionEvent event) throws IOException{
        //borderNC.getControler();
        borderNC.getChildren().clear();
        borderNC.getChildren().add(FXMLLoader.load(getClass().getResource("FXMLShowAdressTab.fxml")));
    }
    
    public void pressPhone(ActionEvent event) throws IOException{
        borderNC.getChildren().clear();
        borderNC.getChildren().add(FXMLLoader.load(getClass().getResource("FXMLPhoneContact.fxml")));
    }
    
    public void pressIdentity(ActionEvent event) throws IOException{
        borderNC.getChildren().clear();
        borderNC.getChildren().add(FXMLLoader.load(getClass().getResource("FXMLIdentityContact.fxml")));
    }
    
}
