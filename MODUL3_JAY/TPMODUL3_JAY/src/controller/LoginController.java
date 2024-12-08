package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.App;

public class LoginController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;

    public void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.equals("jay") && password.equals("1")) {
            App.setRoot("resources/inventory");
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Username atau Password salah!");
            alert.showAndWait();
        }
    }
}
