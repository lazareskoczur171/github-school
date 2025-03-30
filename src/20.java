import java.util.Scanner;

public class SimpleGithubSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name:");
        String studentName = scanner.nextLine();

        System.out.println("Enter student age:");
        int studentAge = scanner.nextInt();
        
        if (studentAge > 18) {
            System.out.println(studentName + " is old enough to vote.");
        } else {
            System.out.println(studentName + " cannot vote.");
        }

        scanner.close();
    }
}
