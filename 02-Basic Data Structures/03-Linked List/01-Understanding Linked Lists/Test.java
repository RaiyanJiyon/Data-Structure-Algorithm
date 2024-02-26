import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {
        // Create a LinkedList to store student names
        LinkedList<String> student = new LinkedList<>();

        // Add student names to the LinkedList
        student.add("Raiyan Jiyon");
        student.add("Ishaq Ahammad Mondol");
        student.add("Tamim Zia");
        student.add("Sabbir Ahmed");
        student.add("Mahabub Alam");

        // Add a student at index 5 (6th position)
        student.add(5, "Ramjan Ali");

        // Add a student to the beginning of the LinkedList
        student.addFirst("Akash Chowdary");

        // Add a student to the end of the LinkedList
        student.addLast("Habib Khan");

        // Iterate through the LinkedList and print each student name
        for (String string : student) {
            System.out.println(string);
        }
    }
}
