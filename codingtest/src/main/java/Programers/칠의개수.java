package Programers;

public class 칠의개수 {
    public static int solution(int[] array) {
        int answer = 0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<String.valueOf(array[i]).length();j++){
                if(String.valueOf(array[i]).charAt(j)=='7')answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int arr[] = {7,77,17};
        System.out.println(solution(arr));
    }
}
