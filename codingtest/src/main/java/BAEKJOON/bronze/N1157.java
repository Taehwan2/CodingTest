package main.java.BAEKJOON.bronze;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class N1157 {
    private static void N1157(String str){
        int arr [] = new int[26];
        for(char a:str.toCharArray()){
            arr[a-'A']++;
        }
        int max =-1;
        char alpa ='?';
        for(int a=0;a<26;a++){
            if(arr[a]>max){
                max=arr[a];
                alpa = (char)('A'+a);
            }else if(arr[a]==max){
                alpa='?';
            }
        }
        System.out.println(alpa);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str= str.toUpperCase();
        N1157(str);
    }
}
