package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericWildcard<T> {
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("wildcard");

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        printList(stringList);
        printList(intList);
    }
}
