package HashMap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class BottomViewOfBT {

    public static class Node{
        Node left;
        Node right;
        int data;
        int height;

        public Node(int data) {
            this.left = null;
            this.right = null;
            this.data = data;
            this.height = 0;
        }

    }

    public static void bottomView(Node root) {
        if (root == null) {
            return;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.remove();
            int hd = temp.height;

            map.put(hd, temp.data);

            if (temp.left != null) {
                temp.left.height = hd-1;
                q.add(temp.left);
            }
            if (temp.right != null) {
                temp.right.height = hd+1;
                q.add(temp.right);
            }
        }
        TreeMap<Integer, Integer> sortedMap = new TreeMap<>(map);
        for (int value : sortedMap.values()) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        bottomView(root);
    }
}
