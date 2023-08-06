package BAEKJOON.stack;

import java.util.Scanner;
import java.util.Stack;

public class 스택수열 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Character> answer2 = new Stack<>();
        Scanner sc =new Scanner(System.in);
        String answer="yes";
        int curent = 0;
        int size = sc.nextInt();
        loop:
        for(int i=0;i<size;i++){
            int index=sc.nextInt();
            if(curent<index) {
                for (int w = curent+1; w <= index; w++) {
                    stack.add(w);
                    answer2.add('+');
                }
                stack.pop();
                answer2.add('-');
                curent=index;
            }else{
                while(true){

                    if(stack.isEmpty()){
                       answer = "NO";
                        break loop;
                    }
                    answer2.add('-');
                    if(stack.pop()==index)break;

                }
            }

        }

        if(answer.equals("NO")){
            System.out.println(answer);
        }else{
            for(char x:answer2){
                System.out.println(x);
            }
        }
    }

}
