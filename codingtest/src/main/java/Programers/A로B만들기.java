package Programers;

import java.util.HashMap;

public class A로B만들기 {
    public static int solution(String before, String after) {
        HashMap<Character,Integer> map = new HashMap<>();
        int answer = 0;
        int count = 0;
        for(int i=0;i<before.length();i++){
            if(!map.containsKey(before.charAt(i)))map.put(before.charAt(i),i);
            count+=map.get(before.charAt(i));
        }
        System.out.println(count);
        for(int j=0;j<before.length();j++){
            if(!map.containsKey(after.charAt(j))){
                return 0;
            }
            if (map.containsKey(after.charAt(j))) {
                answer+=map.get(after.charAt(j));
            }
        }
        System.out.println(answer);
        return answer==count?1:0;
    }

    public static void main(String[] args) {
        System.out.println(solution("olleh","hello"));
    }
}
