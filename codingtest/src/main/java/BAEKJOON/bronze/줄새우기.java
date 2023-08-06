package main.java.BAEKJOON.bronze;

public class 줄새우기 {
    public static void main(String[] args) {
        int a[] = {6,3,5,1,8,9,2};
        int sum[] = new int [a.length];
        int count =0;
        for(int i=0;i<a.length;i++){
            boolean find = false;
            for(int j=0;j<i;j++){
                if(sum[j]>a[i]){
                    find=true;
                    for(int k=i-1;k>=j;k--){
                        sum[k+1]=sum[k];
                        count++;
                    }
                    sum[j]=a[i];
                    break;
                }
                if(!find)sum[i]=a[i];
            }
        }
            System.out.println(count);
    }
}
