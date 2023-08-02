package HashMap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

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
        System.out.println(map.values());
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
//        root.left.right.left = new Node(10);
//        root.left.right.right = new Node(14);

        bottomView(root);
    }
}
