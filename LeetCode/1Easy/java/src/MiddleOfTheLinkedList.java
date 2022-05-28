
// 876. Middle of the Linked List

import java.util.Arrays;

class MiddleOfTheLinkedList {
    public int[] solution(int[] head) {
        return Arrays.copyOfRange(head, head[(int) Math.ceil(head.length / 2 - 1)], head.length);
    }

    public static void main(String[] args) {
        MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();
        System.out.println(middleOfTheLinkedList.solution(new int[] {1,2,3,4,5})); //[3,4,5]
        System.out.println(middleOfTheLinkedList.solution(new int[] {1,2,3,4,5,6})); //[4,5,6]
        int[] test = middleOfTheLinkedList.solution(new int[] {1,2,3,4,5,6});
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i]);
        }
    }
}

