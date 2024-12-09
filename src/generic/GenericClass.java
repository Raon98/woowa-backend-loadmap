package generic;

public class GenericClass<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public static void main(String[] args) {
        GenericClass<String> stringGeneric = new GenericClass<String>();
        stringGeneric.setItem("Hello, Generic");
        System.out.println(stringGeneric.getItem());

        GenericClass<Integer> integerGeneric = new GenericClass<Integer>();
        integerGeneric.setItem(1);
        System.out.println(integerGeneric.getItem());
    }
}
