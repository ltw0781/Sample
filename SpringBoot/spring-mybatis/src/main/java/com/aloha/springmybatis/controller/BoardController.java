package com.aloha.springmybatis.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aloha.springmybatis.dto.Board;
import com.aloha.springmybatis.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    

        /**
     * 게식글 등록
     * [GET]
     * /board/insert
     * @return
     */
    @GetMapping("/insert")
    public String insert() {
        log.info("[GET] - /board/insert");

        return "/board/insert";
    }

    /**
     * 등록 처리
     * @param board
     * @return
     * @throws Exception 
     */
    @PostMapping("/insert")
    public String insertPro(Board board) throws Exception{
        log.info("[POST] - /board/insert");
        log.info(board.toString());

        int result = boardService.insert(board);   // 0또는 1
        // 데이터 등록 실패
        if(result == 0)
            return "redirect:/board/insert";

        return "redirect:/board/list";
    }

    /**
     * 게시글 목록
     * /board/list
     * model : boardList
     * @return
     * @throws Exception 
     */
    @GetMapping("/list")
    public String list(Model model) throws Exception {
        log.info("[GET] - /board/list");

        // 데이터 요청
        List<Board> boardList = boardService.list();

        // 모델 등록
        model.addAttribute("boardList", boardList);

        // 뷰페이지 지정
        return "/board/list";               // /board/list.html
    }

    /**
     * 게시글 조회
     * [GET]
     * /board/update?no=?
     * @param model
     * @param no
     * @return
     * @throws Exception 
     */
    @GetMapping("/read")
    public String read(Model model, @RequestParam("no") int no) throws Exception {
        log.info("[GET] - board/read");

        // 데이터 요청
        Board board = boardService.select(no);

        // 모델 등록
        model.addAttribute("board", board);

        // 뷰 페이지 지정
        return "/board/read";
    }






    /**
     * 게시글 수정
     * [GET]
     * /board/update?no=?
     * @param model
     * @param no
     * @return
     * @throws Exception 
     */
    @GetMapping("/update")
    public String update(Model model, @RequestParam("no") int no) throws Exception {
        log.info("[GET] - board/update");

        // 데이터 요청
        Board board = boardService.select(no);

        // 모델 등록
        model.addAttribute("board", board);

        // 뷰 페이지 지정
        return "/board/update";
    }

    /**
     * 게시글 수정 처리
     * @param board
     * @return
     * @throws Exception 
     */
    @PostMapping("/update")
    public String updatePro(Board board) throws Exception{
        log.info("[POST] - /board/update");
        log.info(board.toString());

        int result = boardService.update(board);
        // 데이터 수정 실패
        if(result == 0)
            return "redirect:/board/update?no=" + board.getNo();

        // 데이터 수정 성공
        return "redirect:/board/list";
    }
    



    @PostMapping("/delete")
    public String deletePro(@RequestParam("no") int no) throws Exception {
        log.info("[POST] - /board/delete");
        // int no = board.getNo();
        log.info(no + "번 글을 삭제 합니다.");

        int result = boardService.delete(no);

        if(result == 0)
            return "redirect:/board/update?no=" + no;
        return "redirect:/board/list";
    }
}