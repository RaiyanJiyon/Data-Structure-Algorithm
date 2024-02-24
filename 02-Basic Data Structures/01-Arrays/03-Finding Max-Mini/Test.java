import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter Size of Array: ");
        int size = input.nextInt();

        // Initialize an array of integers with the specified size
        int[] num = new int[size];

        // Prompt the user to input elements for the array
        System.out.println("Enter " + size + " numbers:");
        for(int i = 0; i < size; i++) {
            num[i] = input.nextInt();
        }

        // Initialize variables to hold the maximum and minimum values
        int max = num[0];
        int min = num[0];

        // Find the maximum and minimum values in the array
        for (int i = 1; i < size; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }

        // Print the maximum and minimum values
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}


/*
Time Complexity Analysis:

Input Reading: Asking the user for the size of the array and then inputting the elements takes O(size) time, where size is the number entered by the user.
Array Initialization: Initializing the array with a dynamic size (int[] num = new int[size];) takes O(size) time.
Finding Maximum and Minimum: The loop to find the maximum and minimum values in the array takes O(size) time, as it iterates through each element of the array once.
Therefore, the overall time complexity of the code is O(size), where size is the number entered by the user.

#####################################################################

Space Complexity Analysis:

Array Initialization: Initializing the array with a dynamic size (int[] num = new int[size];) requires O(size) space to store the elements entered by the user.
Scanner Object: Creating a Scanner object requires some additional space, but it's constant and doesn't depend on the size of the input. Therefore, it's also O(1) space.
Integer Variables: Variables such as max, min, and the loop control variables occupy constant space irrespective of the size of the input array.
Therefore, the overall space complexity of the code is O(size), where size is the number entered by the user, as the space required for the array depends on the user's input.
 */