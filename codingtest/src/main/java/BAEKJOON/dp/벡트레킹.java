package BAEKJOON.dp;

import java.util.Scanner;

public class 벡트레킹 {
    public  static int[] arr;
    public static boolean[] visit;

    public static void dfs(int a, int b, int depth) {

        if (depth == b) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < a; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(a, b, depth + 1);
                visit[i] = false;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        arr=new int[num2];
        visit = new boolean[num1];
        dfs(num1,num2,0);
    }
}
