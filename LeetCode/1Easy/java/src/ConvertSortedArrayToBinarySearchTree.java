
// 108. Convert Sorted Array to Binary Search Tree

class ConvertSortedArrayToBinarySearchTree {

    public int[] solution(int[] nums) {

        return nums;
    }

    public static void main(String[] args) {
        ConvertSortedArrayToBinarySearchTree convertSortedArrayToBinarySearchTree = new ConvertSortedArrayToBinarySearchTree();
        System.out.println(convertSortedArrayToBinarySearchTree.solution(new int[] {-10, -3, 0, 5, 9})); // [0, -3, 9, -10, null, 5]
        System.out.println(convertSortedArrayToBinarySearchTree.solution(new int[] {1, 3})); // [3, 1]
    }
}

