package Programers;

import java.util.HashMap;

public class 영어가싫어요 {
    public static long solution(String numbers) {
        long answer = 0;
        String temp ="zero,one,two,three,four,five,six,seven,eight,nine";
        HashMap<String,Integer> map = new HashMap<>();
        map.put("zero",0);
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);
        String temp2="";

        for(int i=0;i<numbers.length();i++){
            temp2+=String.valueOf(numbers.charAt(i));
            System.out.println(temp2);
            if(map.containsKey(temp2)){
                answer=answer*10+map.get(temp2);
                temp2="";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("onetwothreefourfivesixseveneightnine"));
    }

}

