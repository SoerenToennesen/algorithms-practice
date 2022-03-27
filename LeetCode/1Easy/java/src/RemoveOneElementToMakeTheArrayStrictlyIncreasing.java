
//1909. Remove One Element to Make the Array Strictly Increasing

public class RemoveOneElementToMakeTheArrayStrictlyIncreasing {

    private boolean solution(int[] nums) {
        boolean removed = false;
        boolean skipNext = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[skipNext ? i - 2 : i - 1] >= nums[i] && !removed) {
                if (!removed) {
                    removed = true;
                    skipNext = true;
                    if (nums[i-2] >= nums[i]) return false;
                    continue;
                } else {
                    return false;
                }
            }
            skipNext = false;
        }
        return true;
    }

    public static void main(String[] args) {
        RemoveOneElementToMakeTheArrayStrictlyIncreasing removeOneElementToMakeTheArrayStrictlyIncreasing = new RemoveOneElementToMakeTheArrayStrictlyIncreasing();
        int[] test1 = {1,2,10,5,7};
        int[] test2 = {2,3,1,2};
        System.out.println(removeOneElementToMakeTheArrayStrictlyIncreasing.solution(test1));
        System.out.println(removeOneElementToMakeTheArrayStrictlyIncreasing.solution(test2));
    }

}
