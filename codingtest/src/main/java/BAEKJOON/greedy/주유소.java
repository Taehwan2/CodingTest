package BAEKJOON.greedy;

import java.util.Scanner;

public class 주유소 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int contryDistance[] = new int[number - 1];
        int oilPrice[] = new int[number];
        int index = 0;
        int distance =0;
        int distance2 = 1;
        int answer = 0;
        for (int i = 0; i < number - 1; i++) {
            contryDistance[i] = sc.nextInt();
        }
        for (int i = 0; i < number; i++) {
            oilPrice[i] = sc.nextInt();
        }

        while(distance2<number-1){
            if(oilPrice[distance]>=oilPrice[distance2]){
                answer +=contryDistance[distance]*oilPrice[distance];
                distance++;
                distance2++;
            } else if (oilPrice[distance]< oilPrice[distance2]) {
                index = distance;
                answer+=contryDistance[index]*oilPrice[distance];
                index++;
                distance2++;
            }
        }
        answer+=oilPrice[distance]*contryDistance[contryDistance.length-1];
        System.out.println(answer);
    }

}
