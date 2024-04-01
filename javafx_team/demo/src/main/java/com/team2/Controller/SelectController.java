package com.team2.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.team2.App;
import com.team2.Service.BoardService;
import com.team2.Service.BoardServiceImpl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SelectController implements Initializable {

    ListController LC = new ListController();

    @FXML
    private TextArea tContent;
    @FXML
    private TextField tNo;
    @FXML
    private TextField tTtile;
    @FXML
    private TextField tWriter;

    private BoardService boardService = new BoardServiceImpl();

    // 글 수정 완료 -> 목록
    @FXML
    void moveToUpdate(ActionEvent event) throws IOException {

        App.setRoot("board/list");
    }

    // 수정 취소 -> 목록
    @FXML
    void moveToList(ActionEvent event) throws IOException {
        App.setRoot("board/list");
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // int bno = LC.getBSN();
        // tNo.setText(Integer.toString(bno));

        // List<Board> boardList = boardService.list();
    }
}