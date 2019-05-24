package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Node;
public class MainController implements Initializable {
	
	@FXML
	private Button login;

    @FXML
    void login(ActionEvent event) throws IOException{
    	
    	
		System.out.println("you clicked on continue ");
		Parent root1= FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
		Scene login_scene= new Scene(root1);
		Stage login_stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
		login_stage.hide();
		login_stage.setScene(login_scene);
		login_stage.show();
		
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

	
}
