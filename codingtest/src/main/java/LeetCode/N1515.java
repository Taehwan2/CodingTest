package LeetCode;

public class N1515 {
    public static void main(String[] args) {
        int positions[][]={{0,1},{1,0},{1,2},{2,1}};
        getMinDistSum(positions);
    }
    public static double getMinDistSum(int [][] positions){
        double x_avg = 0;
        double y_avg = 0;
        for (int i=0; i< positions.length; i++) {
            x_avg += positions[i][0];
            y_avg += positions[i][1];
        }
        x_avg /= positions.length;
        y_avg /= positions.length;
        System.out.println(x_avg);
        System.out.println(y_avg);
        return  1;
    }
}
