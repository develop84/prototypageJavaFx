/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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

    @FXML
    Pane paneD;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

 
    
    public void setData(String type) {
        paneD.getChildren().clear();

        System.out.println(type);
        switch (type) {
            case "Professional":
                try {
                    System.out.println("pro");

                    paneD.getChildren().add(FXMLLoader.load(getClass().getResource("FXMLProfessional.fxml")));
                    paneD.requestLayout();
                } catch (IOException e) {
                }
                break;
            case "Student":
                try {
                    System.out.println("stu");

                    paneD.getChildren().add(FXMLLoader.load(getClass().getResource("FXMLStudent.fxml")));
                                    paneD.requestLayout();
                } catch (IOException e) {

                }
                break;
        }
} 
        
    }    
        
    

