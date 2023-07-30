import java.util.LinkedList;

public class HashMapImplementation {

    public static class HashMap<K, V> {
        public class Node {
            K key;
            V value;
            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size; // n
        private LinkedList<Node> bucket[]; // N

        @SuppressWarnings("UnChecked")
        public HashMap() {
            this.size = 0;
            this.bucket = new LinkedList[4];
            for (int i = 0; i < bucket.length; i++) {
                this.bucket[i] = new LinkedList<>();
            }
        }
    }


    public static void main(String[] args) {

    }
}
