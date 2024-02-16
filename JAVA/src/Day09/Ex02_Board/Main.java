package Day09.Ex02_Board;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
//		System.out.println("==== 게시판 ====");
		
		BoardInterface boardInterface = new BoardAccess();
		Scanner sc = new Scanner(System.in);
		int menuNo;
		
		do {
			System.out.println("==== 게시판 ====");
			System.out.println("1. 게시글 목록");
			System.out.println("2. 게시글 등록");
			System.out.println("3. 게시글 조회");
			System.out.println("4. 게시글 수정");
			System.out.println("5. 게시글 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			
			menuNo = sc.nextInt();
			sc.nextLine();  // 엔터를 입력버퍼에서 제거
			
			switch(menuNo) {
			case 1: //게시글 목록
							Board[] boardList = boardInterface.list();
							for(Board board : boardList) {
								System.out.println(board);
							}
							break;
				
			case 2: //게시글 등록
				System.out.print("제목 : ");
				String title = sc.nextLine();
				System.out.print("작성자 : ");
				String writer = sc.nextLine();
				System.out.print("내용 : ");
				String content = sc.nextLine();
				
				Board board = new Board(title, writer, content);
				Board createdBoard = boardInterface.create(board);
				
				if( createdBoard != null ) {
					System.out.print("생성된 게시글 정보 : ");
					System.out.println(createdBoard);
				}
				break;
				
			case 3: // 게시글 조회
				System.out.print("조회할 글 번호 : ");
				int no = sc.nextInt();
				sc.nextLine();
				Board setlectedBoard = boardInterface.read(no);
				if(setlectedBoard != null) {
					System.out.print("조회된 게시글 정보 : ");
					System.out.println(setlectedBoard);
					
				}
				break;
			case 4: // 게시글 수정
				/**
				 *  1. 글 목록 조회
				 *  2. 삭제할 글 번호 입력
				 *  3. 입력된 번호의 위치에 게시글이 확인
				 *  4. 게시글 목록에 게시글이 존재하면 게시글 삭제
				 */
				// 수정할 게시글 번호, 수정 게시글 정보 입력
				
				System.out.print("수정할 글 번호 : ");
				int updateNo = sc.nextInt();
				sc.nextLine();  // 엔터 제거
				System.out.print("제목 : ");
				String updateTitle = sc.nextLine();
				System.out.print("작성자 : ");
				String updateWriter = sc.nextLine();
				System.out.print("내용 : ");
				String updateContent = sc.nextLine();
				
				Board updateBoard = new Board(updateTitle, updateWriter, updateContent);
				updateBoard.setNo(updateNo); // 게시글 번 지정
				int result = boardInterface.update(updateBoard);
				if (result > 0){
					System.out.println("게시글 수정을 완료하였습니다.");
				} else {
					System.out.println("게시글 수정에 실패하였습니다.");
				}
				break;
					
					
					
				
				
				
				
			case 5: // 게시글 삭제
					// 삭
				System.out.println("삭제할 글 번호 : ");
				int deleteNo = sc.nextInt();
				sc.nextLine();
				result = boardInterface.delete(deleteNo);
				if(result > 0) {
					
					System.out.println("게시글 삭제를 완료하였습니다.");
					
				}else {
					System.out.println("게시글 수정에 실패하였습니다.");
				}
				
				
				default:
							break;
							
			
			}
			
			
			
			
			
		} while (menuNo != 0);
		System.out.println("프로그램이 종료됩니다...");
		
	}

}
