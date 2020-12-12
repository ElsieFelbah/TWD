package com.company;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.TableColumn;

import javax.swing.*;

public class EntryController implements Initializable {

        @FXML
        private TableView<Product> tblProducts;

        @FXML
        private TableColumn<Product,String> pdName;

        @FXML
        private TableColumn<Product,Integer> pdQnty;

        @FXML
        private TableColumn<Product,Float> pdPrice;

        @FXML
        private JTextField txtName;

        @FXML
        private JTextField txtQnty;

        @FXML
        private JTextField txtPrice;

        @FXML
        private JButton btnSave;

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        void initialize() {

        }

        PreparedStatement preparedStatement;
        Connection connection;

        public void btnSave(ActionEvent actionEvent) throws SQLException{
                ConnectionClass connectionClass = new ConnectionClass();
                Connection connection = connectionClass.getConnection();

                String sql = "INSERT INTO PRODUCT (pd_name, pd_quantity, pd_price)" + "VALUES(?,?,?)";
                preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
                preparedStatement.setString(1, txtName.getText());
                preparedStatement.setString(2, txtQnty.getText());
                preparedStatement.setString(3, txtPrice.getText());
                //preparedStatement = connection.createStatement();
                preparedStatement.executeUpdate(sql);
        }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    //link between controller and db
        //Connection connection;
        //public EntryController() {
                //connection = ConnectionClass.conDB();
        //}
}


