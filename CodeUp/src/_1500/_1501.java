package _1500;

import java.util.Scanner;

//1501, 1502, 1508
public class _1501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
			for(int j = 0; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");	
			}
			System.out.println();
		}
		sc.close();
	}

}
