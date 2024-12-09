package generic;

public class GenericMethod<T> {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] stringArray = {"Hello", "Generics", "World"};
        Integer[] intArray = {1, 2, 3, 4, 5};

        printArray(stringArray);
        printArray(intArray);
    }
}
