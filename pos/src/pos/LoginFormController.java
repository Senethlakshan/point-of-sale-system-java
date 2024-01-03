/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author SenethG
 */
public class LoginFormController implements Initializable {

    
    @FXML
    private Label label;

    @FXML
    private Label loginErrorLabel;

    @FXML
    private Label passwordErrorLabel;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField loginIdField;

    
    // Virtual Keyboard Buttons
    @FXML
    private Button btnA, btnB, btnC, btnD;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() instanceof Button) {
            Button clickedButton = (Button) event.getSource();

            // Append the corresponding character to the active text field
            if (loginIdField.isFocused()) {
                loginIdField.appendText(clickedButton.getText());
            } else if (passwordField.isFocused()) {
                passwordField.appendText(clickedButton.getText());
            }
        }
    }
    
  

   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
