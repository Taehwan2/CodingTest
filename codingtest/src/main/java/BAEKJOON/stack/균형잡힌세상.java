package BAEKJOON.stack;

import java.util.Scanner;
import java.util.Stack;

public class 균형잡힌세상 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String answer = null;
        while (true) {
            answer = "yes";
            String str1 = sc.nextLine();
            if (str1.equals(".")) break;
            str1 = getTrim(str1);
            for (char x : str1.toCharArray()) {
                if (x == '(' || x == '[') stack.push(x);
                else if(x == ')') {
                    if(stack.empty() || stack.peek() != '(') {
                        answer= "no";
                    }
                    else {
                        stack.pop();
                    }
                }
                else if(x == ']') {

                    if(stack.empty() || stack.peek() != '[') {
                       answer="no";
                    }
                    else {
                        stack.pop();
                    }
                }

            }
            if(!stack.isEmpty()) System.out.println("no");
            else System.out.println(answer);
            stack.clear();
        }

    }

    private static String getTrim(String str1) {
        return str1.replaceAll("[A-Z,a-z,.]", "").replace(" ", "").trim();
    }
}
