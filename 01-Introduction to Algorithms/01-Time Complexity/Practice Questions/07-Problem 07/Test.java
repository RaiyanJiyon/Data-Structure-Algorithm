public class Test {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4};     
        int[] num2 = {1, 2, 3, 4, 5};     

        // Outer loop iterates over the elements of num1
        for (int i = 0; i < num1.length; i++) {
            // Inner loop iterates over the elements of num2
            for (int j = 0; j < num2.length; j++) {
                // Constant-time operation: checking if i < j
                if (i < j) {
                    // Printing indices (i, j)
                    System.out.println("(" + i + ", " + j + ")");
                }
            }
        }
    }   
}

/*
Now, let's analyze the time complexity:

The outer loop iterates over num1 which has m elements.
The inner loop iterates over num2 which has n elements.
Inside the nested loops, we have a constant-time operation, the if condition.
Therefore, the time complexity of your code is O(m * n), where m is the length of num1 and n is the length of num2.
*/