import java.util.ArrayList;
import java.util.Arrays;

public class SimpleGithubSchool {

    private static ArrayList<String> students = new ArrayList<>();

    public SimpleGithubSchool() {
        // Add your first student here
        students.add("Student 1");
        students.add("Student 2");

        // Add more students as needed

        System.out.println("Students:");
        for (String student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        SimpleGithubSchool example = new SimpleGithubSchool();
        example.students.clear(); // Clear the list to remove any previous data
        example.students.addAll(Arrays.asList("Student 3", "Student 4"));
        example.students.add("New Student");
        System.out.println("Updated Students:");
        for (String student : example.students) {
            System.out.println(student);
        }
    }

}
