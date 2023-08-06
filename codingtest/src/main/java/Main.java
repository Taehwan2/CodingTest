package main.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main{
    static int n,m,answer=0;
    static int [] []graph;
    static int[] ch;
    public void DFS(int v){
        if(v==n){
            System.out.println();
            answer++;
        }
        for(int i=1;i<=n;i++){
            if(graph[v][i]==1){
                System.out.print(i);
                DFS(i);
            }
        }
    }

    public static void main(String[] args) {
        Integer in = new Integer(10);
        int num =3 ;
        num=in.intValue();


        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        graph = new int[n+1][m+1];
        ch = new int[n+1];
        for (int i = 0; i <m ; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            graph[a][b]=1;
        }
        ch[1]=1;
        T.DFS(1);
        System.out.println(answer);
    }
}



