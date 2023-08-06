package main.java.CODEUP;

public class N1064 {
    public static void main(String[] args) {
        int a=10;
        int b = 20;
        int c =30;


        int max = (a>b?a:b)>c?(a>b?a:b):c;
        System.out.println(max);
    }
}
