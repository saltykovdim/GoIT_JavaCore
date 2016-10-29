package module_10;


public class ThrowMyException extends Throwable {

    public void throwException() throws MyException {
        f();
        throw new MyExceptionSecond();
    }

    public void f() throws MyException {
        throw new MyExceptionThird();
    }
}
