class Factorial {
    // Recursive method to calculate factorial
    int factorial(int n) {
        if (n == 1) {
            return 1; // Base case: If n is 1, return 1
        } else {
            return n * factorial(n - 1); // Recursive call to factorial method with reduced problem size
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Factorial ob1 = new Factorial();
        System.out.println(ob1.factorial(5)); // Printing the factorial of 5
    }
}

/*
In the factorial method, when the base case is reached (when n == 1), the time complexity is constant because it performs a simple return operation (return 1;). This operation is denoted by O(1).

In the recursive case (when n != 1), the algorithm makes a single recursive call to compute the factorial of (n-1), and performs a constant-time multiplication operation (n * ...). Therefore, the time complexity for each recursive call can be represented as O(1).

The number of recursive calls is equal to the value of n. Each recursive call reduces the problem size by 1.

Therefore, the overall time complexity of computing the factorial using recursion in this code is O(n).
*/