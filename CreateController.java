package application;
//import java.awt.EventQueue;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.Wrapper;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CreateController {

    @FXML
    private TextField Name;

    @FXML
    private TextField Email;

    @FXML
    private DatePicker DOB;

    @FXML
    private PasswordField Password;

    @FXML
    void Main(ActionEvent event) throws IOException {
    	
    	System.out.println("you clicked on sign up");
    	String IQuery = "INSERT INTO signup('name','email','dob','password')"+ "VALUES (Name,Email,DOB,Password)";
		System.out.println(IQuery);//print on console
		System.out.println("Connecting to a selected database...");
		//public static void main(String[] args) {
			Connection conn;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Connecting to a selected database...");
	    		conn = DriverManager.getConnection("jdbc:mysql://localhost/smapp","root","Akankshamakam99");
	    		System.out.println("Connected database successfully...");
	    		((Connection)conn).createStatement().execute(IQuery);
				((java.sql.Connection)conn).close();
	    		
			}
			catch(SQLException se) 
	    	{
				
				se.printStackTrace();
	    	}
			catch(Exception e) {
				e.printStackTrace();
			}
			/*finally {
				try {
					if(conn!=null)
						conn.close();
				}
				catch(SQLException se) {
					se.printStackTrace();
				}
			}
			try {
			((Connection)conn).createStatement().execute(IQuery);
			((java.sql.Connection)conn).close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}*/
			
		Parent root1= FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
		Scene login_scene= new Scene(root1);
		Stage login_stage=(Stage) ((Node) event.getSource()).getScene().getWindow();
		login_stage.hide();
		login_stage.setScene(login_scene);
		login_stage.show();

    }

}