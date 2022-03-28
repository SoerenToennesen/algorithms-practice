
// 1030. Matrix Cells in Distance Order

public class MatrixCellsInDistanceOrder {

    private int[] solution(int rows, int cols, int rCenter, int cCenter) {
        int[] ret = {1,2,3};

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
