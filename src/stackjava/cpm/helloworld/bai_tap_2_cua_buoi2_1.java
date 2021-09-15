package stackjava.cpm.helloworld;

import java.util.Scanner;

// Bài 2: Cho một số n và x (n>x). n! chia hết cho x^y. In ra y lớn nhất có thể


public class bai_tap_2_cua_buoi2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int giaiThua = sc.nextInt();
       for(int i = giaiThua - 1; i >= 1 ;i--) {
           giaiThua *= i;
       }
       int x = sc.nextInt();
       int count = 0;
       for(int y = 0; y < 999; y++){
           if (Math.pow(x,y) >= giaiThua) {
               break;
          } else if (Math.pow(x, y) < giaiThua) {
               if (giaiThua % Math.pow(x, y) != 0) {
                   break;
               } else if (giaiThua % Math.pow(x, y) == 0){
                   y += 1;
                   count = y;
               }
           }
       }
        System.out.println(count);
    }
}