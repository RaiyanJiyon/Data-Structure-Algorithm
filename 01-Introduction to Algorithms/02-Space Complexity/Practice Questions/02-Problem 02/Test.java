/*/*Write a program to reverse the given string*/
public class Test {
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(); // Space complexity: O(n)
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Reversed string: " + reverse(str));
    }
}

/*
Explanation: The space complexity of this program is O(n) because it uses a StringBuilder object (reversed) to store the reversed string. The space occupied by the StringBuilder object scales linearly with the size of the input string str.
*/