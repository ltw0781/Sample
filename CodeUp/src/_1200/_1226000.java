package _1200;

import java.util.Scanner;

/**
 *  0. 이번주 로또번호 호출
 *  1. 내가 찍은 로또번호를 순서대로 입력한다 입력한다.
 *  2. 배열 앞에 적은 번호를 순서대로 이번주 로또번호와 비교 한다 --> 비교대상은 항상 처음부터 비교해 나간다
 *  3. 맞춘 갯수에 따라 등수와 꽝 출력 
 */



public class _1226000 {
	
	public static void main(String[] args) {
//		
//
//		int arr[];
//		arr = new int[7];
//		
//		arr[0] = 13;
//		arr[1] = 23;
//		arr[2] = 24;
//		arr[3] = 35;
//		arr[4] = 40;
//		arr[5] = 45;
//		arr[6] = 7;
//		
//		System.out.println("로또 번호는 : " + arr[0]  + " 입니다.");
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
		

//package _1000;

//import java.util.Scanner;
//public class _1226 {
//   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int count = 0;
      int bonus = 0;


//------------------ 계산 ------------------
 //- 1. lottoList[i] 정수형 배열을 생성
 //- 2. i rk 7보다 작으면 1씩 증가 하고 7보다 크면 정지 ---> lottoList[6] 으로 배열이 만들어짐
      int[] lottoList = new int[7];
      for (int i = 0; i < 7; i++) {
         lottoList[i] = sc.nextInt();
      }


//1. 같은 값으로 내가 입력하는 lottoList[]  --> myList[] 가 6보자 작은값 myList[5]라는 배열이 만들어짐
      int[] myList = new int[6];
      for (int i = 0; i < 6; i++) {
         myList[i] = sc.nextInt();
      }

//----------------      
  //1. int num 안에서 myList 배열을 처음부터 끝날때까지 반복하여라    
      for (int num : myList) {
         
         //1. num2 안에서 lottoList 배열을 처음부터 반복하여라
         //→ lottoList : 즉 lottoList[0]이 num2와 같으면 다음으로 넘어가라
         //→ 
         for (int num2 : lottoList) {
            if(num2==lottoList[6]) continue;
            if (num2 == num) {
               count++;
            }
         }
         if(num==lottoList[6]) bonus=1;
      }
      switch (count) {
      case 3:
         System.out.println("5");
         break;
      case 4:
         System.out.println("4");
         break;
      case 5:
         if(bonus==1) {
            System.out.println("2");
            break;
         }
         System.out.println("3");
         break;
      case 6:         
         System.out.println("1");
         break;

      default:
         System.out.println("0");
         break;
      }

      sc.close();
   }

}

		
		
		
		
		
		
//	}
//
//}
