package BAEKJOON.queue;

import java.util.*;

public class 큐 {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        StringBuilder st = new StringBuilder();
        st.append('<');
        int size = sc.nextInt();
        int count =0;
        int k=sc.nextInt();
        for(int i=1;i<=size;i++){
            queue.offer(i);
        }
        while(!queue.isEmpty()){
            if(count==k-1){
                if(queue.size()==1)st.append(queue.poll()+">");
                else st.append(queue.poll()+","+" ");
                count=0;
            }else{
                queue.add(queue.poll());
                count++;
            }

        }
        System.out.println(st);
    }
}