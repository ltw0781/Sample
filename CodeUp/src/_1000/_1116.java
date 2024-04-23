package _1000;
/**
 * 두 정수를 입력받아 아래와 같이 출력하시오.
 * 
 */
import java.util.Scanner;

public class _1116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.두 정수 입력
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
				
		
		// 2.덧셈/뺄셈/곱셈/나눗셈 결과 구하기
		// 3. 출력 양식에 맞게 출력
		// 
		// 
		// 
		// 
		
		
		// scanner
		//Scanner sc = new Scanner(System.in);
			//int a = 10;// = sc.nextInt();
			//int b = 20;// = sc.nextInt();
			
			//int avg = (a + b + c) / 3;
			
			
			
			int var1 = a + b;
			int var2 = a - b;
			int var3 = a * b;
			int var4 = a / b;
			
			System.out.println(a + "+" + b + "=" + var1);
			System.out.println(a + "-" + b + "=" + var2);
			System.out.println(a + "*" + b + "=" + var3);
			System.out.println(a + "/" + b + "=" + var4);
		

	}

}
