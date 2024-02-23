/*Write a program to print the Fibonacci numbers*/
public class Test {
    public static void printFibonacci(int n) {
        int[] fib = new int[n]; // Space complexity: O(n)
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci series up to " + n + ":");
        printFibonacci(n);
    }
}

/*
Explanation: The space complexity of this program is O(n) because it uses an array fib of size n to store the Fibonacci series.
*/