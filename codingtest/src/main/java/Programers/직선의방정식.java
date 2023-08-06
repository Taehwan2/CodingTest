package Programers;

public class 직선의방정식 {

    public static int solution(int[][] dots) {
        int inclination=(dots[1][1]-dots[0][1])/(dots[1][0]-dots[0][0]);
        int inclination2=(dots[3][1]-dots[2][1])/(dots[3][0]-dots[2][0]);
        int y_intercept = (inclination*-1)+dots[0][1];
        int y_intercept2 = (inclination2*-1)+dots[2][1];
        if(inclination==inclination2&&y_intercept2!=y_intercept){
            return 1;
        }
        return  0;

    }

    public static void main(String[] args) {
        int[][] dots= {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
        System.out.println(solution(dots));
    }
}
