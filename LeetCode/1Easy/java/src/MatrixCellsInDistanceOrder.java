
// 1030. Matrix Cells in Distance Order

public class MatrixCellsInDistanceOrder {

    private int[][] solution(int rows, int cols, int rCenter, int cCenter) {
        int[][] matrix = new int[rows][cols];
        int visited = 0;
        int[][] ret = new int[rows][cols];
        int j = 0;
        ret[j] = new int[]{rCenter, cCenter};
        visited++;
        j++;
        while (visited < rows*cols) {
            for (int i = 0; i < 4; i++) { //up, right, down, left
                switch (i) {
                    case 0:
                        if (cCenter > 0) {
                            ret[j] = new int[]{rCenter, cCenter - 1};
                            cCenter--;
                            visited++; // TODO: Revise this. Simply need to do a BFS, where you append each layer of the BFS to the ret array.
                                       // This way, we kind of do a DFS...
                        }
                        break;
                }
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        MatrixCellsInDistanceOrder removeOneElementToMakeTheArrayStrictlyIncreasing = new MatrixCellsInDistanceOrder();
        int test1rows = 1; int test1cols = 2; int test1rCenter = 0; int test1cCenter = 0;
        int test2rows = 2; int test2cols = 2; int test2rCenter = 0; int test2cCenter = 1;
        System.out.println(removeOneElementToMakeTheArrayStrictlyIncreasing.solution(test1rows, test1cols, test1rCenter, test1cCenter));
        System.out.println(removeOneElementToMakeTheArrayStrictlyIncreasing.solution(test1rows, test1cols, test1rCenter, test1cCenter));
    }

}
