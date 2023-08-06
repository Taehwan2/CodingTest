package main.java.BAEKJOON.bronze;

import java.util.Scanner;

public class N1543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();
        int firstindex = 0;
        int count = 0;
        while (true) {
            int findIndex = doc.indexOf(word, firstindex);
            if (findIndex < 0) break;
            firstindex = findIndex + word.length();
            count++;

        }
//        String replaced = doc.replace(word, "");
//        int lenth = doc.length() - replaced.length();
//        int count = lenth / word.length();
        System.out.println(count);

    }
}
