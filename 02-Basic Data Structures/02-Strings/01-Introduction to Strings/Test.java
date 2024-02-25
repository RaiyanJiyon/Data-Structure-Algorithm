/*
 * Basics of Strings in Java:
 * In Java, strings are objects of the String class. They represent sequences of characters. Here are some key points about strings in Java:
 *
 * Strings are immutable, meaning once created, their values cannot be changed.
 *
 * Strings can be created using string literals or by using the new keyword and invoking the String constructor.
 *
 * Strings support various methods for performing operations such as concatenation, substring extraction, and length retrieval.
 */

 public class StringOperations {
    public static void main(String[] args) {
        // Declare and initialize two strings
        String firstString = "Hello";
        String secondString = "World";

        // Concatenate the two strings with a space in between
        String concatenatedString = firstString + " " + secondString;
        System.out.println("Concatenated String: " + concatenatedString);

        // Get the length of the concatenated string
        int length = concatenatedString.length();
        System.out.println("Length of the concatenated string: " + length);

        // Extract a substring from the concatenated string
        String extractedSubstring = concatenatedString.substring(6, 8);
        System.out.println("Extracted Substring: " + extractedSubstring);

        // Check if the concatenated string is equal to the extracted substring
        boolean isEqual = concatenatedString.equals(extractedSubstring);
        System.out.println("Are the concatenated string and the extracted substring equal? " + isEqual);
    }
}
