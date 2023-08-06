package Programers;

import java.util.SimpleTimeZone;

public class Uppercase {
    public static void main(String[] args) {
        String value = "abCdEfghIJ";
        String answer="";
        for(int i=0;i<value.length();i++){
            if(65<=value.charAt(i)&&value.charAt(i)<=90){
                answer+= String.valueOf(value.charAt(i)).toLowerCase();
            }else{
                answer+=String.valueOf(value.charAt(i)).toUpperCase();
            }
        }
        System.out.println(answer);
    }
}
