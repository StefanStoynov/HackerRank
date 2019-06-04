import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FoldAndSum {
    /*
    Read an array of 4*k integers, fold it like shown below, and print the sum of the upper and lower two rows
    (each holding 2 * k integers):
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] inputNumbers = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int k = inputNumbers.length / 4;
        int[] foldedArray = new int[inputNumbers.length / 2];
        for (int i = 0; i < k; i++) {
            foldedArray[i] = inputNumbers[k + i] + inputNumbers[k - 1 - i];
            foldedArray[foldedArray.length - 1 - i] = inputNumbers[inputNumbers.length - 1 - k - i] + inputNumbers[inputNumbers.length - k + i];
        }

        for (int num : foldedArray) {
            System.out.print(num+" ");
        }
    }
}
