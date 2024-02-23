package Day16.Board.Service;

import java.util.List;

import Day16.Board.DTO.Board;


/**
 *  목록
 *  
 *  조회
 *  등록
 *  수정
 *  삭제
 */


public interface BoardService {
	
	
//	 목록
	 List<Board> list(); 
//	 조회
	 Board select(int no);
	// *  등록
	 int insert(Board board);
	 
	 //*  수정
	 int update(Board board);
	 
	 //*  삭제
	 
	 int delete(int no);
	 
	

}
