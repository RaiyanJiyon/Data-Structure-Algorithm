class PowerNumber {
    int power(int num) {
        if (num < 1) {
            return 0; // Base case: If num is less than 1, return 0
        } else if (num == 1) {
            System.out.println(1);
            return 1; // Base case: If num is 1, print 1 and return 1
        } else {
            int prev = power(num % 2); // Recursive call to power method with reduced problem size
            int curr = prev * 2;
            System.out.println(curr);
            return curr;
        }
    }
}

public class Test {
    public static void main(String[] args) {
        PowerNumber ob1 = new PowerNumber();
        ob1.power(10);
    }
}

/*
In the power method, the recursive calls divide the problem size by 2 each time (num % 2). This means that the problem size is halved in each recursive call.

The recursion continues until num becomes 1. At each level of recursion, the problem size is reduced by a factor of 2.

Therefore, the number of recursive calls is logarithmic with respect to the input num.

Each recursive call performs constant-time operations, such as arithmetic operations (num % 2, prev * 2), and printing (System.out.println), which do not depend on the input size.

As a result, the overall time complexity of the power method is O(log num), where num is the input to the method.

So, the time complexity of the power method in this code is logarithmic O(logn).
*/