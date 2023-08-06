package main.java.fastcampus;

import java.util.Scanner;

public class N2744 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str= scanner.next();
        String ans = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if('A'<=ch&&ch<='Z')
                System.out.print((char)('a'+ch-'A'));
            else  System.out.print((char)('A'+ch-'a'));
        }
    }
}
