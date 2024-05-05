public class SumOf {
    public static void main(String[] args) {
        int[] a = {3, 5, 12, 450, 1, 1, 5, 6, 23, 6, 8, 9, 321, 2, 3};
        try {
            double ratio = calculateRatio(a);
            System.out.println("The ratio is: " + ratio);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    private static double calculateRatio(int[] nums) throws Exception {
        if (nums.length < 4) {
            throw new IllegalArgumentException("Array must have at least four numbers.");
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax) {
                secondMax = num;
            }

            if (num < firstMin) {
                secondMin = firstMin;
                firstMin = num;
            } else if (num < secondMin) {
                secondMin = num;
            }
        }

        int sumMax = firstMax + secondMax;
        int sumMin = firstMin + secondMin;

        if (sumMin == 0) {
            throw new RuntimeException("Sum of the smallest two numbers is zero, division by zero error.");
        }
        return (double) sumMax / sumMin;
    }
}
