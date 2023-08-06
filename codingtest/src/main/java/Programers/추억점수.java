package main.java.Programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 추억점수 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("may");
        list.add("kein");

        System.out.println(list.indexOf("may"));
    }

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};
        int temp[] = new int[yearning.length];
        List<String> list = Arrays.stream(name).collect(Collectors.toList());
        for(int i=0;i<photo.length;i++){
            for (int j=0;j<photo[0].length;j++){
                temp[list.indexOf(photo[i][j])]+=1;
            }
        }
        for(int i=0;i<yearning.length;i++){
            answer[i]=yearning[i]*temp[i];
        }
        return answer;
    }
}
