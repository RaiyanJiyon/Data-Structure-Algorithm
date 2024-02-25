/*
String manipulation involves performing various operations on strings, such as concatenation, substring extraction, searching within strings, replacing characters or substrings, and converting between string and other data types.
*/

public class Test {
    public static void main(String[] args) {
        // Concatenation
        String str1 = "Hello";
        String str2 = "World";
        String concatenatedStr = str1 + ", " + str2; // Using the + operator for concatenation
        System.out.println("Concatenated String: " + concatenatedStr);

        // Substring extraction
        String originalStr = "Programming";
        String subStr = originalStr.substring(3, 8); // Extract substring from index 3 to index 7 (exclusive)
        System.out.println("Substring: " + subStr);

        // Searching within strings
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean containsWord = sentence.contains("fox"); // Check if the string contains a specific word
        System.out.println("Contains 'fox': " + containsWord);

        // Replacing characters or substrings
        String stringWithReplace = "Hello, World!";
        String replacedString = stringWithReplace.replace("Hello", "Hi"); // Replace "Hello" with "Hi"
        System.out.println("Replaced String: " + replacedString);

        // Conversion between string and other data types
        String numberStr = "123";
        int num = Integer.parseInt(numberStr); // Convert string to integer
        System.out.println("Parsed Integer: " + num);

        int number = 456;
        String strFromNumber = String.valueOf(number); // Convert integer to string
        System.out.println("String from Integer: " + strFromNumber);
    }
}

