package Day07_Review;

public class Ex02_ThreeSixNine {
	
	public static void main(String[] args) {
		
		/**
		정수 1~100까지 수를 반복하면
		 해당 수가 3 또는 6 또는 9가 될때
		 369의 개수 만큼 "*"을 출력하는 프로그램을 작성하시오.
		 ex) 3 ==>  "*"
		 33 --> "**"
		 45 --> 45
		
		 1. 정수를 1~100까지 출력
		 2. 해당 수가 369가 몇 개인지 판단인지 판단 (십의 자리가 369가 되는지, 일의자리가 369가 되는지 판단)
		 2-1. 
		 2-2. 
		 
		 3. 그 개수만큼 "*" 출력
		*/
		
		int N = 1;
		
		for (int i = 1 ; i <= 100 ; i++) {
			
			// 십의자리 수 : 해당수(i) / 10 (정수부분만)
			int ten = i / 10;
			
			
			// 일의자리 수 : 해당수(i) % 10
			int one = i % 10;
			
			// 어차피 논리 타입이라 조건을 따로 걸지 않아도 됨.
			boolean ten369 = ten != 0 && (ten % 3 == 0);
//			boolean ten369 = ten == 3 || ten == 6 || ten == 9;
			
			boolean one369 = (one != 0) && (one % 3 == 0);
//			boolean one369 = one == 3 || one == 6 || one == 9;
			
			if(ten369 && one369)
				System.out.println("**");
			else if (ten369 || one369)
				System.out.println("*");
			else
				System.out.println(i);
			

			
		}
		
		
		
	}

}
