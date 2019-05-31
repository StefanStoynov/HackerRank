import java.io.*;
import java.util.Scanner;

/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

1 2 3
4 5 6
9 8 9
The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .

Function description

Complete the  function in the editor below. It must return an integer representing the absolute diagonal difference.

diagonalDifference takes the following parameter:

arr: an array of integers .
Input Format

The first line contains a single integer, , the number of rows and columns in the matrix .
Each of the next  lines describes a row, , and consists of  space-separated integers .

Constraints

Output Format

Print the absolute difference between the sums of the matrix's two diagonals as a single integer.

Sample Input:
3
11 2 4
4 5 6
10 8 -12

Sample Output:
15
 */
public class DiagonalDifference {
    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        int diagonalDifference = 0;
        int leftDiagonal = leftDiagonalSum(arr, 0, 0);
        int rightDiagonal = rightDiagonalSum(arr, 0, arr.length - 1);
        diagonalDifference = Math.abs(leftDiagonal - rightDiagonal);
        return diagonalDifference;
    }

    static int leftDiagonalSum(int[][] arr, int row, int col) {
        int sum = 0;
        if (row > arr.length - 1) {
            return sum;
        }
        sum += arr[row][col] + leftDiagonalSum(arr, row + 1, col + 1);
        return sum;
    }

    static int rightDiagonalSum(int[][] arr, int row, int col) {
        int sum = 0;
        if (row > arr.length - 1) {
            return sum;
        }
        sum += arr[row][col] + rightDiagonalSum(arr, row + 1, col - 1);
        return sum;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        System.out.println(result);

        bufferedReader.close();

        scanner.close();
    }
}
