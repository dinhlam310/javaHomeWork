package stackjava.cpm.helloworld;

import java.util.Scanner;

public class bai_tap_2_cua_buoi2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int giaiThua = sc.nextInt();
       int x = sc.nextInt();
       for(int i = giaiThua - 1; i >= 1 ;i--) {
           giaiThua *= i;
       }
       for(int y = 1; y < 999; y++){
           if (Math.pow(x,y) < giaiThua) {
               if (giaiThua % Math.pow(x, y) == 0) {
                   y += 1;
               }
           } else if (Math.pow(x, y) >= giaiThua) {
               break;
           }
           System.out.println(y);
       }
    }
}