package module_3.task_3;


public class SpecialStudent extends CollegeStudent{
    private long secretKey;
    private String email;

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialStudent(String firstName, String lastName, int group, Course[] coursesTaken, int age, String collegeName, int rating, long id, int age1, long secretKey) {
        super(firstName, lastName, group, coursesTaken, age, collegeName, rating, id, age1);
        this.secretKey = secretKey;
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
