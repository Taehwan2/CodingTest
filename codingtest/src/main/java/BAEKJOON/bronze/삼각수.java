package main.java.BAEKJOON.bronze;

public class 삼각수 {
    static boolean [] twosamgack = new boolean[1000];
    public static void getInstance() {
    int []samgack = new int[1000];
        int samgaknum = 0;
        for (int i = 0; ; i++) {
            int sum= i*(i+1)/2;
            if(sum>=1000)break;
            samgack[samgaknum++]=sum;
        }

        for(int i=0;i<samgaknum;i++){
            for(int j=0;j<samgaknum;j++){
                if(samgack[i]+samgack[j]<=1000){
                   twosamgack[samgack[i]+samgack[j]]=true;
                }
            }
        }

        for (int i = 1; i < samgaknum; i++) {
            for(int j=0;j<samgaknum;j++){
                if(!twosamgack[i])continue;
                int sum= i + samgack[j];
            }
        }

    }
    public static void main(String[] args) {

    }
}
