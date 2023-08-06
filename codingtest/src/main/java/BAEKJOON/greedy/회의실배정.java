package BAEKJOON.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 회의실배정 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        int time[][]=new int[number][number];
        for(int i=0;i<number;i++){
            time[i][0]=sc.nextInt();
            time[i][1]=sc.nextInt();
        }
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]){
                    return o1[0]-o2[0];
                }
                return o1[1] - o2[1];

            }
        });
        int pretime = 0;
        int count=0;
        for(int i=0;i<number;i++){
            if(pretime<=time[i][0]){
                pretime=time[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
