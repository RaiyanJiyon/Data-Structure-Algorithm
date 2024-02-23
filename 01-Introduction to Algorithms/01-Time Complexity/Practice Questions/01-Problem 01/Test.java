public class Test {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int sum = 0;

        // Calculating sum - O(n)
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println(sum);

        int product = 1;

        // Calculating product - O(n)
        for (int i = 0; i < num.length; i++) {
            product = product * num[i];
        }
        System.out.println(product);
    }
}

/*
The first loop iterates over the entire array to calculate the sum of its elements. Since it iterates through each element of the array once, the time complexity of this loop is O(n), where n is the number of elements in the array.

The second loop also iterates over the entire array to calculate the product of its elements. Similarly, since it iterates through each element of the array once, the time complexity of this loop is also O(n).

Therefore, the overall time complexity of your program is O(n) + O(n) = O(2n), but in asymptotic analysis, we ignore constant factors. So, the time complexity simplifies to O(n).
*/