
// 1460. Make Two Arrays Equal by Reversing Sub-arrays

class MakeTwoArraysEqualByReversingSubArrays {
    public boolean solution(int[] target, int[] arr) {

        return false;
    }

    public static void main(String[] args) {
        MakeTwoArraysEqualByReversingSubArrays makeTwoArraysEqualByReversingSubArrays = new MakeTwoArraysEqualByReversingSubArrays();
        System.out.println(makeTwoArraysEqualByReversingSubArrays.solution(new int[] {1,2,3,4}, new int[] {2,4,1,3})); //4
        System.out.println(makeTwoArraysEqualByReversingSubArrays.solution(new int[] {7}, new int[] {7})); //3
        System.out.println(makeTwoArraysEqualByReversingSubArrays.solution(new int[] {3,7,9}, new int[] {3,7,11})); //4
    }
}

