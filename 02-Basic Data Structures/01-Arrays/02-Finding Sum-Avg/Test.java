import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        
        // Initialize the array with the specified size
        int[] num = new int[size];

        // Prompt the user to input the elements for the array
        for(int i = 0; i < size; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            num[i] = input.nextInt();
        }

        // Calculate the sum of the array elements
        int sum = 0;
        for(int i = 0; i < size; i++) {
            sum += num[i];
        }
        
        // Calculate the average of the array elements
        // Convert sum to double to perform floating-point division
        double avg = (double) sum / size;

        // Print the sum and average of the array
        System.out.println("Sum of Array: " + sum);
        System.out.println("Average of Array: " + avg);
    }
}

/*
Time Complexity Analysis:

Array Initialization: Initializing the array with a dynamic size based on user input (int[] num = new int[size];) takes O(size) time, where size is the number entered by the user.
Input Reading: The loop to read elements from the user takes O(size) time, where size is the number entered by the user.
Sum Calculation: The loop to calculate the sum of the array elements takes O(size) time.
Average Calculation: Calculating the average involves a single division operation, which takes O(1) time.
Therefore, the overall time complexity of the code is O(size), where size is the number entered by the user.

#####################################################################

Space Complexity Analysis:

Array Initialization: Initializing the array with a dynamic size (int[] num = new int[size];) requires O(size) space to store the elements entered by the user.
Scanner Object: Creating a Scanner object requires some additional space, but it's constant and doesn't depend on the size of the input. Therefore, it's also O(1) space.
Integer Variables: Variables such as sum and avg occupy constant space irrespective of the size of the input array.
Therefore, the overall space complexity of the code is O(size), where size is the number entered by the user, as the space required for the array depends on the user's input.
*/