package HashMap;

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

        private int n; // n
        private int N;
        private LinkedList<Node>[] bucket; // N

        @SuppressWarnings("UnChecked")
        public HashMap() {
            this.N = 4;
            this.bucket = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.bucket[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % bucket.length;
        }

        private int searchLL(K key, int bi) {
            LinkedList<Node> ll = bucket[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }
        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchLL(key, bi);

            if (di != -1) {
                Node node = bucket[bi].get(di);
                node.value = value;
            } else {
                boolean node = bucket[bi].add(new Node(key, value));
                n++;
            }
        }




    }


    public static void main(String[] args) {

    }
}
