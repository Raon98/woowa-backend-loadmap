package varages;

public class GenericVarages {
    @SafeVarargs// Generic과 Varages를 함께 사용할때 경고를 억제시킴
    public static <T> void printArray(T... array) { // 경고 : Possible heap pollution from parameterized vararg type
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printArray("Hello","Generic","Varages");
    }
}
