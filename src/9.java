import java.util.*;

public class GithubSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your roll number: ");
        int rollNumber = sc.nextInt();

        System.out.println("Hello, " + name + ". Your roll number is " + rollNumber);
    }
}
