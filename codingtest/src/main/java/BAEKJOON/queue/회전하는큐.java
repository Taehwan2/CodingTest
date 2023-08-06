package BAEKJOON.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 회전하는큐 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deque = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            deque.add(i);
        }
        int number = sc.nextInt();
        int arr[] = new int[number];
        for(int i=0;i<number;i++){
            arr[i]=sc.nextInt();
        }

        int count =0;
        for(int x:arr){

        }

    }
}
