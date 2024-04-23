package _1400;

import java.util.Scanner;

public class _1443_1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[] = new int[n + 1];

      
      
      
      for (int i = 1; i <= n; i++) {
         a[i] = sc.nextInt();
      }

      for (int i = 2; i <= n; i++) {
         int key = a[i];
         for (int j = i - 1; j >= 1; j--) {
            if (a[j] > key) {
               a[j + 1] = a[j];
               a[j] = key;
            }else {
               break;
            }
         }
      }

      for (int i = 1; i <= n; i++) {
         System.out.println(a[i]);
      }
      
      
//      for (int i : a) {
//         System.out.println(i);
//      }

      sc.close();
   }
}