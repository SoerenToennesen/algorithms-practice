
// 2094. Finding 3-Digit Even Numbers

class FindingThreeDigitEvenNumbers {
    public int[] solution(int[] digits) {

        return digits;
    }

    public static void main(String[] args) {
        FindingThreeDigitEvenNumbers findingThreeDigitEvenNumbers = new FindingThreeDigitEvenNumbers();
        System.out.println(findingThreeDigitEvenNumbers.solution(new int[] {2,1,3,0})); //[102,120,130,132,210,230,302,310,312,320]
        System.out.println(findingThreeDigitEvenNumbers.solution(new int[] {2,2,8,8,2})); //[222,228,282,288,822,828,882]
        System.out.println(findingThreeDigitEvenNumbers.solution(new int[] {3,7,5})); //[]
    }
}

