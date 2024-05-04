import java.util.Arrays;

public class SortedArrays {
    public static void merge(int[] A, int m, int[] B, int n) {
        int indexA = m - 1;
        int indexB = n - 1;
        int mergeIndex = m + n - 1;

        while (indexB >= 0) {
            if (indexA >= 0 && A[indexA] > B[indexB]) {
                A[mergeIndex] = A[indexA];
                indexA--;
            } else {
                A[mergeIndex] = B[indexB];
                indexB--;
            }
            mergeIndex--;
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 5, 0, 0, 0};
        int[] B = {2, 4, 6};
        int m = 3;
        int n = 3;

        merge(A, m, B, n);

        System.out.println(Arrays.toString(A));
    }
}
