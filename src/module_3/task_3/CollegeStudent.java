package module_3.task_3;


public class CollegeStudent extends Student{
    private String collegeName;
    private int rating;
    private long id;

    public CollegeStudent(String firstName, String lastName, int group, String collegeName) {
        super(firstName, lastName, group);
        this.collegeName = collegeName;
    }

    public CollegeStudent(String lastName, Course[] coursesTaken, int rating) {
        super(lastName, coursesTaken);
        this.rating = rating;
    }

    public CollegeStudent(String lastName, Course[] coursesTaken, long id) {
        super(lastName, coursesTaken);
        this.id = id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
