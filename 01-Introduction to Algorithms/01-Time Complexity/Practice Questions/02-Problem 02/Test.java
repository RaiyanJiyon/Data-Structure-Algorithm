public class Test {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        
        // Outer loop: O(n)
        for (int i = 0; i < num.length; i++) {
            // Inner loop: O(n)
            for (int j = 0; j < num.length; j++) {
                System.out.println(); // Constant time operation
            }
        }
    }
}

/*
The time complexity of this code can be determined by analyzing the nested loops.

we have two nested loops iterating over the array num. Both loops iterate over the entire array, resulting in a time complexity of O(n^2), where n is the length of the array.
*/