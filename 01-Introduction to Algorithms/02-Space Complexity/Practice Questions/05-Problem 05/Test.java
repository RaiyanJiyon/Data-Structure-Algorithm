/*Binary Search: Write a program to perform a binary search on a sorted array. */
public class Test {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        System.out.println("Index of target element: " + binarySearch(arr, target));
    }
}

/*
Explanation: The space complexity of this program is O(1) because it only uses a constant amount of memory. It doesn't require any extra space that grows with the size of the input array or target.
*/