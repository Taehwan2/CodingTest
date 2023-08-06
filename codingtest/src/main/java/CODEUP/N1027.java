package main.java.CODEUP;

import java.util.Scanner;

public class N1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputs[] = sc.next().split("\\.");
        System.out.printf("%s-%s-%s",inputs[2],inputs[1],inputs[0]);
    }
}
