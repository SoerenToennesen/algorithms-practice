
// 108. Convert Sorted Array to Binary Search Tree
// Got answer from here:
// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/discuss/1914093/My-Java-Solution

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    public TreeNode buildTree(int[] nums, int start, int end) {
        //base case
        if (start > end) {
            return null;
        }

        if (start == end) {
            return new TreeNode(nums[start]);
        }

        //pick the middle point
        int mid = start + (end - start) / 2;
        TreeNode midNode = new TreeNode(nums[mid]);

        //build the left and right parts of the node
        midNode.left = buildTree(nums, start, mid - 1);
        midNode.right = buildTree(nums, mid + 1, end);

        return midNode;
    }

    public static void main(String[] args) {
        ConvertSortedArrayToBinarySearchTree convertSortedArrayToBinarySearchTree = new ConvertSortedArrayToBinarySearchTree();
        System.out.println(convertSortedArrayToBinarySearchTree.sortedArrayToBST(new int[] {-10, -3, 0, 5, 9})); // [0, -3, 9, -10, null, 5]
        System.out.println(convertSortedArrayToBinarySearchTree.sortedArrayToBST(new int[] {1, 3})); // [3, 1]
    }
}

