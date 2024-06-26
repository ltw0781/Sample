package com.aloha.springmybatis2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aloha.springmybatis2.dto.Board;
import com.aloha.springmybatis2.service.BoardService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/list")
    public String list(Model model) throws Exception {
        // 데이터 요청
        List<Board> boardList = boardService.list();
        // 모델 등록
        model.addAttribute("boardList", boardList);
        return "board/list";
    }

    @GetMapping("/read")
    public String read(@RequestParam("no") int no, Model model) throws Exception {

        Board board = boardService.select(no);
        
        model.addAttribute("board", board);

        return "/board/read";
    }

    @GetMapping("/insert")
    public String insert() {
        return "/board/insert";
    }

    @PostMapping("/insert")
    public String insertPro(Board board) throws Exception {
        int result = boardService.insert(board);

        if (result > 0) {
            return "redirect:/board/list";
        }
        int no = board.getNo();
        return "redirect:/board/insert?no=" + no + "&error";
    }
    

    @GetMapping("/update")
    public String update(@RequestParam("no") int no, Model model) throws Exception {

        Board board = boardService.select(no);

        model.addAttribute("board", board);

        return "/board/update";
    }

    @PostMapping("/update")
    public String updatePro(Board board) throws Exception {


        int result = boardService.update(board);
        
        if ( result > 0 ) {
            return "redirect:/board/list";
        }
        int no = board.getNo();
        return "redirect:/board/update?no=" + no + "&error";
    }
    
    
    


    
    

}
