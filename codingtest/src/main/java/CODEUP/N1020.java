package main.java.CODEUP;

import java.security.Security;
import java.util.Scanner;

public class N1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String socialSecurityNumber =sc.next();
        System.out.println(socialSecurityNumber.replace("-",""));
    }
}
