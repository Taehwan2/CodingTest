package main.java.BAEKJOON.bronze;


import java.util.ArrayList;
import java.util.Scanner;

public class N10162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {300,60,10};
            int C = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            if(C%10!=0) {
                System.out.println("-1");
            }
            else {
                for (int i = 0; i < arr.length; i++) {
                    list.add(C / arr[i]);
                    C %= arr[i];
                }
                for (int num : list) {
                    System.out.print(num+" ");
                }

            }
        }

}