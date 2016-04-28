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
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author cyril
 */
public class FXMLPhoneNumTabController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    @FXML
    public void newPhoneNum(ActionEvent event) throws IOException
    {
        final URL url = getClass().getResource("FXMLNewPhoneNum.fxml");
        final FXMLLoader fl = new FXMLLoader(url);        
        final AnchorPane root =(AnchorPane) fl.load();
        Stage stage = new Stage() ;
        stage.setTitle("New Phone Number");
        final Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}
