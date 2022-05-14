
// 171. Excel Sheet Column Number

class ExcelSheetColumnNumber {
    public int solution(String columnTitle) {
        int ret = 0;
        for (int i = 0; i < columnTitle.length() - 1; i++) {
            ret += (((int) columnTitle.charAt(i)) - 64) * (26 * (columnTitle.length() - 1 - i));
        }
        return ret + (((int) columnTitle.charAt(columnTitle.length() - 1)) - 64);
    }

    public static void main(String[] args) {
        ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();
        System.out.println(excelSheetColumnNumber.solution("A")); //1
        System.out.println(excelSheetColumnNumber.solution("AB")); //28
        System.out.println(excelSheetColumnNumber.solution("ZY")); //701
    }
}

