package _1500;

import java.util.Scanner;

//1501, 1502, 1508
public class _1503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		  순서도
		 */
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[][] = new int[N][N];
		int k = 1;
		
		for (int i = 0 ; i < arr.length ; i++) {
			for(int j = 0; j < arr[i].length ; j++) {
				arr[i][j] = k++;
			}
		}
		
		for (int i = 0 ; i < arr.length ; i++) {
			for (int j = 0 ; j < arr.length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
