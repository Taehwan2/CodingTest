package BAEKJOON.dp;

import java.util.Scanner;
import java.util.Stack;

public class 종수할아버지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int N = sc.nextInt();
            double dp[] = new double[N+1];
            if (N == 0) break;
            dp[0] = 1;
            for (int i = 1; i < N; i++) {
                double temp = (2 * (2 * i + 1));
                dp[i] = dp[i - 1] * (temp / (i + 2));
            }
            System.out.println((long) dp[N - 1]);
        }
    }
}
