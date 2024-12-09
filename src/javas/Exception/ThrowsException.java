package javas.Exception;

public class ThrowsException {
    public static void main(String[] args) throws Exception {
        riskyMethod();
    }

    public static void riskyMethod() throws Exception {
        throw new Exception("예외 발생");
    }
}
