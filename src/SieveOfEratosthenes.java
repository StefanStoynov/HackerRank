import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SieveOfEratosthenes {
    public static void main(String[] args) throws IOException {
        /*
        Write a program to find all prime numbers in range [1…n].
        Implement the algorithm called “Sieve of Eratosthenes”:
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int rangeNumber = Integer.parseInt(reader.readLine());
        boolean[] primes = allPrimeNumbersInRange(rangeNumber);

        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }

    }

    private static boolean[] allPrimeNumbersInRange(int range) {
        boolean[] primes = new boolean[range + 1];

        for (int i = 0; i <= range; i++) {
            primes[i] = true;
        }
        primes[0] = primes[1] = false;

        for (int i = 2; i <= range; i++) {
            if (primes[i]) {
                for (int j = i + i; j <= range; j += i) {
                    primes[j] = false;
                }
            }
        }

        return primes;
    }
}
