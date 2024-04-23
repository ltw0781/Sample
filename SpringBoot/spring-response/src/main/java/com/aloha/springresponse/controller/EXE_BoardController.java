// package com.aloha.springresponse.controller;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Random;

// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;

// import com.aloha.springresponse.dto.Board;

// import lombok.extern.slf4j.Slf4j;


// @Slf4j
// @Controller
// @RequestMapping("/board")
// public class EXE_BoardController {

//     /**
//      * /board/list
//      * model : boardList
//      * @return
//      */
//     @GetMapping("/list")
//     public String list(Model model) {
//         log.info("[GET] - /board/list");

//         // 데이터 요청
//         List<Board> boardList = new ArrayList<>();
//         boardList.add(new Board("제목1","작성자1","내용1"));
//         boardList.add(new Board("제목2","작성자2","내용2"));
//         boardList.add(new Board("제목3","작성자3","내용3"));

//         // 모델 등록
//         model.addAttribute("boardList", boardList);

//         // 뷰 페이지 지정
//         return "/board/list";       // board/list.html 응답
//     }

//     /**
//      * 게시글 조회
//      * [GET]
//      * /board/read
//      * - model : board
//      * @param model
//      * @param no
//      * @return
//      */
//     @GetMapping("/read")
//     public String read(Model model, @RequestParam("no") int no) {
//         log.info("[GET] - /board/read");

//         // 데이터 요청
//         Board board = new Board("제목", "김은식", "내용");

//         // 모델 등록
//         model.addAttribute("board", board);

//         // 뷰 페이지 지정
//         return "/board/read";       // board/read.html 응답
//     }

//      /**
//      * 게시글 수정
//      * [GET]
//      * /board/update?no=?
//      * - model : board
//      * @param model
//      * @param no
//      * @return
//      */
//     @GetMapping("/update")
//     public String update(Model model, @RequestParam("no") int no) {
//         log.info("[GET] - /board/update");

//         // 데이터 요청
//         Board board = new Board("제목", "김은식", "내용");

//         // 모델 등록
//         model.addAttribute("board", board);

//         // 뷰 페이지 지정
//         return "/board/update";       // board/update.html 응답
//     }
    

//     /**
//      * 게시글 등록 화면
//      * @return
//      */
//     @GetMapping("/insert")
//     public String insert() {
//         log.info("[GET] - /board/insert");

//         // 뷰 페이지 지정
//         return "/board/insert";     // board/insert.html 응답
//     }



//     /**
//      * 게시글 등록 처리
//      * @param board
//      * @return
//      */
//     @PostMapping("/insert")
//     public String insertPro(Board board) {        
//         log.info("[POST] - /board/insert");
//         log.info(board.toString());

//         int result = new Random().nextInt(2);   // 0 또는 1

//         // 데이터 등록 실패
//         if( result == 0) 
//             return "redirect:/board/insert";

//         return "redirect:/board/list";
//     }


//     @PostMapping("/update/{no}")
//     public String updatePro(@PathVariable("no") int no, Board board) {        
//         log.info("[POST] - /board/update");
//         log.info(board.toString());

//         int result = new Random().nextInt(2);   // 0 또는 1

//         // 데이터 수정 실패
//         if( result == 0) 
//             return "redirect:/board/update";

//         return "redirect:/board/list";
//     }


//     @PostMapping("/delete/{no}")
//     public String deletePro(@PathVariable("no") int no, Board board) {        
//         log.info("[POST] - /board/delete");
//         log.info(board.toString());

//         int result = new Random().nextInt(2);   // 0 또는 1

//         // 데이터 삭제 실패
//         if( result == 0) 
//             return "redirect:/board/delete";

//         return "redirect:/board/list";
//     }

// }