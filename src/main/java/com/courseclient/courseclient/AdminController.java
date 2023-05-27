package com.courseclient.courseclient;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminController {
    @FXML
    private TextField login;

    @FXML
    private TextField password;

    @FXML
    private Button submit;

    @FXML
    protected void onConnectToServer(ActionEvent event) throws IOException {
        if((login == null || login.getText().isEmpty()) || (password == null || password.getText().isEmpty())){
            System.out.println("Логин или пароль не введен!");
        }else {
            System.out.println("Connection to server... " + login.getText() + "  " + password.getText());
            if(connect()){
                Stage stage;
                Parent root;

                if(event.getSource()==submit){
                    stage = (Stage) submit.getScene().getWindow();
                    root = FXMLLoader.load(getClass().getResource("admin-view.fxml"));
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }
            }
        }
    }

    private boolean connect(){
        return true;
    }
}