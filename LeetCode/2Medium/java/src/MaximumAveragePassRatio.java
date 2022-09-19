import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaximumAveragePassRatio {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        List<List<Float>> passPercentage = new ArrayList<>();
        for (int i = 0; i < classes.length; i++) {
            List<Float> tempList = new ArrayList<>();
            tempList.add((float) classes[i][0] / classes[i][1]);
            tempList.add((float) classes[i][0]);
            tempList.add((float) classes[i][1]);
            passPercentage.add(tempList);
        }
        // Also sort based on the lowest total, as adding students to a lower total will mathematically increase the pass rate of that class more than others.
        Comparator<List<Float>> comparator1 = Comparator.comparing(floatList -> floatList.get(0));
        Comparator<List<Float>> comparator2 = Comparator.comparing(floatList -> floatList.get(2));
        Comparator<List<Float>> comparator = comparator1.thenComparing(comparator2);
        Collections.sort(passPercentage, comparator);
        // TODO: Make this loop more efficient
        for (int i = 0; i < extraStudents; i++) {
            List<Float> tempList = new ArrayList<>();
            tempList.add((float) passPercentage.get(0).get(1) + 1 / passPercentage.get(0).get(2) + 1);
            tempList.add(passPercentage.get(0).get(1) + 1);
            tempList.add(passPercentage.get(0).get(2) + 1);
            passPercentage.set(0, tempList);
            Collections.sort(passPercentage, comparator);
        }
        double sum = 0;
        for (int i = 0; i < passPercentage.size(); i++) {
            sum += passPercentage.get(i).get(0);
        }
        sum /= passPercentage.size();
        return sum;
    }

    public static void main(String[] args) {
        MaximumAveragePassRatio solution = new MaximumAveragePassRatio();
        double res1 = solution.maxAverageRatio(new int[][] {{1,2},{3,5},{2,2}}, 2);
        double res2 = solution.maxAverageRatio(new int[][] {{2,4},{3,9},{4,5},{2,10}}, 4);
        System.out.println("Result: " + res1 + ", " + res2);
    }
}
