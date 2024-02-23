public class Test {
    public static void main(String[] args) {
        int n = 1000;
        int i, j, k = 0;

        // Outer loop runs from n/2 to n, iterating n/2 times
        for (i = n/2; i <= n; i++) {
            // Inner loop doubles its value in each iteration, approximately log(n) times
            for (j = 2; j <= n; j = j * 2) {
                // Constant time operation
                k = k + n / 2;
            }
        }
    }
}

/*
The outer loop iterates n/2 times.
The inner loop iterates log(n) times.

So, the overall time complexity of your code is:

O((n/2) * log(n))

This can be simplified to O(n log n).

This complexity arises from the fact that the outer loop runs n/2 times and the inner loop runs approximately log(n) times per iteration of the outer loop.
*/