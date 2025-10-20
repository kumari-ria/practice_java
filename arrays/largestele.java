import java.util.*;

class largestele {
    static int largest(int[] arr, int n) {
        int max = 0;
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    public static void main(String args[]) {
        int[] arr = { 10, 324, 45, 90, 9808 };
        int n = arr.length;
        System.out.println(largest(arr, n));

    }

}
