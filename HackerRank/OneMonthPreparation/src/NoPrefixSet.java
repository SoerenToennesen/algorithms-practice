import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'noPrefix' function below.
     *
     * The function accepts STRING_ARRAY words as parameter.
     */


    static class Node<T> {
        private T data;
        private Node<T> parent;
        private Set<Node<T>> children;

        public void addChild(Node next) {
            this.children.add(next);
        }
    }


    public static void noPrefix(List<String> words) {
        // Write your code here
        Collections.sort(words, (str1, str2) -> Integer.compare(str1.length(), str2.length()));
        Node root = new Node();
        root.parent = null;
        root.data = null;

        String tested = "";
        for (String word : words) {
            Node current = root;
            boolean isSame = true;
            for (Character c : word.toCharArray()) {
                for (Node child : current.children) {
                    if (child.data == c) continue;
                }

                Node currentTemp = new Node();
                currentTemp.parent = current;
                currentTemp.data = c;
                current.addChild(currentTemp);
                current = currentTemp;
            }
            if (current.children != null) {
                System.out.println("BAD SET\n" + tested);
                return;
            }
            tested = word;
        }
        System.out.println("GOOD SET");
    }

}

public class NoPrefixSet {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> words = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        Result.noPrefix(words);

        bufferedReader.close();
    }
}
