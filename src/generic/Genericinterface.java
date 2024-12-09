package generic;

interface Pair<K,V> {
     K getkey();
     V getvalue();
}

class KeyValuePair<K,V> implements Pair<K,V> {
    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getkey() {
        return key;
    }
    @Override
    public V getvalue() {
        return value;
    }
}

public class Genericinterface<T> {
    public static void main(String[] args) {
       Pair<String,Integer> pair = new KeyValuePair<String,Integer>("Age", 27);
       System.out.println("Key: " +pair.getkey());
       System.out.println("Value: " + pair.getvalue());
    }
}
