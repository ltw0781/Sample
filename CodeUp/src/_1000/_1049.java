package _1000;

import java.util.Scanner;

public class _1049 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b) {
			System.out.println(1);
		}
		else if(a <= b) {
			System.out.println(0);
		}
		sc.close();
	}

}
