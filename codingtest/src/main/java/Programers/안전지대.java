package Programers;

import java.util.HashSet;

public class 안전지대 {
    public static int solution(int[][] board) {
        int answer = 0;
        for(int i=0;i< board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==1){
                  if(i<board.length-1&&board[i+1][j]!=1) board[i+1][j]=-1;
                  if(j<board[0].length-1&&board[i][j+1]!=1)board[i][j+1]=-1;
                  if(j>0&&board[i][j-1]!=1)board[i][j-1]=-1;
                  if(i>0&&board[i-1][j]!=1)board[i-1][j]=-1;
                  if(i<board.length-1&&j>0&&board[i+1][j-1]!=1)board[i+1][j-1]=-1;
                  if(i>0&&j<board[0].length-1&&board[i-1][j+1]!=1)board[i-1][j+1]=-1;
                  if(j>0&&i>0&&board[i-1][j-1]!=1)board[i-1][j-1]=-1;
                  if(i<board.length-1&&j<board[0].length-1&&board[i+1][j+1]!=1)board[i+1][j+1]=-1;
                }
            }
            }
        for(int i=0;i< board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==0)answer++;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        int arr[][] = {{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}};
        System.out.println(solution(arr));
    }
}
