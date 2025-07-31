public class Power {
    public static void main(String[] args) {
        System.out.println("Basic: " + getAns(2, 5));         // Output: 1024
        System.out.println("Optimized: " + optimizedGetAns(2, 5)); // Output: 1024
    }

    // Basic recursive power
    public static int getAns(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        return getAns(num, pow - 1) * num;
    }

    // Optimized power using exponentiation by squaring
    public static int optimizedGetAns(int num, int pow) {
        if (pow == 0) {
            return 1;
        }

        int half = optimizedGetAns(num, pow / 2);

        if (pow % 2 == 0) {
            return half * half;
        } else {
            return num * half * half;
        }
    }
}
