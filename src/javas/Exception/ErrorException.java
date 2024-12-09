package javas.Exception;

public class ErrorException {
    public static void main(String[] args) {
        try{
            causeStackOverflowError(1);
        }catch (StackOverflowError e){
              /* 주요 Checked Exception Ex
                1. StackOverflowError
                2. OutOfMemoryError
                3. VirtualMachineError
             */
            e.printStackTrace();
        }
    }

    public static void causeStackOverflowError(int i){
        causeStackOverflowError(i);
    }
}
