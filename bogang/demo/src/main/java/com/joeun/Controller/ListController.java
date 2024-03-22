package com.joeun.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.joeun.App;
import com.joeun.DTO.Board;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ListController implements Initializable {

@FXML
    public TableView<Board> boardTableView;
    
    @FXML
    public TableColumn<Board, Integer> colNo;
    @FXML
    public TableColumn<Board, String> colTitle;
    @FXML
    public TableColumn<Board, String> colWriter;
    @FXML
    public TableColumn<Board, String> colRegDate;
    @FXML
    public TableColumn<Board, String> colView;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        throw new UnsupportedOperationException("Unimplemented method 'initialize'");
    }

    @FXML
    void moveToInsert(ActionEvent event) throws IOException {
        App.setRoot("board/insert");
    }

}
