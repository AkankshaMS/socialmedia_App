
package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;

public class FriendController implements Initializable {

    @FXML
    private Button BACK;

    @FXML
    private Label USER;

    @FXML
    private ToggleButton SWITCH;

    @FXML
    void friends_to_home(ActionEvent event) throws IOException {
    	System.out.println("goig back to home  ");
    	Parent root1= FXMLLoader.load(getClass().getResource("/application/home.fxml"));
 		Scene login_scene= new Scene(root1);
 		Stage login_stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
 		login_stage.hide();
 		login_stage.setScene(login_scene);
 		login_stage.show();
    }

    @FXML
    void set_close_friend(ActionEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
