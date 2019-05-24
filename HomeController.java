package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HomeController implements Initializable{

    @FXML
    private ImageView Image1;

    @FXML
    private Text Text1;

    @FXML
    private ImageView menu;

    @FXML
    private ImageView chat;

    @FXML
    private ImageView cam;

    @FXML
    private ImageView help;

    @FXML
    private Label username1;

    @FXML
    private ImageView Image2;

    @FXML
    private Text Text2;

    @FXML
    private Label username2;

    @FXML
    void camoption(MouseEvent event) {
    	
    
    }

    @FXML
    void chatoption(MouseEvent event) {

    }

    @FXML
    void helpoption(MouseEvent event) {

    }

    @FXML
    void menuoption(MouseEvent event) throws IOException {
    		
    	System.out.println("you clicked on menu ");
    	Parent root1= FXMLLoader.load(getClass().getResource("/application/menu.fxml"));
 		Scene login_scene= new Scene(root1);
 		Stage login_stage=(Stage)((Node) event.getSource()).getScene().getWindow();
 		login_stage.hide();
 		login_stage.setScene(login_scene);
 		login_stage.show();
    	
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
