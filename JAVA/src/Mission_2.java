import java.util.Scanner;

/**
 *  정수 N을 입력 받는다.
 *  정수 N의 값이 홀수 이면
 *  1 ~ 10 까지의 정수중에 홀수인 값
 *  1, 3, 5, 7, 9의 값을 출력하여 다 더한다.
 *  정수 N의 값이 짝수 이면
 *  1 ~ 10 까지의 정수중에 짝수인 값
 *  2, 4, 6, 8, 10의 값을 출력하여 다 더한다
 *  마지막으로 N의 약수만 출력한다
 */

public class Mission_2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum1 = 0,sum2 = 0;
		
		
		//짝수
		for(int i=1;i<=N;i++) {		
			if(i%2==1) {
				sum1+=i;
				System.out.print(i+"+");
			}
		}
		System.out.println(sum1);
		
		
		//홀수
		for(int i=1;i<=N;i++) {			
			//짝수
			if(i%2==0) {
				sum1+=i;
				System.out.print(i+"+");
			//홀수	
			}else {
				sum2=+i;
//				System.out.print(i);
			}
		}
		
		
		
		System.out.println();
		// 약수
		for(int i=1;i<=N;i++) {	
			if(N%i==0) {
				System.out.print(i+" ");
			}			
		}
		
	}
}
