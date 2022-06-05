import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StringsXOr {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner reader = new Scanner(System.in);
        String str1 = reader.next();
        String str2 = reader.next();
        reader.close();
        /*
        int length = Integer.max(str1.length(), str2.length());
        int str1Int = Integer.parseInt(str1);
        int str2Int = Integer.parseInt(str2);
        int xorResult = str1Int ^ str2Int;
        System.out.println(String.valueOf(xorResult));
        //String binaryFormat = "%" + String.format("%d", length) + "s";
        //String result = String.format(binaryFormat, Integer.toBinaryString(xorResult)).replace(' ', '0');
        //System.out.println(result);
        */
        String res = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) res += "0";
            else res += "1";
        }
        System.out.println(res);
    }
}