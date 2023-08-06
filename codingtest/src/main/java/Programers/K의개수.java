package Programers;

public class K의개수 {
    public static int solution(int i, int j, int k) {
        int answer = 0;
        for(int x=i;x<=j;x++){
           for(int w=0;w<String.valueOf(x).length();w++){
               if(String.valueOf(x).charAt(w)==String.valueOf(k).charAt(0))answer++;
           }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1,13,1));
    }
}
