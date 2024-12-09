package javas.Exception;

public class UnCheckedException {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        try {
            System.out.println(numbers[5]); //오류 : ArrayIndexOutOfBoundsException 에러
        }catch (ArrayIndexOutOfBoundsException e){
            /* 주요 Checked Exception Ex
                1. NullPointerException
                2. ArrayIndexOutOfBoundsException
                3. ArithmeticException (0으로 나누기같은)
                4. IllegalArgumentException
             */
            e.printStackTrace();
        }
    }
}
