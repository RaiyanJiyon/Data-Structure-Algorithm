/*Factorial: Write a program to calculate the factorial of a given number. */
public class Test {
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is: " + calculateFactorial(n));
    }
}

/*
Explanation: The space complexity of this program is O(n) due to the recursive calls to the calculateFactorial method, which consumes memory on the call stack. The maximum depth of the call stack is proportional to the input size n.
*/