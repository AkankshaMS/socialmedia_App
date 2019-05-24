package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MenuController {

    @FXML
    private HBox menu_icon_back;

    @FXML
    private Label profile;

    @FXML
    private Label friends;

    @FXML
    private Label closefriends;

    @FXML
    private Label exit;

    @FXML
    void back_to_home(MouseEvent event) throws IOException {

    	System.out.println("going back to home ");
    	Parent root1= FXMLLoader.load(getClass().getResource("/application/home.fxml"));
 		Scene login_scene= new Scene(root1);
 		Stage login_stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
 		login_stage.hide();
 		login_stage.setScene(login_scene);
 		login_stage.show();
    	
    }

    @FXML
    void closefriends(MouseEvent event) throws IOException {
    	System.out.println("you clicked on closefriends ");
    	Parent root1= FXMLLoader.load(getClass().getResource("/application/closefriends.fxml"));
 		Scene login_scene= new Scene(root1);
 		Stage login_stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
 		login_stage.hide();
 		login_stage.setScene(login_scene);
 		login_stage.show();

    }

    @FXML
    void exit(MouseEvent event) {
    	
    	System.exit(0);

    }

    @FXML
    void friends(MouseEvent event) throws IOException {
    	
    	System.out.println("you clicked on Friends ");
    	Parent root1= FXMLLoader.load(getClass().getResource("/application/friends.fxml"));
 		Scene login_scene= new Scene(root1);
 		Stage login_stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
 		login_stage.hide();
 		login_stage.setScene(login_scene);
 		login_stage.show();

    }

    @FXML
    void profile(MouseEvent event) throws IOException {
    	
    	System.out.println("you clicked on profile");
    	Parent root1= FXMLLoader.load(getClass().getResource("/application/profile.fxml"));
 		Scene login_scene= new Scene(root1);
 		Stage login_stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
 		login_stage.hide();
 		login_stage.setScene(login_scene);
 		login_stage.show();

    }

}
