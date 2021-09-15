package stackjava.cpm.helloworld;

import java.util.Scanner;

// Bài 1: Nhập vào các cạnh của một tam giác, xác định xem đó có phải một tam giác không, nếu là tam giác thì xác định xem là có các tính chất vuông, cân, đều hay không?


public class bài_tap_1_cua_buoi2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double edge[] = new double[3];
        for(int k = 0; k < 3; k++){
            edge[k] = sc.nextDouble();
        }
        if(edge[0] <= 0 || edge[1] <= 0 || edge[2] <= 0){
            System.out.println("không tồn tại tam giác có cạnh là giá trị âm hoặc bằng 0");
        }
        if(edge[0] + edge[1] > edge[2]){
            if(edge[0] == edge[1] && edge[0] == edge[2]){
                System.out.println("đây là tam giác đều");
            } else if (edge[0] == edge[1] || edge[0] == edge[2]  || edge[1] == edge[2]){
                System.out.println("đây là tam giác cân");
            } else if (Math.pow(edge[0],2) + Math.pow(edge[1],2) == Math.pow(edge[2],2)){
                System.out.println("tam giác này vuông tại điểm thứ 3");
            } else if (Math.pow(edge[0],2) + Math.pow(edge[2],2) == Math.pow(edge[1],2)){
                System.out.println("tam giác này vuông tại điểm thứ 2");
            } else if (Math.pow(edge[1],2) + Math.pow(edge[2],2) == Math.pow(edge[0],2)){
                System.out.println("tam giác này vuông tại điểm thứ 1");
            } else {
                System.out.println("đây là một tam giác thường");
            }
        } else {
            System.out.println("không tồn tại bất kì tam giác nào có 3 cạnh như bạn vừa nhập");
        }
    }
}
