package com.company.pos.controller;

import com.company.pos.dao.UserDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginFormController {


    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    private UserDao userDao = new UserDao();

    @FXML
    private void handleLogin(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (userDao.validateUser(username, password)) {
            System.out.println("Login successful!");
            // Add code to navigate to the next scene or perform other actions on successful login.
        } else {
            System.out.println("Login failed. Please check your credentials.");
            // Add code to display an error message or perform other actions on failed login.
        }
    }

//    @FXML
//    private void handleNumericInput(ActionEvent event) {
//        // Assuming the event source is a Button
//        Button sourceButton = (Button) event.getSource();
//
//        // Append the clicked digit to the current text field
//        String currentText = usernameField.getText();
//        String newText = currentText + sourceButton.getText();
//        usernameField.setText(newText);
//
//
//    }

    @FXML
    private void handleNumericInput(ActionEvent event) {
        // Assuming the event source is a Button
        Button sourceButton = (Button) event.getSource();

        // Check which field is focused and update accordingly
        if (usernameField.isFocused()) {
            appendToField(usernameField, sourceButton.getText());
        } else if (passwordField.isFocused()) {
            appendToField(passwordField, sourceButton.getText());
        }
    }

    @FXML
    private void clearNumericInput(ActionEvent event) {
        // Clear the text of the currently focused field
        if (usernameField.isFocused()) {
            clearField(usernameField);
        } else if (passwordField.isFocused()) {
            clearField(passwordField);
        }
    }

    // Helper method to append text to the active field
    private void appendToField(TextField field, String text) {
        String currentText = field.getText();
        String newText = currentText + text;
        field.setText(newText);
    }

    // Helper method to clear the text of the active field
    private void clearField(TextField field) {
        field.clear();
    }
}
