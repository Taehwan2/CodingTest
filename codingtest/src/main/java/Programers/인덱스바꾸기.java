package Programers;

import java.util.Arrays;

public class 인덱스바꾸기 {

    public static String solution(String my_string, int num1, int num2) {
        String answer = "";
       answer= my_string.substring(0, num1) + my_string.charAt(num2)
                + my_string.substring(num1 + 1,num2)+my_string.charAt(num1)+my_string.substring(num2+1);

        return  answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("hello",1,2));
    }
}
