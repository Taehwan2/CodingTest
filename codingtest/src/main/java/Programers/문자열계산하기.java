package Programers;

import java.util.Stack;

public class 문자열계산하기 {
    public static int solution(String my_string) {
        String operater[] = my_string.split(" ");
        Stack<Integer> stack = new Stack<>();
        stack.add(Integer.parseInt(operater[0]));
        for (int i = 1; i < operater.length; i+=2) {
            if (operater[i].equals("+")) {
                stack.add(stack.pop() + Integer.parseInt(operater[i + 1]));
            } else {
                stack.add(stack.pop() - Integer.parseInt(operater[i + 1]));
            }
        }
            return  stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(solution("1 + 3 - 5 + 7"));
    }
}
