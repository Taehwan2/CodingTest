package main.java.BAEKJOON.bronze;

import java.util.ArrayList;
import java.util.Scanner;

public class N2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {25,10,5,1};
        int N = sc.nextInt();
        StringBuilder result = new StringBuilder(); // 결과를 저장할 StringBuilder
        while (N-- > 0) {
            int C = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                list.add(C / arr[i]);
                C %= arr[i];
            }
            for (int num : list) {
                result.append(num).append(" "); // StringBuilder에 결과 추가
            }
            result.append("\n"); // 줄바꿈 추가
        }
        System.out.print(result); // 최종 결과 출력
    }
}