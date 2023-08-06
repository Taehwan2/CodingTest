package main.java.BAEKJOON.bronze;

import java.util.HashMap;
import java.util.Scanner;

public class N10431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        while(w-->0){
            int T = sc.nextInt();
            int temp[] = new int[20];
            for(int i=0;i<20;i++){
                temp[i]=sc.nextInt();
            }
            int cnt = 0;
            for(int i=0;i<20;i++){
                for(int j=0;j<i;j++){
                    if(temp[i]<temp[j]){
                        cnt++;
                    }
                }
            }
        map.put(T,cnt);
        cnt=0;
        }
        for(int i: map.keySet()){
            System.out.printf("%d %d\n",i,map.get(i));
        }
    }
}
