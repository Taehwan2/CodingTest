package Programers;

public class 문자열정렬하기 {
    public static String solution(String my_string) {
        String answer = "";
        int[] answer2=my_string.chars().map(Character::toLowerCase).sorted().toArray();
        char[] anser3=new char[answer2.length];
        for(int i=0;i<answer2.length;i++){
            anser3[i]=(char) answer2[i];
        }
        /*
        for(int i=0;i<answer2.length;i++){
           answer+=String.valueOf(anser3[i]);
        }


         */
        return String.valueOf(anser3);
    }

    public static void main(String[] args) {
        System.out.println(solution("Bcad"));
    }
}
