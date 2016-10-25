package module_10;


public class Main {
    public static void main(String[] args) throws MyException {
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
            String s= "hello";
            if (s.equals("hello")) {
                throw new MyException(s);
            }else{
                System.out.println("You not got your own Exception");
            }
        } catch (MyException e) {
            System.out.println("You got your own Exception.");
        }
    }
}
