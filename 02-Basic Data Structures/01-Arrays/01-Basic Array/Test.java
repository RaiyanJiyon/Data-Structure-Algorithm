public class Test {
    public static void main(String[] args) {
        // Array initialization with values
        int[] nums = {10, 20, 30, 40, 50};

        // Calculating and printing the size of the array
        int size = nums.length;
        System.out.println("Array Size - " + size);

        // Iterating through the array and printing each element
        System.out.println("Array Elements:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // Calculating the sum of array elements
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; // compound assignment operator +=
        }
        // Printing the sum of array elements
        System.out.println("Sum of Array - " + sum);
    }
}


/*

Time Complexity Analysis:

Array Initialization: The time complexity of initializing an array with n elements is O(n).
Size Calculation: Calculating the length of the array (nums.length) takes O(1) time because it's just accessing a property of the array.
Printing Array Elements: The loop iterating through the array and printing each element runs in O(n) time, where n is the number of elements in the array.
Sum Calculation: The loop for calculating the sum of array elements also runs in O(n) time, where n is the number of elements in the array.
Therefore, the overall time complexity of the code is O(n) where n is the number of elements in the array.

#####################################################################

Space Complexity Analysis:

Array Initialization: The space complexity of initializing an array with n elements is O(n) because it requires memory proportional to the number of elements in the array.
Integer Variables: The space complexity of integer variables size and sum is O(1) because they occupy constant space irrespective of the size of the input array.
Therefore, the overall space complexity of the code is O(n) where n is the number of elements in the array.

*/