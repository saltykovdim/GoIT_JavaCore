package module_10;


import com.sun.org.apache.xpath.internal.SourceTree;
import module_8.User;

public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("TASK 1.....");
        try {
            int a = 0;
            System.out.println(10 / a);
        } catch (ArithmeticException e) {
            System.out.println("You got an Arithmetic Exception.");
        } finally {
            System.out.println("Finally block is made.");
        }

        //task 2
        System.out.println();
        System.out.println("TASK 2....");
        try {
            String s = "hello";
            if (s.equals("hello")) {
                throw new MyException(s);
            } else {
                System.out.println("You not got your own Exception");
            }
        } catch (MyException e) {
            System.out.println("You got your own Exception.");
        }

        //task 3
        System.out.println();
        System.out.println("TASK 3....");
        try {
            User test = null;
            test.getName();
        } catch (NullPointerException e) {
            System.out.println("You must create a 'User'.");
        }

        //task 4
        System.out.println();
        System.out.println("TASK 4....");
        Test test = new Test();
        test.f();

        //task 5
        System.out.println();
        System.out.println("TASK 5....");
        try {
            ThrowMyException t = new ThrowMyException();
            t.throwException();
        } catch (MyExceptionThird e) {
            System.out.println("My exception third.");
        } catch (MyExceptionSecond e) {
            System.out.println("My exception second.");
        } catch (MyExceptionFirst e) {
            System.out.println("My exception first.");
        } catch (MyException e) {
            System.out.println("My exception.");
        }
    }
}
