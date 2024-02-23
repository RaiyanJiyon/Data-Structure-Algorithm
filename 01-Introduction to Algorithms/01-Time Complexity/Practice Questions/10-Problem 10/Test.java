class SumOfDigit {
    int sumdigit(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10; // Constant-time operation
            num = num / 10; // Constant-time operation
        }
        return sum;
    }
}

public class Test {
    public static void main(String[] args) {
        SumOfDigit ob1 = new SumOfDigit();
        ob1.sumdigit(10);
    }
}

/*
The while loop iterates through the digits of the input num. The number of iterations depends on the number of digits in num, which is proportional to the logarithm of num (since we are dividing num by 10 in each iteration).

Within each iteration of the loop, the operations sum = sum + num % 10 and num = num / 10 are constant-time operations, independent of the size of num.

Therefore, the time complexity of the sumdigit method is O(log(num)).

So, the time complexity of the sumdigit method in this code is logarithmic O(logn).
*/