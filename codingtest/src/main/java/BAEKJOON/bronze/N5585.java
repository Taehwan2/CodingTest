package main.java.BAEKJOON.bronze;

import java.util.ArrayList;
import java.util.Scanner;

public class N5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {500,100,50,10,5,1};
        int C = sc.nextInt();
        C=1000-C;
        int answer =0 ;
            for (int i = 0; i < arr.length; i++) {
              answer += (C / arr[i]);
              C %= arr[i];
              if(C==0)break;
            }
        System.out.println(answer);
    }
}
