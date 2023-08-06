package Programers;

import java.util.Arrays;

public class 최댓값만들기 {
    public static int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer = Math.max(Math.abs(numbers[0])*Math.abs(numbers[1]),numbers[numbers.length-2]*numbers[numbers.length-1]);
        return answer;
    }

    public static void main(String[] args) {
         int arr[] = {1,2,-3,4,-5};
        System.out.println(solution(arr));
    }
}
