package module_3.task_3;


public class SpecialStudent extends CollegeStudent{
    private long secretKey;
    private String email;

    public SpecialStudent(String firstName, String lastName, int group, String collegeName) {
        super(firstName, lastName, group, collegeName);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken, int rating, String email) {
        super(lastName, coursesTaken, rating);
        this.email = email;
    }

    public SpecialStudent(String lastName, Course[] coursesTaken, long id, String email) {
        super(lastName, coursesTaken, id);
        this.email = email;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
