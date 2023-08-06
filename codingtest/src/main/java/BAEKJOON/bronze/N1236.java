package main.java.BAEKJOON.bronze;

public class N1236 {
    public static void main(String[] args) {
        int map[][] = new int[4][4];
        int rowCount =0 ;
        for(int i=0;i< map.length;i++){
            boolean check = false;
            for(int j=0;j<map[0].length;j++){
                if(map[i][j]=='X')check=true;
            }
            if(check)rowCount++;
        }
        for(int i=0;i< map.length;i++){
            boolean check = false;
            for(int j=0;j<map[0].length;j++){
                if(map[j][i]=='X')check=true;
            }
            if(check)rowCount++;
        }
    }
}
