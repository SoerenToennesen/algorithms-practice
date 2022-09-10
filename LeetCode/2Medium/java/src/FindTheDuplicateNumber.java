class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int res = -1;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }

    public static void main(String[] args) {
        FindTheDuplicateNumber solution = new FindTheDuplicateNumber();
        int res1 = solution.findDuplicate(new int[] {1,3,4,2,2});
        int res2 = solution.findDuplicate(new int[] {3,1,3,4,2});
        System.out.println("Duplciate numbers: " + res1 + ", " + res2);
    }
}