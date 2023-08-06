package main.java.BAEKJOON.bronze;

import java.util.Scanner;

public class N13223 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String currentTime = sc.next();
        String afterTime = sc.next();
        
        String currentArr[] = currentTime.split(":");
        String afterArr[] = afterTime.split(":");

        int c_hour = Integer.parseInt(currentArr[0]);
        int c_min = Integer.parseInt(currentArr[1]);
        int c_sec = Integer.parseInt(currentArr[2]);
        int currentFullTime = (c_hour*3600)+ (c_min*60)+ c_sec;

        int a_hour = Integer.parseInt(afterArr[0]);
        int a_min = Integer.parseInt(afterArr[1]);
        int a_sec = Integer.parseInt(afterArr[2]);
        int afterFullTime = (a_hour*3600)+ (a_min*60)+ a_sec;

        int answerTime = afterFullTime-currentFullTime;
        if(answerTime<=0){
            answerTime += 24*3600;
        }

        int hour = answerTime/3600;
        int min = answerTime%3600/60;
        int sec = answerTime%60;


        System.out.printf("%02d:%02d:%02d",hour,min,sec);
    }
}
