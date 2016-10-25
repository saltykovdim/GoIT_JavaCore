package module_10;


public class Main {
    public static void main(String[] args) {
        try {
            int a = 0;
            System.out.println(10/a);
        }catch (ArithmeticException e){
            System.out.println("You get an Arithmetic Exception.");
        }finally {
            System.out.println("Finally block is made.");
        }
    }
}
