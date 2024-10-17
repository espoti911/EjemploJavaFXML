package es.ieslosmontecillos.ejemplojavafxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    public PasswordField passwordField;
    @FXML
    public Text actiontarget;

    @FXML
    public void handleSubmitButtonAction(ActionEvent actionEvent)
    {
        actiontarget.setText("Sign in button pressed");
    }
}