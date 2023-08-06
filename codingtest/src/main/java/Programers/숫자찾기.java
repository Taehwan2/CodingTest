package Programers;

public class 숫자찾기 {
    public  static int solution(int num, int k) {
        int answer = 0;
        String key = String.valueOf(num);
        answer = key.indexOf(String.valueOf(k));
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(29183,9));

    }
}
