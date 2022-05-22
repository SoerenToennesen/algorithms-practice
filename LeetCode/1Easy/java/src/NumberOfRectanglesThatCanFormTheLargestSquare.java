
// 1725. Number Of Rectangles That Can Form The Largest Square
// Didn't understand question. Found solution at https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/discuss/2059929/Java-Simple-Solution%3A-99-faster-than-others
class NumberOfRectanglesThatCanFormTheLargestSquare {
    public int solution(int[][] rectangles) {
        int len = rectangles.length,max=0,count1=0;
        int[] a = new int[len];
        for(int i=0;i<len;i++){
            a[i] = Math.min(rectangles[i][0],rectangles[i][1]);
        }
        for(int i=0;i<len;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        for(int i=0;i<len;i++){
            if(a[i]==max){
                count1++;
            }
        }
        return count1;
    }

    public static void main(String[] args) {
        NumberOfRectanglesThatCanFormTheLargestSquare numberOfRectanglesThatCanFormTheLargestSquare = new NumberOfRectanglesThatCanFormTheLargestSquare();
        System.out.println(numberOfRectanglesThatCanFormTheLargestSquare.solution(new int[][] {{5,8},{3,9},{5,12},{16,5}})); //3
        System.out.println(numberOfRectanglesThatCanFormTheLargestSquare.solution(new int[][] {{2,3},{3,7},{4,3},{3,7}})); //3
    }
}

