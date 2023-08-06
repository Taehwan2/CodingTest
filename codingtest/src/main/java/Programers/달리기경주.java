package main.java.Programers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 달리기경주 {




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{1,3},{2,6},{8,10},{15,19}};
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1])return o1[0]-o2[0];
                return o1[1]-o2[1];
            }
        });

        
    }
}
