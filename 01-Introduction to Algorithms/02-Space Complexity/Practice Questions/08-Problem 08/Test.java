/*Write a program to merge two sorted arrays into a single sorted array.*/
public class Test {
    public static int[] merge(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length; // Space: O(1)
        int[] result = new int[m + n]; // Space: O(m + n)
        int i = 0, j = 0, k = 0; // Space: O(1)
        while (i < m && j < n) { // Space: O(1)
            if (nums1[i] < nums2[j]) // Space: O(1)
                result[k++] = nums1[i++]; // Space: O(1)
            else 
                result[k++] = nums2[j++]; // Space: O(1)
        }
        while (i < m) // Space: O(1)
            result[k++] = nums1[i++]; // Space: O(1)
        while (j < n) // Space: O(1)
            result[k++] = nums2[j++]; // Space: O(1)
        return result; // Space: O(m + n)
    }
    
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};
        int[] mergedArray = merge(nums1, nums2);
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}

/*
Space Complexity: O(m + n) - The space used is proportional to the combined size of the two input arrays.
*/