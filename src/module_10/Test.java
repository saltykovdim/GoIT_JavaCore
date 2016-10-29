package module_10;


import com.sun.org.apache.xpath.internal.SourceTree;

public  class Test {
    public void f(){
        try {
            g();
        }catch (NullPointerException e){
            System.out.println("You got your Exception");
        }
    }
    public void g(){
        try {
            throw new MyException("s");
        } catch (MyException e) {
            System.out.println("You got your class MyException");
        }finally {
            throw new NullPointerException();
        }

    }
}
