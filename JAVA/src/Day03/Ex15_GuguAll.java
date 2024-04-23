package Day03;

public class Ex15_GuguAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//구구단 1단 부터 9단 까지 출력 하시오.
		
		
		//중첩 반복문
		// A X B
		// i : 단(A)
		for (int i = 1 ; i <= 9 ; i++) {
			
			//J : 곱(B)
			for (int j = 1 ; j <= 9 ; j++) {
				System.out.print(i + "*" + j + "=" + (i*j));
				System.out.print("\t"); //탭(공백)
			}
			System.out.println();//한단 끝 ---다음줄로
		}

	}

}
