package Day03;

public class Ex09_Whilesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1부터 100까지의 합계를 구하시오.
		// 1+2+3+4+....+100 = 5050
		int a = 1;
		int sum = 0;
		
		while(a <= 100) {
			sum = sum + a++;
			
			// 방법 2
//			sum = sum + a;
//			a = a + 1;
			// 방법 3
//			sum += a++;
			System.out.println("합계 : " + sum);
		}

	}

}
