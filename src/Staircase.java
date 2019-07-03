import java.util.Scanner;

public class Staircase {
    // Complete the staircase function below.
    static void staircase(int n) {
        String symbol = "#";
        String empty = " ";
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(empty);
            }
            for (int j = 0; j < i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
//          System.out.print(empty.repeat(n-i));
//          System.out.println(symbol.repeat(i));
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
