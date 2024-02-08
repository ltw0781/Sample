package Day03;

import java.util.Scanner;

public class Ex11_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//메뉴판
		// 변수 선언 : 메뉴번호, 메뉴이름
		
		int menuNo = 0;
		int a = 0;
		String menuName = "";
		Scanner sc = new Scanner(System.in);
		
		//do~while문 에서 break을 적용하면 제어문만 탈출, return문믈 적용하면 하단조건문을 실행 안함
		// : 무조건 1회는 실행 후, 조건을 검사하여 반복하는 문장
		do {
			System.out.println("########## 메뉴판 ##########");
			System.out.println("1. 맥도날드");
			System.out.println("2. 법대생김밥");
			System.out.println("3. 돈까스");
			System.out.println("4. 짜장면");
			System.out.println("5. 물만난면");
			System.out.println("0. 종료");
			System.out.print("메뉴 번호 : ");
			
			// 메뉴 번호 입력
			menuNo = sc.nextInt();
			
			// 방법1
			// break : 제어문을 탈출
			if(menuNo == 0) break;
			
			// 방법2
			// return은 현제 실행중인 메소드를 종료 시킨다. 메모리 공간도 해제 값을 메소드를 호출하는 곳으로 반환 해준다.
			// return 값
			// 2. 메소드를 종료
			// 2. 메모리 공간 해제
			// 3. (값) 메소드를 호출한 곳으로 반환
			
//			if(menuNo == 0) return;
			
			switch(menuNo) {
			case 1 : menuName = "맥도날드"; break;			
			case 2 : menuName = "법대생김밥"; break;			
			case 3 : menuName = "돈까스"; break;			
			case 4 : menuName = "짜장면"; break;			
			case 5 : menuName = "물만난면"; break;
			default: break;
			}
			
			// 메뉴번호 유효성 검사
			// 방법1 - 메뉴번호가 0~5 번만 유효
			// 방법2 - 0번(종료)만 아니면 유효
			// 방법3 - 1~5번 유효, 그 이외 유효x
			
			// if(menuNo >= 0 && menuNo <= 5)
			
			if(menuNo >= 1 && menuNo <= 5) {
				a++;
				System.out.println(menuName + "(을/를) 먹었습니다.");
				// if(!=)
			}
			else
				System.out.println("(0~5)번 사이의 번호를 입력해주세요.");
//			System.out.println(menuName + "(을/를) 먹었습니다.");
		} while (menuNo != 0);
		
		
		// 주문한 메뉴의 개수를 출력해주세요.
		System.out.println(a + " 개의 메뉴를 주문하였습니다.");
		System.out.println("메뉴판을 종료합니다.");
		sc.close();
		

		

	}

}
