
class ConvertANumberToHexadecimal {
    private static final int sizeOfIntInHalfBytes = 8;
    private static final int numberOfBitsInAHalfByte = 4;
    private static final int halfByte = 0x0F;
    private static final char[] hexDigits = {
            '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };
    public int solution(int num) {
        StringBuilder hexBuilder = new StringBuilder(sizeOfIntInHalfBytes);
        hexBuilder.setLength(sizeOfIntInHalfBytes);
        for (int i = sizeOfIntInHalfBytes - 1; i >= 0; --i) {
            int j = num & halfByte;
            hexBuilder.setCharAt(i, hexDigits[j]);
            num >>= numberOfBitsInAHalfByte;
        }
        return hexBuilder.toString();

        return num;
    }

    public static void main(String[] args) {
        ConvertANumberToHexadecimal convertANumberToHexadecimal = new ConvertANumberToHexadecimal();
        System.out.println(convertANumberToHexadecimal.solution(26));
    }
}

