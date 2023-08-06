package Programers;

import java.util.HashMap;

public class 로그인성공 {
    public static String solution(String[] id_pw, String[][] db) {
        String answer = "";
        HashMap<String,String> map = new HashMap<>();
        for(int i=0;i<db.length;i++){
            map.put(db[i][0],db[i][1]);
        }
        if(map.containsKey(id_pw[0])){
            if(map.get(id_pw[0]).equals(id_pw[1])){
                return "login";
            } return "wrong pw";
        }
        return "fail";
    }

    public static void main(String[] args) {

    }
}
