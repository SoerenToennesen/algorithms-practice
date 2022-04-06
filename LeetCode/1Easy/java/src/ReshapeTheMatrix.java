
// 566. Reshape the Matrix

public class ReshapeTheMatrix {

    private int[][] solution(int[][] mat, int r, int c) {
        if (r * c != mat[0].length * mat.length) return mat;
        int ret[][] = new int[r][c];
        int l = 0; int k = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                ret[l][k] = mat[i][j];
                k++;
                if (k > c - 1) {
                    k = 0;
                    l++;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        ReshapeTheMatrix reshapeTheMatrix = new ReshapeTheMatrix();
        int[][] matTest1 = {{1, 2}, {3, 4}}; int rTest1 = 1; int cTest1 = 4;
        int[][] matTest2 = {{1, 2}, {3, 4}}; int rTest2 = 2; int cTest2 = 4;
        int[][] test1 = reshapeTheMatrix.solution(matTest1, rTest1, cTest1);
        for (int i = 0; i < test1.length; i++) {
            System.out.println("");
            for (int j = 0; j < test1[0].length; j++) {
                System.out.print(test1[i][j]);
                System.out.print(" ");
            }
        }
        System.out.println("");
        int[][] test2 = reshapeTheMatrix.solution(matTest2, rTest2, cTest2);
        for (int i = 0; i < test2.length; i++) {
            System.out.println("");
            for (int j = 0; j < test2[0].length; j++) {
                System.out.print(test2[i][j]);
                System.out.print(" ");
            }
        }
        System.out.println("");
    }

}
