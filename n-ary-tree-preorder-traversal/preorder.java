import java.util.*;
import java.util.Scanner;

public class Main {
        static ListNode preorder(Node root) {
                // iterate solution, need to review Preorder DLR (root->left->right) concept 

                LinkedList<Node> stack = new LinkedList<>();
                LinkedList<Integer> output = new LinkedList<>();

                if (root == null) {
                        return output;
                }

                stack.add(root);
                while (!stack.isEmpty()) {
                        Node node = stack.pollLast();
                        output.add(node.val);
                        Collections.reverse(node.children);
                        for (Node item : node.children) {
                                stack.add(item);
                        }
                }
                return output;

        }

        public static void main(String[] args) {
                //run in leetcode online java ide
        };
}

// Definition for a Node.
class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
                val = _val;
        }

        public Node(int _val, List<Node> _children) {
                val = _val;
                children = _children;
        }
};
