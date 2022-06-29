import java.io.*;
import java.util.*;

public class QueueUsingTwoStacks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            List<Integer> stack1 = new ArrayList<>();
            List<Integer> stack2 = new ArrayList<>();
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                while (!stack1.isEmpty()) {
                    stack2.add(0, stack1.get(0));
                    stack1.remove(0);
                }
                stack1.add(0, Integer.parseInt(line));
                while (!stack2.isEmpty()) {
                    stack1.add(0, stack2.get(0));
                    stack2.remove(0);
                }
            }
            br.close();
            System.out.println(stack1);
        }
        catch(Exception e){
            System.err.println("Error: Target File Cannot Be Read");
        }

    }
}