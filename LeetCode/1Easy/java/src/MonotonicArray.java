
// 896. Monotonic Array

class MonotonicArray {
    public boolean solution(int[] nums) {
        if (nums.length < 2) return true;
        boolean increasing = nums[0] <= nums[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            if (increasing) {
                if (nums[i] > nums[i+1]) return false;
            } else {
                if (nums[i] < nums[i+1]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        MonotonicArray monotonicArray = new MonotonicArray();
        System.out.println(monotonicArray.solution(new int[] {1,2,2,3})); //true
        System.out.println(monotonicArray.solution(new int[] {6,5,4,4})); //true
        System.out.println(monotonicArray.solution(new int[] {1,3,2})); //false
    }
}

