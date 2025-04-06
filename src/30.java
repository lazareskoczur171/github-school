public class GitHubSchool {

    private String username;

    public GitHubSchool(String username) {
        this.username = username;
    }

    public void addStudent(Student student) {
        // Add student to the list of students
        System.out.println("Adding " + student.getName() + " as a student.");
    }
}
