

class XOROperationInAnArray {
    public int xorOperation(int n, int start) {
        //List<Integer> nums = new ArrayList<Integer>();
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = res ^ (start + 2 * i);
        }
        return res;
    }

    public static void main(String[] args) {
        XOROperationInAnArray xorOperationInAnArray = new XOROperationInAnArray();
        System.out.println(xorOperationInAnArray.xorOperation(5, 0));
    }
}

