package com.example.tarik;

import database.Delete;
import database.Insert;
import database.Select;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    TextField textField;
    @FXML
    TextField textField1;
    public void exit(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("Тут вирішується доля людства");
        alert.setContentText("Do you want to exit?");
        if(alert.showAndWait().get() == ButtonType.OK)
        {
            System.out.println("You are exited");
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.close();
        }
    }
    public void Help(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Help");
        alert.setHeaderText("Тут вирішується доля людства");
        alert.setContentText("Do you need help?");
        if(alert.showAndWait().get() == ButtonType.OK)
        {
            root = FXMLLoader.load(getClass().getResource("Help.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("Help");
            stage.setScene(scene);
            stage.show();
        }
    }
    public void Return(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Help");
        stage.setScene(scene);
        stage.show();
    }
    public void SignUp(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Help");
        stage.setScene(scene);
        stage.show();
    }
    public void Submit(ActionEvent event) throws IOException
    {
        String login = textField.getText();
        String password = textField1.getText();
        Select select = new Select();
        if(!select.SelectUser(login,password))
        {
            Insert insert = new Insert();
            insert.User(login,password);
            System.out.println("Gut");
        }
    }
    public void LogIn(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Help");
        stage.setScene(scene);
        stage.show();
    }
    public void Login(ActionEvent event) throws IOException
    {
        String login = textField.getText();
        String password = textField1.getText();
        Select select = new Select();
        Insert insert = new Insert();
        Delete delete = new Delete();
        if(select.SelectUser(login,password))
        {
            delete.ActUser();
            insert.ActUser(login,password);
            root = FXMLLoader.load(getClass().getResource("Menu2.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("Help");
            stage.setScene(scene);
            stage.show();
        }
    }
}