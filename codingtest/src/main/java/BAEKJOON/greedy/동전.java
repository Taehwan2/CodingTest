package BAEKJOON.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 동전 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int answer=0;
        int num = sc.nextInt();
        Integer coins[] = new Integer[num];
        int price =sc.nextInt();
        for(int i=0;i<num;i++){
            coins[i]=sc.nextInt();
        }
        Arrays.sort(coins,Collections.reverseOrder());
        for(int coin:coins){
            if(coin<=price){
                answer+=price/coin;
                price%=coin;
            }
            if(price==0){
                break;
            }
        }
        System.out.println(answer);
    }
}
