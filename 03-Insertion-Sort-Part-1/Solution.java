import java.util.*;

public class Solution {

    public static void insertionSort1(int n, int[] arr) {

        int value = arr[n - 1];
        int i = n - 2;

        while (i >= 0 && arr[i] > value) {

            arr[i + 1] = arr[i];

            // Print array after shifting
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();

            i--;
        }

        arr[i + 1] = value;

        // Print final array after insertion
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        insertionSort1(n, arr);

        sc.close();
    }
}
