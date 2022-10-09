public class NextGreaterElementIII {
    public int nextGreaterElement(int n) {

        return -1;
    }

    public static void main(String[] args) {
        NextGreaterElementIII solution = new NextGreaterElementIII();
        int res1 = solution.nextGreaterElement(12);//21
        int res2 = solution.nextGreaterElement(21);//-1
        System.out.println("Result: " + res1 + ", " + res2);
    }
}
