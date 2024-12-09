package javas.Exception;

public class ThrowException {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("18세 이상만 가능합니다.");
        }
    }
}
