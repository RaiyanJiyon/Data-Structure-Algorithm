public class Test {
    public static String intToStr(int i) {
        String digits = "123456789";
        if (i == 0) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        while (i > 0) {
            result.insert(0, digits.charAt(i % 10)); // O(n)
            i = i / 10;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println(intToStr(number));
    }
}
