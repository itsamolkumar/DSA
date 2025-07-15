import java.util.Arrays;
import java.util.Scanner;

public class Divisors {

    public static int[] getAllDivisors(int n) {
        int sqrt = (int) Math.sqrt(n);
        int[] temp = new int[2 * sqrt + 2]; // Max possible divisors
        int count = 0;

        // Store small divisors in order
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                temp[count++] = i;
                if (i != n / i) {
                    temp[count++] = n / i;
                }
            }
        }

        // Copy valid values
        int[] divisors = new int[count];
        for (int i = 0; i < count; i++) {
            divisors[i] = temp[i];
        }

        // Sort the array before returning (optional if you want sorted output)
        Arrays.sort(divisors);
        return divisors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int[] divisors = getAllDivisors(n);
        System.out.print("Divisors of " + n + ": ");
        for (int d : divisors) {
            System.out.print(d + " ");
        }
    }
}
