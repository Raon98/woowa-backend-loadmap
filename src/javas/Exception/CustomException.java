package javas.Exception;

class NewCustomException extends Exception {
    public NewCustomException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        try {
            validate(10);
        } catch (NewCustomException e) {
            e.printStackTrace();
        }
    }

    public static void validate(int number) throws NewCustomException {
        if (number < 20) {
            throw new NewCustomException("숫자가 20 미만입니다.");
        }
    }
}
