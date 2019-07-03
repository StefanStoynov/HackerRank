import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PlusMinus {
    /*
    Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros.
    Print the decimal value of each fraction on a new line.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int devider = Integer.parseInt(reader.readLine());
        int positive = 0;
        int negative = 0;
        int zeroes = 0;

        int[]numbers = Arrays
                .stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int number : numbers) {
           if (number>0){
               positive++;
           }else if (number<0){
               negative++;
           }else{
               zeroes++;
           }
        }

        System.out.printf("%.5f%n",positive*1.0/devider);
        System.out.printf("%.5f%n",negative*1.0/devider);
        System.out.printf("%.5f",zeroes*1.0/devider);

    }
}
