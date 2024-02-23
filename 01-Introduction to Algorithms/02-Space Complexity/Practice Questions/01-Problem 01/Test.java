/*/*Write a program to calculate the sum of given n numbers*/
public class Test {
    public static int calculateSum(int n) {
        int sum = 0; // Space complexity: O(1)
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum of first " + n + " numbers is: " + calculateSum(n));
    }
}

/*
Explanation: The space complexity of this program is O(1) because it only uses a constant amount of memory regardless of the input size n. The only variable sum occupies constant space.
*/