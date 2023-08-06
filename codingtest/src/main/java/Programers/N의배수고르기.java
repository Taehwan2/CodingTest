package Programers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class N의배수고르기 {
    public static int[] solution(int n, int[] numlist) {
        int[] answer = {};
       List<Integer> list = Arrays.stream(numlist).boxed().collect(Collectors.toList());
       list=list.stream().filter(i -> i % n==0).collect(Collectors.toList());
        int[] intArray;
        intArray = list.stream().mapToInt(i -> i).toArray();
        return intArray;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(solution(3,arr)[1]);
    }
}
