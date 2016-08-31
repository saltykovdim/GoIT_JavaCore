package module_3.task_3;


import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Course first = new Course(new Date() , "first");
        System.out.println(first.getName());
        Student sex = new Student("Iva", "Ivanova", 3);
        System.out.println(sex.getGroup());
        Student seven = new SpecialStudent("Ivan", "Ivanov", 3, "GoIt");
        System.out.println(seven.getLastName());
        Student eight = new CollegeStudent("Irina", "Dydnik", 5, "GoIT");
        System.out.println(eight.getFirstName());


    }
}
