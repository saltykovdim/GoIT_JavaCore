package module_3.task_3;


public class CollegeStudent extends Student{
    private String collegeName;
    private int rating;
    private long id;
    private int age;

    public CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }
    public CollegeStudent(String firstName, String lastName, int group, Course[] coursesTaken, int age, String collegeName, int rating, long id, int age1) {
        super(firstName, lastName, group, coursesTaken, age);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
        this.age = age1;
    }
}
