package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ProfileController {

    @FXML
    private TextArea userbio;

    @FXML
    private Button back;

    @FXML
    private Label username;

    @FXML
    private ImageView img1;

    @FXML
    private ImageView img2;

    @FXML
    void profile_to_home(MouseEvent event) throws IOException {
    	
    	System.out.println("you clicked on sign in ");
    	Parent root1= FXMLLoader.load(getClass().getResource("/application/home.fxml"));
 		Scene login_scene= new Scene(root1);
 		Stage login_stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
 		login_stage.hide();
 		login_stage.setScene(login_scene);
 		login_stage.show();

    }

}
