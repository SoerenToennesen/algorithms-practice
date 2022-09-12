import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ElementStoneGameVI implements Comparable<ElementStoneGameVI> {

    int index, value;

    ElementStoneGameVI(int index, int value){
        this.index = index;
        this.value = value;
    }

    public int compareTo(ElementStoneGameVI e) {
        return this.value - e.value;
    }
}

class StoneGameVI {
    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        //TODO: Implement a priority queue data structure instead, as pop takes O(1) time
        List<ElementStoneGameVI> aliceElements = new ArrayList<>();
        List<ElementStoneGameVI> bobElements = new ArrayList<>();
        for (int i = 0; i < aliceValues.length; i++) {
            aliceElements.add(new ElementStoneGameVI(i, aliceValues[i]));
            bobElements.add(new ElementStoneGameVI(i, bobValues[i]));
        }
        Collections.reverse(aliceElements);
        Collections.reverse(bobElements);
        int alicePoints = 0;
        int bobPoints = 0;
        for (int i = 0; i < aliceValues.length / 2; i++) {
            if (i % 2 == 0) {
                alicePoints += aliceElements.get(i).value;
            } else {
                bobPoints += bobElements.get(i).value;
            }
            aliceElements.remove(i);
            bobElements.remove(i);
        }
        return Integer.compare(alicePoints, bobPoints);
    }

    public static void main(String[] args) {
        StoneGameVI solution = new StoneGameVI();
        int res1 = solution.stoneGameVI(new int[] {1,2}, new int[] {3,1});
        int res2 = solution.stoneGameVI(new int[] {2,4,3}, new int[] {1,6,7});
    }
}