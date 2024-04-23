package _1400;
import java.util.Scanner;
public class _1442 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int temp;
		
		int arr[] = new int[N];
		
		
		// 입력
		for (int i = 1 ; i <= N ; i++) {
			arr[i] = sc.nextInt();
		}
		// 출력
		for (int i = 0 ; i < N ; i++) {
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);
			System.out.println(arr[4]);
		}
		
		
	}
	
}
