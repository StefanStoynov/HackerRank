import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CompareCharArrays {
    /*
    Compare two char arrays lexicographically (letter by letter).
    Print them in alphabetical order, each on separate line.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstArray = reader.readLine().split("\\s+");
        String[] secondArray = reader.readLine().split("\\s+");
        /*
        solution without using compare method of Arrays.
         */
//        if (firstArray.length < secondArray.length) {
//            printArrays(firstArray,secondArray);
//        } else if (firstArray.length > secondArray.length) {
//            printArrays(secondArray,firstArray);
//        }else if(Arrays.equals(firstArray,secondArray)){
//            printArrays(firstArray,secondArray);
//        } else {
//            for (int i = 0; i < Math.min(firstArray.length, secondArray.length); i++) {
//                if (firstArray[i].charAt(0) > secondArray[i].charAt(0)) {
//                    printArrays(secondArray,firstArray);
//                    break;
//                } else if (firstArray[i].charAt(0) < secondArray[i].charAt(0)) {
//                    printArrays(firstArray,secondArray);
//                    break;
//                }
//            }
//        }

        int num = Arrays.compare(firstArray,secondArray);
        if (num < 0){
            printArrays(firstArray,secondArray);
        }else if (num > 0){
            printArrays(secondArray,firstArray);
        }else{
            printArrays(firstArray,secondArray);
        }
    }

    private static void printArrays(String[]firstArray, String[]secondArray){
        Arrays.stream(firstArray).forEach(System.out::print);
        System.out.println();
        Arrays.stream(secondArray).forEach(System.out::print);
    }
}
