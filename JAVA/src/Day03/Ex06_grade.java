package Day03;

import java.util.Scanner;

public class Ex06_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//학점을 입력받아, 점수대를 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학점 : ");
		String grade = sc.next();  //string (문자열) 참조 자료형
		
		switch (grade) {
		case "A" : System.out.println("90~100점입니다.");
		break;
		case "B" : System.out.println("80~89점입니다.");
		break;
		case "C" : System.out.println("70~79점입니다.");
		break;
		case "D" : System.out.println("60~69점입니다.");
		break;
		case "F" : System.out.println("60점 미만입니다.");
		break;
		default: System.out.println("A~F 사이의 문자를 입력해주세요.");
		break;
		}
		sc.close();
	}

}
