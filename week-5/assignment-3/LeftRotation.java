import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY. The function accepts
     * following parameters: 1. INTEGER d 2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        int n = arr.size();
        List<Integer> rotated = new ArrayList<>();
        int rotIndex = 0;
        for (int i = d; i < n; i++) {
            int k = arr.get(i);
            rotated.add(rotIndex, k);
            rotIndex++;
        }
        for (int m = 0; m < d; m++) {
            int p = arr.get(m);
            rotated.add(rotIndex, p);
            rotIndex++;
        }
        return rotated;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt).collect(toList());

        List<Integer> result = Result.rotateLeft(d, arr);

        bufferedWriter.write(result.stream().map(Object::toString).collect(joining(" ")) + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}