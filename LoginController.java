package application;
import application.Main;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LoginController implements Initializable {
	
	private Main main;
	
    @FXML
    private TextField EMAIL;
    
    @FXML
    private AnchorPane loginscreen;

    @FXML
    private PasswordField PASSWORD;
    
    @FXML
    private Button login;

    @FXML
    private Label create;
    
   
    @FXML
    void login(ActionEvent event) throws IOException{
    	
    	System.out.println("you clicked on login");
	
		  Parent root1=
		  FXMLLoader.load(getClass().getResource("/application/home.fxml")); Scene
		  login_scene= new Scene(root1); Stage login_stage=(Stage) ((Node)
		  event.getSource()).getScene().getWindow(); login_stage.hide();
		  login_stage.setScene(login_scene); login_stage.show();
		 
         
    }

    @FXML
    void signin(MouseEvent event) throws IOException{
    	
    	System.out.println("you clicked on sign in");
    	Parent root1= FXMLLoader.load(getClass().getResource("/application/create.fxml"));
 		Scene login_scene= new Scene(root1);
 		Stage login_stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
 		login_stage.hide();
 		login_stage.setScene(login_scene);
 		login_stage.show();
    
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	
		
	}
	


}
