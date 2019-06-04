import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestCommonEnd {
    /*
    Read two arrays of words and find the length of the largest common end (left or right).
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstArray = reader.readLine().split("\\s+");
        String[] secondArray = reader.readLine().split("\\s+");
        int minArrayLength = Math.min(firstArray.length, secondArray.length);
        int coutLeft = 0;
        int countRight = 0;

        for (int i = 0; i < minArrayLength; i++) {
            if (firstArray[i].equals(secondArray[i])){
                coutLeft++;
            }else{
                break;
            }
        }

        for (int i = 0; i <minArrayLength; i++) {
            if (firstArray[firstArray.length-1-i].equals(secondArray[secondArray.length-1-i])){
                countRight++;
            }
            else{
                break;
            }
        }

        System.out.println(Math.max(countRight,coutLeft));

    }
}
