package BAEKJOON.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        int answer=0;
        int people[] = new int[n];
        for(int i=0;i<5;i++){
            people[i] = sc.nextInt();
        }
        Arrays.sort(people);
        for(int i=0;i<5;i++){
            temp+=people[i];
            answer+=temp;
        }
        System.out.println(answer);

    }
}
