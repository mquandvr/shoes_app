package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class LoginController implements Initializable{

	@FXML
    private Button btnLogin;

    @FXML
    private Text txtName;

    @FXML
    private PasswordField pfPassword;

    @FXML
    private TextField tfName;

    @FXML
    private Text txtPassword;
    
    @FXML
    void doLogin(ActionEvent event) {
    	if (tfName.getText().equals("Tung") && pfPassword.getText().equals("123")) {
    		
    	}
    }
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

}
