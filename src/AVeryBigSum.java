import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class AVeryBigSum {

    static long aVeryBigSum(long[] ar) {
        long sum;
        sum = Arrays.stream(ar).sum();
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arCount = scanner.nextInt();

        long[] ar = new long[arCount];

        String[] arItems = bufferedReader.readLine().split("\\s+");


        for (int i = 0; i < arCount; i++) {
            long arItem = Long.parseLong(arItems[i]);
            ar[i] = arItem;
        }

        long result = aVeryBigSum(ar);

        System.out.println(result);

        bufferedReader.close();

        scanner.close();
    }
}
