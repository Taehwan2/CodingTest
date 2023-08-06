package main.java.Programers;

public class 둘만의암호 {
    public static String solution(String s, String skip, int index) {
        String answer = "";
        int temp = index;
        for(char a:s.toCharArray()){
            while(temp>0){
                if(!skip.contains(String.valueOf(a)))temp--;
                a+=1;
                if(a>'z')a='a';
                if(temp==0&&skip.contains(String.valueOf(a)))temp++;
            }
            answer+=a;
            temp=index;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("klmnopqrstuvwxyz","abcdefghij",20));
    }
}
