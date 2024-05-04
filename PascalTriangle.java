public class PascalTriangle {
    public static boolean isDivisibleBy7(int n, int k) {
        while (n > 0 || k > 0) {
            int n_mod = n % 7;
            int k_mod = k % 7;
            if (k_mod > n_mod) {
                return true;
            }
            n /= 7;
            k /= 7;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 109;
        int count = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (!isDivisibleBy7(i, j)) {
                    count++;
                }
            }
        }

        System.out.println("Number of entries not divisible by 7 up to row " + n + ": " + count);
    }
}
