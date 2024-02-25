/*
String parsing involves breaking down a string into smaller components based on certain rules or delimiters. One common example is tokenization, where a string is split into individual words or tokens based on spaces or other characters.
*/

import java.util.StringTokenizer;

public class StringParsingExample {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence for string parsing.";

        // Using StringTokenizer to tokenize the sentence based on spaces
        StringTokenizer tokenizer = new StringTokenizer(sentence);

        // Iterating through each token and printing it
        System.out.println("Tokens obtained from the sentence:");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}

/*
Explanation:

* In this example, we have a sample sentence: "This is a sample sentence for string parsing."
* We want to tokenize this sentence into individual words.
* We use the StringTokenizer class provided by Java's standard library.
* The StringTokenizer class splits the string into tokens based on a specified delimiter (which is space by default).
* We create a StringTokenizer object named tokenizer and pass the sentence as an argument to its constructor.
* We then iterate through each token using the hasMoreTokens() method to check if there are more tokens left, and the nextToken() method to get the next token.
* Finally, we print each token obtained from the sentence.
*/