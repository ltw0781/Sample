package com.aloha.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aloha.springrest.dto.Board;
import com.aloha.springrest.service.BoardService;

import lombok.extern.slf4j.Slf4j;




/**
 *  /board 경로로 요청 왔을 때 처리
 * [GET] - /board/list   : 게시글 목록 화면
 * [GET] - /board/read   : 게시글 조회 화면
 * [GET] - /board/insert : 게시글 등록 화면
 * [POST] - /board/insert : 게시글 등록 처리
 * [GET] - /board/update : 게시글 수정 화면
 * [POST] - /board/update : 게시글 수정 처리
 * [POST] - /board/delete : 게시글 삭제 처리
 */
@Slf4j                              // 로그 어노테이션
@Controller                         // 컨트롤러 스프일 빈으로 등록
@RequestMapping("/board")           // 클레스 레벨 요청 경로 매핑 - /board 라고 경로가 시작되는 
public class BoardController {      // - /board/~ 경로의 요청은 이 컨트롤러에서 처리



    // Controller --> Service   (데이터 요청)
    // Controller --> Service   (데이터 전달)
    // Controller --> Model     (모델 등록)
    // View <-- Model           (데이터 출력)

    @Autowired                          // 의존성  자동 주입
    private BoardService boardService;  // @Service를 --Impl 에 등록해 놨기 때문에 가능

    /**
     * 게시글 목록 조회 화면
     * @return
     * @throws Exception 
     */
    @GetMapping("/list")
    public String list(Model model) throws Exception {
        // 데이터 요청
        List<Board> boardList = boardService.list();
        // 모델 등록
        model.addAttribute("boardList", boardList);
        // 뷰 페이지 지정
        return "/board/list";          // resources/templates/board/list.html
    }

    /**
     * 게시글 조회 화면
     * - /board/read?no=🙄
     * @param no
     * @return
     * @throws Exception 
     */
    // @RequestParam("파라미터명")
    // - 스프링 부트 3.2버전 이하, 생략해도 자동 매핑된다.
    // - 스프링 부트 3.2버전 이상, 필수로 명시해야 매핑된다.
    @GetMapping("/read")
    public String read(@RequestParam("no")/* 버전의 문제로 생략하지 */ int no, Model model) throws Exception {

        // 데이터 요청
        Board board = boardService.select(no);
        // 모델 등록
        model.addAttribute("board", board);
        // 뷰 페이지 지정
        return "/board/read";
    }

    /**
     * 게시글 등록 화면
     * @return
     */
    @GetMapping("/insert")
    public String insert() {
        return "board/insert";
    }
    

    /**
     * 게시글 등록 처리
     * @param entity
     * @return
     * @throws Exception 
     */
    @PostMapping("/insert")
    public String insertPro(Board board) throws Exception {
        // 데이터 요청
        int result = boardService.insert(board);
        // 리다이렉트
        // - 데이터 처리 성공
        if(result > 0) {
            return "redirect:/board/list";
        }
        // 데이터 처리 실패
        return "redirect:/board/insert?error";
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
        if (result > 0) {
            return "redirect:/board/list";
        }
        int no = board.getNo();
        return "redirect:/board/update?no=" + no + "&error";
    }
    
    @PostMapping("/delete")
    public String delete(@RequestParam("no") int no) throws Exception {
        int result = boardService.delete(no);
        if (result > 0) {
            return "redirect:/board/list";
        }
        return "redirect:/board/update?no=" + no + "&error";
    }
    
    
    
    
}
