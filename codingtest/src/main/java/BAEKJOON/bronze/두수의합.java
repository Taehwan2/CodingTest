package main.java.BAEKJOON.bronze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 두수의합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i]=sc.nextInt();
        }
        int answer = sc.nextInt();
        System.out.println(findCouple(num,arr,answer));
    }

    private static int findCouple(int num, int[] arr, int answer) {
        boolean[] eist = new boolean[1000000];
        for(int i=0;i<num;i++){
            eist[arr[i]]=true;
        }
        int count =0;
        for(int i=1;i<(answer-1)/2;i++){
            count += eist[i]==true&&eist[answer-i]==true?1:0;

        }

        System.out.println(count);
        return count;
    }
}
