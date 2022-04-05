
// 566. Reshape the Matrix

import java.util.Map;

public class ReshapeTheMatrix {

    private int[][] solution(int[][] mat, int r, int c) {

        return mat;
    }

    public static void main(String[] args) {
        ReshapeTheMatrix reshapeTheMatrix = new ReshapeTheMatrix();
        int[][] matTest1 = {{1, 2}, {3, 4}}; int rTest1 = 1; int cTest1 = 4;
        int[][] matTest2 = {{1, 2}, {3, 4}}; int rTest2 = 2; int cTest2 = 4;
        System.out.println(reshapeTheMatrix.solution(matTest1, rTest1, cTest1));
        System.out.println(reshapeTheMatrix.solution(matTest2, rTest2, cTest2));
    }

}
