package Programers;

public class OX퀴즈 {
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
       answer[0]= calculate(quiz[0]);
       answer[1]=calculate(quiz[1]);
        return answer;
    }

    public  static String calculate(String expression){
        String temp[] =expression.split(" ");
        int num1=Integer.parseInt(temp[0]),num2=Integer.parseInt(temp[2]),answer=Integer.parseInt(temp[4]);
        int answer1=0;
        switch (temp[1]){
            case "+":
                answer1=num1+num2;
                break;
            case "-":
                answer1=num1-num2;
                break;
        }
       return answer1==answer?"O":"X";

    }

    public static void main(String[] args) {
        String [] quiz = {"3 - 4 = -3","5 + 6 = 11","5 + 6 = 11"};
        System.out.println(solution(quiz)[1]);
    }
}
