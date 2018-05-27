/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.calculetor;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author prodip
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField celciusField;
    @FXML
    private TextField fahrenheitField;
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleConvertAction(ActionEvent event) {
        
        double temperatureInCelcius = Double.parseDouble(celciusField.getText());
        double temperatureInFahrenheit = temperatureInCelcius * 9 / 5 + 32 ;
        fahrenheitField.setText(" " +temperatureInFahrenheit);
        
    }
    
}
