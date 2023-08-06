package Programers;

public class 다항식더하기 {
    public static String solution(String polynomial) {
        String answer = "";
        String operater[] = polynomial.split(" ");
        int count = 0;
        int count2 = 0;
        for(int i=0;i<operater.length;i+=2){
            if(operater[i].contains("x")){
                count+=Integer.parseInt(operater[i].replace("x","").trim());
            }else count2 +=Integer.parseInt(operater[i]);

        }
        return String.valueOf(count)+"x"+String.valueOf(count2);
    }

    public static void main(String[] args) {
    String polynominal = "3x + 7 + x";
        System.out.println(solution(polynominal));

    }
}
