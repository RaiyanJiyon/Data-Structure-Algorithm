/*Bubble Sort: Write a program to sort an array using the Bubble Sort algorithm. */
import java.util.Arrays;

public class Test {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

/*
Explanation: The space complexity of Bubble Sort is O(1) because it only requires a constant amount of additional memory, regardless of the size of the input array.
*/