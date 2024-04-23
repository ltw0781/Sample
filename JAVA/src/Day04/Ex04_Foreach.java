package Day04;

public class Ex04_Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 
		String[] week = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		
		
		// foreach문은 조건을 중간에 바꿀수 없음. 무조건 처음부터 반복을 해야함.
		// foraech : ctrl + space
		// - for( 자료형 반복요소명 : 배열){}
		for (String day : week) {
			System.out.print(day + " "); // day : arr[i]
		}
		System.out.println();
		
		// 기본 for 문
		for (int i = 0 ; i < week.length;i++) {
			System.out.print(week[i] + " ");
		}
		System.out.println();
	}

}
