package javas.varages;

public class VaragesBasic {
    public static void main(String[] args) {
        printNumber(1, 2, 3, 4, 5);
        printNumber(1, 2, 3);
        printNumber();
    }
    public static void printNumber(int... numbers){
        for (int num : numbers){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
