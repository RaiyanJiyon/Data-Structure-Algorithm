/*
In Java, there are several methods available for comparing strings. Here are some common ones
*/

public class Test {
    public static void main(String[] args) {
        // Using the equals() method
        String str1 = "Hello";
        String str2 = "Hello";
        boolean isEqual = str1.equals(str2);
        System.out.println("Using equals(): " + isEqual); // Output: true
        
        // Using the compareTo() method
        String str3 = "apple";
        String str4 = "banana";
        int result = str3.compareTo(str4);
        System.out.println("Using compareTo(): " + result); // Output: Negative value
        
        // Using the equalsIgnoreCase() method
        String str5 = "HELLO";
        String str6 = "hello";
        boolean isEqualIgnoreCase = str5.equalsIgnoreCase(str6);
        System.out.println("Using equalsIgnoreCase(): " + isEqualIgnoreCase); // Output: true
    }
}
