package com.example.tarik;

import data.Ticket;
import database.Delete;
import database.Select;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ResourceBundle;

public class Menu2 implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    TableView<Ticket> TicketTable;
    @FXML
    TableColumn<Ticket,String> TicketName= new TableColumn<>();
    @FXML
    TableColumn<Ticket,String> TicketType = new TableColumn<>();
    @FXML
    TableColumn<Ticket,String> TicketTime = new TableColumn<>();
    @FXML
    TableColumn<Ticket,String> TicketTransport = new TableColumn<>();
    @FXML
    TableColumn<Ticket,String> TicketMeal = new TableColumn<>();
    @FXML
    TableColumn<Ticket,Integer> TicketCost = new TableColumn<>();
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        TicketName.setCellValueFactory(new PropertyValueFactory<Ticket,String>("name"));
        TicketType.setCellValueFactory(new PropertyValueFactory<Ticket,String>("type"));
        TicketTime.setCellValueFactory(new PropertyValueFactory<Ticket,String>("time"));
        TicketTransport.setCellValueFactory(new PropertyValueFactory<Ticket,String>("transport"));
        TicketMeal.setCellValueFactory(new PropertyValueFactory<Ticket,String>("meal"));
        TicketCost.setCellValueFactory(new PropertyValueFactory<Ticket,Integer>("cost"));
    }
    public void LogOut(ActionEvent event) throws IOException
    {
        Delete delete = new Delete();
        delete.ActUser();
        root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Help");
        stage.setScene(scene);
        stage.show();
    }
    public void Help(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Help");
        alert.setHeaderText("Тут вирішується доля людства");
        alert.setContentText("Do you need help?");
        if(alert.showAndWait().get() == ButtonType.OK)
        {
            root = FXMLLoader.load(getClass().getResource("Help2.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("Help");
            stage.setScene(scene);
            stage.show();
        }
    }
    public void Return(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("Menu2.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Help");
        stage.setScene(scene);
        stage.show();
    }
    public void SelectTicket(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("SelectTicket.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Help");
        stage.setScene(scene);
        stage.show();
    }
    public void SortByCost(ActionEvent event) throws IOException
    {
        Select select = new Select();
        ObservableList<Ticket> list = select.SortByC();
        TicketTable.setItems(list);
    }
    public void SortByType(ActionEvent event) throws IOException
    {
        Select select = new Select();
        ObservableList<Ticket> list = select.SortByT();
        TicketTable.setItems(list);
    }
    public void SortByTransport(ActionEvent event) throws IOException
    {
        Select select = new Select();
        ObservableList<Ticket> list = select.SortByTr();
        TicketTable.setItems(list);
    }
    public void SelectTick(ActionEvent event) throws IOException
    {
        Select select = new Select();
        int Id = TicketTable.getSelectionModel().getSelectedIndex();
        Ticket ticket = TicketTable.getItems().get(Id);
    }
}
