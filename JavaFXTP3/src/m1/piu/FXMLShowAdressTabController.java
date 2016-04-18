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
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author cyril
 */
public class FXMLShowAdressTabController implements Initializable {

    String mem;
    @FXML
    Pane paneD;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        paneD.getChildren().clear();
        
        try{
        if(){
            paneD.getChildren().add(FXMLLoader.load(getClass().getResource("FXMLProfessional.fxml")));
        }
        else{
            paneD.getChildren().add(FXMLLoader.load(getClass().getResource("FXMLStudent.fxml")));
        }
        }catch(IOException e){
            
        }
    }    
    
}
