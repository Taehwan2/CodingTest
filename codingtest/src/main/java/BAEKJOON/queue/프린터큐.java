package BAEKJOON.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class 프린터큐 {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        StringBuilder st = new StringBuilder();
        for(int i=0;i<size;i++){
            String str = sc.next();
            switch (str){
                case "push_back":
                    push_back(deque, sc);
                    break;
                case "push_front":
                    puch_front(deque, sc);
                    break;
                case "front":
                    if(deque.isEmpty())st.append(-1+"\n");
                    else st.append(deque.getFirst()+"\n");
                    break;
                case "back":
                    if(deque.isEmpty())st.append(-1+"\n");
                    else st.append(deque.getLast()+"\n");
                    break;
                case "size":
                    st.append(deque.size()+"\n");
                    break;
                case "pop_front":
                    if(deque.isEmpty())st.append(-1+"\n");
                    else st.append(deque.pollFirst()+"\n");
                    break;
                case "pop_back":
                    if(deque.isEmpty())st.append(-1+"\n");
                    else st.append(deque.pollLast()+"\n");
                    break;
                case "empty":
                    if(deque.isEmpty())st.append(1+"\n");
                    else st.append(0+"\n");
            }
        }
        System.out.println(st);
    }

    private static void puch_front(Deque<Integer> deque, Scanner sc) {
        deque.addFirst(sc.nextInt());
    }

    private static void push_back(Deque<Integer> deque, Scanner sc) {
        deque.addLast(sc.nextInt());
    }
}
