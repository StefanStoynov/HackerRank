import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RotateAndSum {
    public static void main(String[] args) throws IOException {
        /*
        To “rotate an array on the right” means to move its last element first: {1, 2, 3}  {3, 1, 2}.
        Write a program to read an array of n integers (space separated on a single line) and an integer k,
        rotate the array right k times and sum the obtained arrays after each rotation as shown below.
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] inputArray = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int rotationCount = Integer.parseInt(reader.readLine());

        int[] sumArrays = new int[inputArray.length];

        for (int i = 1; i <= rotationCount; i++) {
            int[] shiftedArray = new int[inputArray.length];

            shiftedArray[0] = inputArray[inputArray.length - 1];

            for (int j = 1; j <= inputArray.length - 1; j++) {
                shiftedArray[j] = inputArray[j - 1];
                sumArrays[j - 1] = sumArrays[j - 1] + shiftedArray[j - 1];
            }

            sumArrays[inputArray.length - 1] = sumArrays[inputArray.length - 1] + shiftedArray[inputArray.length - 1];
            inputArray = shiftedArray;
        }

        for (int sumArray : sumArrays) {
            System.out.print(sumArray + " ");
        }

    }
}
