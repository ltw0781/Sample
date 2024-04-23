package com.aloha.springrequest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aloha.springrequest.dto.Board;

import lombok.extern.slf4j.Slf4j;

/**
 *  게시판 컨트롤러
 * - 게시글 목록            - [GET]     - /board
 * - 게시글 조회            - [GET]     - /board/10
 * - 게시글 등록 처리       - [POST]    - /board
 * - 게시글 수정 처리       - [PUT]     - /board
 * - 게시글 삭제 처리       - [DELETE]  - /board?no=10
 */
@Slf4j              // 로그 사용 어노테이션
// @Controller
@RestController     // Controller + @ResponseBody 
@RequestMapping("/board")
public class BoardController {

    /**
     * 게시글 목록
     * [GET]
     * /board
     * - response :  boardList
     * @return
     * @throws Exception
     */
    @GetMapping(value="")
    public ResponseEntity<List<Board>> list() throws Exception {
        log.info("[GET] - /board");

        List<Board> boardList = new ArrayList<>();
        boardList.add(new Board("제목1", "작성자1", "내용1"));
        boardList.add(new Board("제목2", "작성자2", "내용2"));
        boardList.add(new Board("제목3", "작성자3", "내용3"));

        // new ResponseEntity<>(데이터(컨텐츠), 응답상태코드);
        return new ResponseEntity<>(boardList, HttpStatus.OK);
    }


    /**
     * 게시글 조회
     * [GET] 
     * /board
     * - response :  board
     * @param model
     * @param no
     * @return
     * @throws Exception
     */
    @GetMapping(value="/{no}")
    public ResponseEntity<Board> read(@PathVariable int no) throws Exception {
        log.info("[GET] - /board/{no}");

        Board board = new Board("제목1", "작성자1", "내용1");    

        return new ResponseEntity<>(board, HttpStatus.OK);
    }


    /**
     * 게시글 쓰기 처리
     * [POST]
     * /board
     * - response : 
     * ✅ 요청 성공 : 200 OK            "SUCCESS"  
     * ❌ 요청 실패 : 400 Bad Request   "FAIL"
     * @param board
     * @return
     * @throws Exception
     */
    @PostMapping(value="")
    public ResponseEntity<String> insertPro(Board board) throws Exception {
        int result = new Random().nextInt(2);

        if( result == 0 ) {
            return new ResponseEntity<>("FAIL", HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }
    
    /**
     * 게시글 수정 처리
     * [PUT]
     * /board
     * - response : 
     * ✅ 요청 성공 : 200 OK            "SUCCESS"  
     * ❌ 요청 실패 : 400 Bad Request   "FAIL"
     * @param board
     * @return
     * @throws Exception
     */
    @PutMapping(value="")
    public ResponseEntity<String> updatePro(Board board) throws Exception {
        int result = new Random().nextInt(2);

        if( result == 0 ) {
            return new ResponseEntity<>("FAIL", HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }

    /**
     * 게시글 삭제 처리
     * [DELETE]
     * /board
     * - response : 
     * ✅ 요청 성공 : 200 OK            "SUCCESS"  
     * ❌ 요청 실패 : 400 Bad Request   "FAIL"
     * @param no
     * @return
     * @throws Exception
     */
    @DeleteMapping(value="")
    public ResponseEntity<String> deletePro(int no) throws Exception {
        int result = new Random().nextInt(2);

        log.info("삭제할 게시글 번호 - no" + no);

        if( result == 0 ) {
            return new ResponseEntity<>("FAIL", HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }
    
    
    
}
