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
<<<<<<< HEAD
=======
import javafx.scene.Scene;
>>>>>>> c7b2389ae6f94720ff2992715af3d2681c666a94
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author pvl-vpl
 */
public class FXMLMainFrameController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    Button newContact;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
      @FXML
    public void newContact(ActionEvent event) throws IOException
    {
        final URL url = getClass().getResource("FXMLNewContactt.fxml");
        final FXMLLoader fl = new FXMLLoader(url);        
        final AnchorPane root =(AnchorPane) fl.load();
        Stage stage = new Stage() ;
        stage.setTitle("New Contact");
        final Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}
